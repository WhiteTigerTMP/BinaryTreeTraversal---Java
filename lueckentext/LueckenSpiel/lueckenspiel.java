import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 03.09.2020
 * @author 
 */

public class lueckenspiel extends JFrame {
  // Anfang Attribute
  private JLabel lLueckentextSpiel = new JLabel();
  private JTextField jTextField1 = new JTextField();
  private JButton bPruefen = new JButton();
  private JButton bErneuern = new JButton();
  // Ende Attribute
  
  public lueckenspiel() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 377; 
    int frameHeight = 199;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("lueckenspiel");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    lLueckentextSpiel.setBounds(64, 8, 246, 36);
    lLueckentextSpiel.setText("Lückentext Spiel");
    lLueckentextSpiel.setFont(new Font("Dialog", Font.BOLD, 24));
    lLueckentextSpiel.setHorizontalAlignment(SwingConstants.CENTER);
    lLueckentextSpiel.setHorizontalTextPosition(SwingConstants.CENTER);
    cp.add(lLueckentextSpiel);
    jTextField1.setBounds(24, 56, 321, 41);
    cp.add(jTextField1);
    bPruefen.setBounds(200, 112, 145, 41);
    bPruefen.setText("Prüfen");
    bPruefen.setMargin(new Insets(2, 2, 2, 2));
    bPruefen.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bPruefen_ActionPerformed(evt);
      }
    });
    cp.add(bPruefen);
    bErneuern.setBounds(24, 112, 145, 41);
    bErneuern.setText("Erneuern");
    bErneuern.setMargin(new Insets(2, 2, 2, 2));
    bErneuern.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bErneuern_ActionPerformed(evt);
      }
    });
    cp.add(bErneuern);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public lueckenspiel
  
  String[] var = new String[10];
  
  
  
  public static void main(String[] args) {
    new lueckenspiel();
    
    var[0] = "Regulierungsbehorde Ligurian reguliert in Ligurien.";
  } // end of main
  
  public void bPruefen_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
  } // end of bPruefen_ActionPerformed

  public void bErneuern_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
  } // end of bErneuern_ActionPerformed

  // Ende Methoden
} // end of class lueckenspiel

