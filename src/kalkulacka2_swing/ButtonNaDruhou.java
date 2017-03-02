package kalkulacka2_swing;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class ButtonNaDruhou extends ButtonCislo{

  public ButtonNaDruhou(JTextField tf, JFrame that, int ii) {
    super(tf, that, ii);
    super.setText("^2");
  }
  
  public void pushed(){
    System.out.printf("ButNaDruhou: ButtonCislo.number: %f\n", this.number);
    this.number = this.number * this.number;
    super.printToTextField();
  }

}
