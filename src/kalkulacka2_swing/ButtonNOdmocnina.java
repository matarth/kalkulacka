package kalkulacka2_swing;

import javax.swing.JFrame;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import java.math.*;

public class ButtonNOdmocnina extends ButtonCislo{
  Calc that;
  JSpinner jsp;
  public ButtonNOdmocnina(JTextField tf, Calc that, JSpinner spin) {
    super(tf, that, 0);
    super.setText("n-sqrt");
    this.that = that;
    this.jsp = spin;
  }
  
  public void pushed(){
    System.out.printf("ButNaDruhou: ButtonCislo.number: %f\n", this.number);
    this.number = (float) Math.pow((double) this.number, (double) 1/((Integer) this.jsp.getValue()));
    super.printToTextField();
  }

}
