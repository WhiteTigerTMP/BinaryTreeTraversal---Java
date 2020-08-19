import java.io.*;

public class Huffman{
  char[][] irrgarten;
  String dateiname;
  int breite, hoehe,startX, startY;
  
  public Huffman(){
    dateiname = "Irrgarten.txt";
    irrgarten = ladeIrrgarten();
    getStrings(0,0);
  }
  
  public void getStrings(int x, int y){   
    char newSign;
    int n = 0;
    int k = 0;
    for (int j = 0;j<11;j++ ) {
      for (int i = 0;i<11;i++) {
        if (irrgarten[x][y] == irrgarten[x+i][y+j]) {
          newSign = irrgarten[x][y];
          if (n == 0) {
            n++;
          }
          if (n == 1) {
            k++;
          }
        }
        else
        {
          n = 0;
          newSign = irrgarten[x+i][y+j];
          n++;
          if (newSign != ' ') {
            System.out.println(newSign + " is there of " + n + " times");
          }
        }
      }
    }
    System.out.println("# is there of " + k + " times");
    
  }
    
  public char[][] ladeIrrgarten(){
    File datei = new File(dateiname);
    String irrgartenString = "";
    try {
      FileReader reader = new FileReader(datei);
      BufferedReader puffer = new BufferedReader(reader);
      String s = puffer.readLine();
      while (s != null) {
        irrgartenString = irrgartenString + s + "\n";               // erst mal alles Komma-getrennt in einen String
        s = puffer.readLine();
      }
      reader.close();
    } catch (IOException e) {
      System.err.println(e.toString());
    }
    
    String[] zeilen = irrgartenString.split("\n");     // dann in einzelne Zeilen aufteilen
    hoehe = zeilen.length;                             // Höhe = Anzahl der Zeilen
    breite = zeilen[0].length();                       // Breite = Länge einer Zeile
    char[][] feld = new char[breite][hoehe];                    // und dann alle Felder setzen
    for (int y = 0; y < hoehe; y++) {
      for (int x = 0; x < zeilen[y].length(); x++) {
        char c = zeilen[y].charAt(x);
        feld[x][y] = c;
      }
    }
    return feld;
  }
  
  public static void main(String[] args){
    new Huffman();
  } 
}
  