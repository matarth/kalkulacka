package kalkulacka2_swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.event.AncestorListener;

public class Calc extends JFrame{
  
  
  public Calc(){  
    
    UIManager.put("windowText", Color.blue);
   // UIManager.put("Button.background", Color.blue);
    
    
    JPanel p = new JPanel();
    JPanel p2 = new JPanel();
    ButtonGroup skinChanger = new ButtonGroup();
    JTextField tf = new JTextField();
    ButtonPlus plus = new ButtonPlus(tf, this);
    ButtonKrat krat = new ButtonKrat(tf, this);
    ButtonMinus minus = new ButtonMinus(tf, this);
    ButtonDeleno deleno = new ButtonDeleno(tf, this); 
    ButtonRovnase rovnase = new ButtonRovnase(tf, this);
    ButtonC clearAll = new ButtonC(tf, this);
    ButtonOdmocnina odmocnina = new ButtonOdmocnina(tf, this, 0);
    ButtonNaDruhou mocnina = new ButtonNaDruhou(tf, this, 0);
    ButtonObracenaHodnota obrHodnota = new ButtonObracenaHodnota(tf, this, 0);
    ButtonDecimalPoint desetinaTecka = new ButtonDecimalPoint(tf, this);
    JSpinner spin = new JSpinner();
    ButtonNMocnina nMocnina = new ButtonNMocnina(tf, this, spin);
    ButtonNOdmocnina nOdmocnina = new ButtonNOdmocnina(tf, this, spin);
    ButtonMP memory = new ButtonMP(tf, this, 0);
    ButtonMR memrecall = new ButtonMR(tf, this, 0);
    Skin1 skin1 = new Skin1("Skin1", this);
    Skin2 skin2 = new Skin2("Skin2", this);
    Skin3 skin3 = new Skin3("Skin3", this);
    ButtonGroup buttonGroup= new ButtonGroup();
    CheckBox checkBox = new CheckBox(p2, this);
    
    buttonGroup.add(skin1);
    buttonGroup.add(skin2);
    buttonGroup.add(skin3);
    
    
    p.setLayout(new GridLayout(4,3));
    p.setBounds(0,0,400,400);
    
    
    p2.setLayout(new GridLayout(3,3));
    p2.setVisible(false);
           
    
    this.setBounds(0, 0, 700, 400);
    this.setVisible(true);
    this.setWindowClose();
    
    this.add(p2, BorderLayout.EAST);
    this.add(p, BorderLayout.WEST);
    
    this.add(tf, BorderLayout.SOUTH);
    tf.setVisible(true);
    this.pridejCisla(tf, p);
    p.add(krat); 
    p.add(plus);    
    p.add(minus);
    p.add(deleno);
    p.add(rovnase);
    p.add(clearAll);
    p2.add(mocnina);
    p.add(obrHodnota); 
    p2.add(odmocnina);
    p2.add(spin);
    p2.add(nMocnina);
    p2.add(nOdmocnina);
    p2.add(desetinaTecka); 
    p2.add(memory);
    p2.add(memrecall);
    p.add(skin1);
    p.add(skin2);
    p.add(skin3);
    p.add(checkBox);
    
    
    
  }
  
  public void pridejCisla(JTextField tf, JPanel p){
    int ii;
    ButtonCislo[] b = new ButtonCislo[10];
    for(ii = 0; ii < 10; ii++){
     b[ii] = new ButtonCislo(tf, this, ii);
     p.add(b[ii]); 
    }
  }
    
  public void setWindowClose(){
    this.addWindowListener(
        new WindowAdapter(){
          public void windowClosing(WindowEvent e){
            System.exit(0);
          }
       }
    );
    
  }
}
