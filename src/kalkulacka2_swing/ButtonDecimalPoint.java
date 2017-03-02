package kalkulacka2_swing;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class ButtonDecimalPoint extends ButtonZnamenko{

  ButtonDecimalPoint(JTextField tf, JFrame that) {
    super(tf, that);
  }

  @Override
  void pushed() {
    ButtonCislo.desetinyStupen = 1;
  }

  @Override
  void setText() {
    this.setText(".");    
  }

}
