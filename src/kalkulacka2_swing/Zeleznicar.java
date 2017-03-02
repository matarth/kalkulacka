package kalkulacka2_swing;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Zeleznicar {
  String vyraz;
  Queue<String> postfix = new LinkedList<String>();
  
  public Zeleznicar(String s){
    this.vyraz = s;
    this.vyraz = this.vyraz.substring(1, this.vyraz.length()-1); // oreze mezery na zacatku a na konci
  }
  
  public boolean jeOperator(String ss){
    
    if(ss == null)
      return(false);
    
    if(ss.length() != 1)
      return(false);
    
    if(ss.charAt(0) >= '0' && ss.charAt(0) <= '9')
      return(false);
    
    return(true);
  }
  
  public void parse(){
    int ii;
    
    String[] ss;
    Stack<String> znamenka = new Stack<String>();
    
    ss = this.vyraz.split(" ");
    
    System.out.printf("%s\n", Arrays.toString(ss));
    
    for(ii = 0; ii < ss.length; ii++){
      if(ss[ii].isEmpty())
        ii++;
      if(this.jeOperator(ss[ii])){
        if(ss[ii].equals("+") || ss[ii].equals("-")){
          while(!znamenka.isEmpty()){
            this.postfix.add(znamenka.pop());
          }
          znamenka.push(ss[ii]);
        }
        if(ss[ii].equals("*") || ss[ii].equals("/")){
          while(!znamenka.isEmpty() && !(znamenka.peek().equals("+") || znamenka.peek().equals("-"))){
            this.postfix.add(znamenka.pop());
          }
          znamenka.push(ss[ii]);
        }
        
      }
      else{
        this.postfix.add(ss[ii]);
      }
    }
    while(!znamenka.isEmpty())
      this.postfix.add(znamenka.pop());
    System.out.printf("POSTFIX: %s\n", Arrays.toString(this.postfix.toArray()));
    
  }

  public float vyhodnot(){
    int ii;
    float a,b;
    Stack<Float> stack = new Stack<Float>();
    
    while(!this.postfix.isEmpty()){
      if(this.jeOperator(this.postfix.peek())){
        if(this.postfix.peek().equals("+")){
          stack.push(stack.pop()+stack.pop());
        }
        if(this.postfix.peek().equals("-")){
          a = stack.pop();
          b = stack.pop();
          stack.push(b-a);
        }
        if(this.postfix.peek().equals("*")){
          stack.push(stack.pop()*stack.pop());
        }
        if(this.postfix.peek().equals("/")){
          a = stack.pop();
          b = stack.pop();
          stack.push(b/a);
        }
        this.postfix.poll();
      }
      else{
        stack.push(Float.parseFloat(this.postfix.poll()));
      }
      System.out.printf("%s\n", Arrays.toString(stack.toArray()));
    }
    
    System.out.printf("VYSLEDEK: %f\n", stack.peek());
    return(stack.pop()); 
  }
}
