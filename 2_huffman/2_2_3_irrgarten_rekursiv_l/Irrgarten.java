import java.io.*;

public class Irrgarten{
  char[][] irrgarten;
  int breite, hoehe,startX, startY;
  String dateiname;
  public Irrgarten(){
    dateiname = "Irrgarten.txt";
    irrgarten = ladeIrrgarten();
    zeigeIrrgarten(irrgarten);
    findeStartposition();
    System.out.println(findeWegRekursiv(startX,startY));
    zeigeIrrgarten(irrgarten);
  }
  
  public boolean findeWegRekursiv(int x, int y){    
    if (irrgarten[x][y] == 'Z') {
      return true;
    } else {
      if (irrgarten[x][y] == ' ' || irrgarten[x][y] == 'S') {
        irrgarten[x][y] = '*';
        if (x < breite-1 && findeWegRekursiv(x+1,y))
          return true;
        if ( y > 0 && findeWegRekursiv(x,y-1))
          return true;
        if (x > 0 && findeWegRekursiv(x-1,y))
          return true;
        if (y < hoehe -1 && findeWegRekursiv(x,y+1))
          return true;
        return false;
      } else {
        return false;
      }
    }
  }
     
  public void findeStartposition() {
    for (int x = 0; x < breite; x++) {
      for (int y = 0; y < hoehe; y++) {
        if (irrgarten[x][y] == 'S') {
          startX = x; startY = y;
        }
      }
    }
  }
  
  public void zeigeIrrgarten(char[][] pGarten){
    for (int i = 0;i<pGarten.length ;i++ ) {
      for (int j = 0;j<pGarten[i].length ;j++ ) {
        System.out.print(pGarten[j][i]);
      }
      System.out.println();
    }
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
    hoehe = zeilen.length;                             // H�he = Anzahl der Zeilen
    breite = zeilen[0].length();                       // Breite = L�nge einer Zeile
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
    new Irrgarten();
  }                 
}

