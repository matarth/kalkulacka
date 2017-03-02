package kalkulacka2_swing;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class Skin3 extends SkinChanger{
  Calc calc;
  public Skin3(String s, Calc that) {
    super(s, that);
    this.calc = that;
  }

  @Override
  void pushed() {
    UIManager.put("Button.background", Color.white);
    UIManager.put("RadioButton.background", Color.LIGHT_GRAY);
    UIManager.put("TextField.background", Color.LIGHT_GRAY);
    UIManager.put("Button.foreground", Color.BLUE);
    calc.getContentPane().setBackground(Color.LIGHT_GRAY);
    SwingUtilities.updateComponentTreeUI(calc);
  }

}
