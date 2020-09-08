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
  private JTextField jTextField2 = new JTextField();
  // Ende Attribute
  
  public lueckenspiel() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 526; 
    int frameHeight = 234;
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
    
    lLueckentextSpiel.setBounds(152, 8, 246, 36);
    lLueckentextSpiel.setText("L�ckentext Spiel");
    lLueckentextSpiel.setFont(new Font("Dialog", Font.BOLD, 24));
    lLueckentextSpiel.setHorizontalAlignment(SwingConstants.CENTER);
    lLueckentextSpiel.setHorizontalTextPosition(SwingConstants.CENTER);
    cp.add(lLueckentextSpiel);
    jTextField1.setBounds(8, 48, 505, 41);
    jTextField1.setEditable(false);
    cp.add(jTextField1);
    bPruefen.setBounds(264, 160, 249, 41);
    bPruefen.setText("Pr�fen");
    bPruefen.setMargin(new Insets(2, 2, 2, 2));
    bPruefen.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bPruefen_ActionPerformed(evt);
      }
    });
    cp.add(bPruefen);
    bErneuern.setBounds(8, 160, 249, 41);
    bErneuern.setText("Erneuern");
    bErneuern.setMargin(new Insets(2, 2, 2, 2));
    bErneuern.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bErneuern_ActionPerformed(evt);
      }
    });
    cp.add(bErneuern);
    jTextField2.setBounds(8, 104, 505, 41);
    cp.add(jTextField2);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public lueckenspiel
  
  String[] var = new String[8];
  String randomSentence;
  
  
  public static void main(String[] args) {
    new lueckenspiel();
    
    
  } // end of main
  
  
  public void bPruefen_ActionPerformed(ActionEvent evt) {
    String checkSentence = jTextField2.getText();
    if (randomSentence.equals(checkSentence)){
      bPruefen.setBackground(Color.GREEN);
    } else {
      bPruefen.setBackground(Color.red);
    } // end of if-else
    System.out.println(checkSentence);
    
    
    
  } // end of bPruefen_ActionPerformed

  public void bErneuern_ActionPerformed(ActionEvent evt) {
    var[0] = "Regulierungsbehorde Ligurian reguliert in Ligurien.";
    var[1] = "Was ist gr�n und l�uft durch den Wald? Ein Gurkennebel.";
    var[2] = "Tom and Jerry";
    var[3] = "Always look on the bright side of the life!";
    var[4] = "Angriff ist die beste Verteidigung.";
    var[5] = "L�ckentext Spiel";
    var[6] = "Tokyo";
    var[7] = "Berlin";
    
    randomSentence = var[(int)(Math.random()*var.length)];
    String guessSentence = " ";
    
    for (char c : randomSentence.toCharArray() ) {
      int lucky = (int)(Math.random()*2);
      if(c != 32){
        if (lucky == 1){
          guessSentence += "*";
        }
        else{
          guessSentence += c;
        }
      } else {
        guessSentence += " ";
        } 
    }
    
    jTextField1.setText(guessSentence);
  } // end of bErneuern_ActionPerformed

  // Ende Methoden
} // end of class lueckenspiel
