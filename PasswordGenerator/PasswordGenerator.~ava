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

public class PasswordGenerator extends JFrame {
  // Anfang Attribute
  private JLabel Generateanewpassword = new JLabel();
  private JRadioButton rbSymbols = new JRadioButton();
  private JRadioButton rbNumbers = new JRadioButton();
  private JRadioButton rbLetters = new JRadioButton();
  private JButton bGenerate = new JButton();
  private JTextField jTextField1 = new JTextField();
  private JButton bClear = new JButton();
  private JButton bCopy = new JButton();
  private JNumberField nf10 = new JNumberField();
  private JLabel lNumberofcharacters = new JLabel();
  // Ende Attribute
  
  public PasswordGenerator() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 289; 
    int frameHeight = 198;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("PasswordGenerator");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    Generateanewpassword.setBounds(8, 8, 161, 20);
    Generateanewpassword.setText("bGenerate a new password");
    cp.add(Generateanewpassword);
    rbSymbols.setBounds(8, 25, 81, 39);
    rbSymbols.setOpaque(false);
    rbSymbols.setSelected(true);
    rbSymbols.setText("Symbols");
    cp.add(rbSymbols);
    rbNumbers.setBounds(96, 32, 100, 28);
    rbNumbers.setOpaque(false);
    rbNumbers.setSelected(true);
    rbNumbers.setText("Numbers");
    cp.add(rbNumbers);
    rbLetters.setBounds(192, 32, 100, 28);
    rbLetters.setOpaque(false);
    rbLetters.setSelected(true);
    rbLetters.setText("Letters");
    cp.add(rbLetters);
    bGenerate.setBounds(192, 64, 75, 25);
    bGenerate.setText("Generate");
    bGenerate.setMargin(new Insets(2, 2, 2, 2));
    bGenerate.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bGenerate_ActionPerformed(evt);
      }
    });
    cp.add(bGenerate);
    jTextField1.setBounds(8, 96, 265, 33);
    cp.add(jTextField1);
    bClear.setBounds(8, 136, 129, 25);
    bClear.setText("Clear");
    bClear.setMargin(new Insets(2, 2, 2, 2));
    bClear.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bClear_ActionPerformed(evt);
      }
    });
    cp.add(bClear);
    bCopy.setBounds(144, 136, 129, 25);
    bCopy.setText("Copy");
    bCopy.setMargin(new Insets(2, 2, 2, 2));
    bCopy.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bCopy_ActionPerformed(evt);
      }
    });
    cp.add(bCopy);
    nf10.setBounds(144, 64, 41, 25);
    nf10.setText("10");
    cp.add(nf10);
    lNumberofcharacters.setBounds(8, 64, 129, 20);
    lNumberofcharacters.setText("Number of characters");
    cp.add(lNumberofcharacters);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public PasswordGenerator
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new PasswordGenerator();
  } // end of main
  
  public void bGenerate_ActionPerformed(ActionEvent evt) {
    int a = nf10.getInt();
    String pass = " ";
    
    String[] values = new String[256];
    for (int i=1; i<256; i++){
      char temp = (char)i;
      values[i] = String.valueOf(temp);
    }
    
    if (rbSymbols.isSelected() && rbNumbers.isSelected() && rbLetters.isSelected()){
      for (int i = 0; i < nf10.getInt() ; i++) {
        int g = (int)(Math.random()*256);
        if (g != 0)  {
          pass = " " + values[g];
          jTextField1.setText(jTextField1.getText() + pass); 
        }
      } // end of for
      
    }
    
      else if (rbLetters.isSelected() && rbNumbers.isSelected()){
        for (int i = 0; i < nf10.getInt() ; i++) {
          int g = (int)(Math.random()*256);
          if (g != 0 && g != 33 && g != 34 && g != 64 && g != 35 && g != 36 && g != 37 && g != 38 && g != 39 && g != 40 && g != 41 && g != 42 && g != 43 && g != 44 && g != 45 && g != 46 && g != 47 && g != 58 && g != 59 && g != 60 && g != 61 && g != 62 && g != 63 && g != 91 && g != 92 && g != 93 && g != 94 && g != 95 && g != 123 && g != 124 && g != 125 && g != 126 && g != 127 && g != 155 && g != 156 && g != 157 && g != 158 && g != 159 && g != 166 && g != 167 && g != 168 && g != 169 && g != 170 && g != 171 && g != 172 && g != 174 && g != 175 && g != 176 && g != 177 && g != 178 && g != 179 && g != 180 && g != 181 && g != 182 && g != 183 && g != 184 && g != 185 && g != 186 && g != 187 && g != 188 && g != 189 && g != 190 && g != 191 && g != 192 && g != 193 && g != 194 && g != 195 && g != 196 && g != 197 && g != 200 && g != 201 && g != 202 && g != 203 && g != 204 && g != 205 && g != 206 && g != 207 && g != 209 && g != 213 && g != 217 && g != 218 && g != 219 && g != 220 && g != 221 && g != 223 && 
          g != 225 && g != 230 && g != 232 && g != 231 && g != 237 && g != 239 && g != 240 && g != 241 && g != 242 && g != 243 && g != 244 && g != 245 && g != 246 && g != 247 && g != 248 && g != 249 && g != 250 && g != 251 && g != 252 && g != 253 && g != 254 && g != 255)  {
            pass = " " + values[g];
            jTextField1.setText(jTextField1.getText() + pass); 
          }
        } // end of for
      } // end of if-else
    
  } // end of bGenerate_ActionPerformed

  public void bClear_ActionPerformed(ActionEvent evt) {
    jTextField1.setText("");  
  } // end of bClear_ActionPerformed

  public void bCopy_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
  } // end of bCopy_ActionPerformed

  // Ende Methoden
} // end of class PasswordGenerator

