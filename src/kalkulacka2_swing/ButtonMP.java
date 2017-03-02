package kalkulacka2_swing;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class ButtonMP extends ButtonCislo{

  public ButtonMP(JTextField tf, JFrame that, int ii) {
    super(tf, that, 0);
    super.setText("M");
  }
  
  
  
  public void pushed(){
    Zeleznicar z = new Zeleznicar(this.tf.getText());
    z.parse();
    this.memory = z.vyhodnot();
  }

}
