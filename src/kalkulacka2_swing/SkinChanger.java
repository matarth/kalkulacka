package kalkulacka2_swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JRadioButton;

public abstract class SkinChanger extends JRadioButton{
  
  public SkinChanger(String s, JFrame that){
    this.setText(s);
    this.setVisible(true);
    this.addMActionListener();
  }
  
  abstract void pushed();
  
  public void addMActionListener(){
    this.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent arg0) {
        pushed();        
      }
        
    });
  }

}
