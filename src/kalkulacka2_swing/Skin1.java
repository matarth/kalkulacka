package kalkulacka2_swing;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class Skin1 extends SkinChanger{
  Calc calc;
  public Skin1(String s, Calc that) {
    super(s, that);
    this.calc = that;
  }

  @Override
  void pushed() {
    UIManager.put("Button.background", Color.magenta);
    UIManager.put("Button.foreground", Color.yellow);
    UIManager.put("RadioButton.background", Color.magenta);
    UIManager.put("TextField.background", Color.magenta);
    calc.setBackground(Color.pink); 
    calc.getContentPane().setBackground(Color.pink);
    SwingUtilities.updateComponentTreeUI(calc);
  }

}
