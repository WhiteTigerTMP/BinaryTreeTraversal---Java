import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 09.09.2020
 * @author 
 */

public class lueckenspielsolver extends JFrame {
  // Anfang Attribute
  private JTextField jTextField1 = new JTextField();
  private JTextField jTextField2 = new JTextField();
  private JButton jButton1 = new JButton();
  // Ende Attribute
  
  public lueckenspielsolver() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 499; 
    int frameHeight = 145;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("lueckenspielsolver");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    jTextField1.setBounds(16, 16, 137, 25);
    cp.add(jTextField1);
    jTextField2.setBounds(16, 56, 465, 49);
    cp.add(jTextField2);
    jButton1.setBounds(160, 16, 321, 25);
    jButton1.setText("jButton1");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
      }
    });
    cp.add(jButton1);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public lueckenspielsolver
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new lueckenspielsolver();
  } // end of main
  
  public void jButton1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
  } // end of jButton1_ActionPerformed

  // Ende Methoden
} // end of class lueckenspielsolver                                      https://bwinf.de/bundeswettbewerb/39/

