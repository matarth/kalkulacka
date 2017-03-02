package kalkulacka2_swing;

import java.util.Locale;

import javax.swing.JFrame;
import javax.swing.JTextField;

class ButtonRovnase extends ButtonZnamenko{
  Calc that;

  ButtonRovnase(JTextField tf, Calc that) {
    super(tf, that);
    this.that = that;
  }

  @Override
  void pushed() {
    float a;
    Zeleznicar z = new Zeleznicar(this.tf.getText());
    z.parse();
    a = z.vyhodnot();
    this.tf.setText(String.format(Locale.ENGLISH, " %.2f ", a));
    ButtonCislo.tfText = String.format(Locale.ENGLISH, "");
    System.out.printf("ButRovnase: ButtonCislo.number: %f\n", a);
    ButtonCislo.setNumber(a);
  }

  @Override
  void setText() {
    this.setText("="); 
  }

}
