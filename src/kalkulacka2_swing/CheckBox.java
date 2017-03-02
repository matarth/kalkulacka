package kalkulacka2_swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JPanel;

public class CheckBox extends JCheckBox{
  JPanel pp;
  Calc cc;
  public CheckBox(JPanel p, Calc c){
    this.pp = p;
    this.cc = c;
    this.setText("Rozsireni");
    this.addMActionListener();
  }
  
  public void addMActionListener(){
    this.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e) {
        if(pp.isVisible()){
          pp.setVisible(false);
          cc.setBounds(0, 0, 700, 400);
        }
        else{
          pp.setVisible(true);
          cc.setBounds(0, 0, 1200, 400);
        }
      }
      
    });
  }

}
