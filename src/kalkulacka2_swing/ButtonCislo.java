package kalkulacka2_swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ButtonCislo extends JButton{
  static float number;
  int captionNum;
  JTextField tf;
  static String tfText;
  static boolean znamenko;
  static int desetinyStupen;
  static float memory;
  
  
  public ButtonCislo(JTextField tf, JFrame that, int ii){
    this.setVisible(true);
    this.addMActionListener();
    this.setText(String.format("%d", ii));
    this.captionNum = ii;
    this.tf = tf;
    this.tfText = tf.getText();
  }
  
  
   
  public void pushed(){
    // tfText se meni jen kdyz bylo zmacknuty znamynko. Jinak by tam naskakovali cisla navic
    System.out.printf("ButCislo: ButtonCislo.number: %f\n", ButtonCislo.number);
    if(this.znamenko){
      this.tfText = this.tf.getText();
      this.znamenko = false;
    }
   
    if(this.desetinyStupen == 0)
      this.number = this.number * 10 +  this.captionNum;
    else{
      this.number = this.number + (float) this.captionNum/(this.desetinyStupen*10);
      this.desetinyStupen*=10;
    }
    
    this.printToTextField();
  }
  
  public void printToTextField(){
    this.tf.setText(String.format(Locale.ENGLISH, "%s %.2f ", this.tfText, this.number));
  }
  
  
  
  void addMActionListener() {
    this.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e) {  
        pushed();
      }      
    });
    
  }
  
  public static void setNumber(float num){
    number = num;
  }
  
  public static void zero(){
    number = 0;
  }

}
