package kalkulacka2_swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

abstract class ButtonZnamenko extends JButton{
  JTextField tf;
  
  ButtonZnamenko(JTextField tf, JFrame that){
    this.tf = tf;
    this.addMActionListener();
    this.setText();
    this.setVisible(true);
  }
  
  abstract void pushed();
  abstract void setText();
  
  void zeroNPush(){
    this.pushed();
    if(!this.getClass().toString().equals(new String("class kalkulacka2_swing.ButtonDecimalPoint")) &&
        !this.getClass().toString().equals(new String("class kalkulacka2_swing.ButtonRovnase"))){
      ButtonCislo.zero();
      ButtonCislo.znamenko = true;
      ButtonCislo.desetinyStupen = 0;
    }
    
  }
    
  void addMActionListener() {
    this.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e) {
        zeroNPush();        
      }
      
    });
    
  }
}
