package kalkulacka2_swing;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class Skin2 extends SkinChanger{
  Calc calc;
  public Skin2(String s, Calc that) {
    super(s, that);
    this.calc = that;
  }

  @Override
  void pushed() {
    UIManager.put("Button.background", Color.DARK_GRAY);
    UIManager.put("RadioButton.background", Color.DARK_GRAY);
    UIManager.put("TextField.background", Color.DARK_GRAY);
    UIManager.put("Button.foreground", new Color(60,255,100));
    UIManager.put("TextField.foreground", new Color(60,255,100));
    UIManager.put("textText", Color.white); 
    calc.getContentPane().setBackground(Color.black);
    SwingUtilities.updateComponentTreeUI(calc);
  }

}
