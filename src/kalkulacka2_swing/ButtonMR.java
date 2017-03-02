package kalkulacka2_swing;

import java.util.Locale;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class ButtonMR extends ButtonCislo{

  public ButtonMR(JTextField tf, JFrame that, int ii) {
    super(tf, that, ii);
    super.setText("MR");
  }
  
  public void pushed(){
    this.tf.setText(String.format(Locale.ENGLISH, " %.2f ", ButtonCislo.memory));
    ButtonCislo.tfText = String.format(Locale.ENGLISH, "");
    System.out.printf("ButRovnase: ButtonCislo.number: %f\n", ButtonCislo.memory);
    ButtonCislo.setNumber(ButtonCislo.memory);
  }

}
