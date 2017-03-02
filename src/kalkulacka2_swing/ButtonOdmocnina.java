package kalkulacka2_swing;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.math.*;

public class ButtonOdmocnina extends ButtonCislo{

  public ButtonOdmocnina(JTextField tf, JFrame that, int ii) {
    super(tf, that, ii);
    super.setText("sqrt");
  }
  
  public void pushed(){
    System.out.printf("ButNaDruhou: ButtonCislo.number: %f\n", this.number);
    this.number = (float) Math.sqrt(this.number);
    super.printToTextField();
  }

}
