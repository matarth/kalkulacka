package kalkulacka2_swing;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class ButtonC extends ButtonZnamenko{

  ButtonC(JTextField tf, JFrame that) {
    super(tf, that);
  }

  @Override
  void pushed() {
    this.tf.setText(""); 
  }

  @Override
  void setText() {
    this.setText("C");    
  }

}
