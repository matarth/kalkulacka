package kalkulacka2_swing;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class ButtonDeleno extends ButtonZnamenko{

  ButtonDeleno(JTextField tf, JFrame that) {
    super(tf, that);
  }

  @Override
  void pushed() {
    String s;
    s = String.format("%s/", this.tf.getText());
    tf.setText(s);        
  }

  @Override
  void setText() {
    this.setText("/");    
  }

}
