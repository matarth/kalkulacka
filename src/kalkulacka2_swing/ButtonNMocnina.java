package kalkulacka2_swing;

import javax.swing.JFrame;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import java.math.*;

public class ButtonNMocnina extends ButtonCislo{
  Calc that;
  JSpinner jsp;
  public ButtonNMocnina(JTextField tf, Calc that, JSpinner spin) {
    super(tf, that, 0);
    super.setText("^n");
    this.that = that;
    this.jsp = spin;
  }
  
  public void pushed(){
    System.out.printf("ButNaDruhou: ButtonCislo.number: %f\n", this.number);
    this.number = (float) Math.pow((double) this.number, (Integer) this.jsp.getValue());
    super.printToTextField();
  }

}
