package kalkulacka2_swing;

import java.util.Locale;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class ButtonObracenaHodnota extends ButtonCislo {

  public ButtonObracenaHodnota(JTextField tf, JFrame that, int ii) {
    super(tf, that, ii);
    super.setText("-n");
  }
  
  public void pushed(){
    this.number = - this.number;
    this.tf.setText(String.format(Locale.ENGLISH, "%s %.2f ", this.tfText, this.number));
  }

}
