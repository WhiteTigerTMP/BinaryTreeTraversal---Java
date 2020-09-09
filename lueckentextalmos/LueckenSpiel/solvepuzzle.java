import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 09.09.2020
 * @author 
 */

public class solvepuzzle extends JFrame {
  // Anfang Attribute
  private JComboBox<String> jComboBox1 = new JComboBox<String>();
  private DefaultComboBoxModel<String> jComboBox1Model = new DefaultComboBoxModel<String>();
  private JLabel lSelectanopenedwindow = new JLabel();
  private JButton bSolveThePuzzle = new JButton();
  private JTextField jTextField1 = new JTextField();
  // Ende Attribute
  
  public solvepuzzle() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 512; 
    int frameHeight = 197;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("solvepuzzle");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    jComboBox1.setModel(jComboBox1Model);
    jComboBox1.setBounds(160, 16, 337, 25);
    cp.add(jComboBox1);
    lSelectanopenedwindow.setBounds(8, 16, 149, 20);
    lSelectanopenedwindow.setText("Select an opened window");
    cp.add(lSelectanopenedwindow);
    bSolveThePuzzle.setBounds(144, 56, 225, 41);
    bSolveThePuzzle.setText("Solve The Puzzle");
    bSolveThePuzzle.setMargin(new Insets(2, 2, 2, 2));
    bSolveThePuzzle.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bSolveThePuzzle_ActionPerformed(evt);
      }
    });
    cp.add(bSolveThePuzzle);
    jTextField1.setBounds(8, 112, 489, 49);
    jTextField1.setEditable(false);
    cp.add(jTextField1);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public solvepuzzle
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new solvepuzzle();
    getListOfWindows();
  } // end of main
  
  public static void getListOfWindows(){
    try {
      String line;
      Process p = Runtime.getRuntime().exec(System.getenv("windir") +"\\system32\\"+"tasklist.exe");
      BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
      while ((line = input.readLine()) != null) {
        System.out.println(line);
      }
      input.close();
    } catch (Exception err) {
      err.printStackTrace();
    }
  }
  
  public void bSolveThePuzzle_ActionPerformed(ActionEvent evt) {
    
    
    
  } // end of bSolveThePuzzle_ActionPerformed

  // Ende Methoden
} // end of class solvepuzzle

