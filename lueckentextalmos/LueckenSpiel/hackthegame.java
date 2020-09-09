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

public class hackthegame extends JFrame {
  // Anfang Attribute
  private JTextField jTextField1 = new JTextField();
  // Ende Attribute
  
  public hackthegame() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 490; 
    int frameHeight = 198;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("hackthegame");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    bSolveThePuzzle.setBounds(160, 56, 169, 41);
    bSolveThePuzzle.setText("Solve The Puzzle");
    lSelectaopenedwindow.setBounds(8, 16, 142, 28);
    jTextField1.setBounds(8, 112, 465, 49);
    jTextField1.setEditable(false);
    cp.add(jTextField1);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public hackthegame
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new hackthegame();
  } // end of main
  
  // Ende Methoden
} // end of class hackthegame

