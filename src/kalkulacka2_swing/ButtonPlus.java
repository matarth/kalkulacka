package kalkulacka2_swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ButtonPlus extends ButtonZnamenko{
  
  ButtonPlus(JTextField tf, JFrame that) {
    super(tf, that);
  }
  
  public void pushed() {
    String s;
    s = String.format("%s+", this.tf.getText());
    tf.setText(s);
  }
  
  void setText() {
    this.setText("+");    
  }

}
