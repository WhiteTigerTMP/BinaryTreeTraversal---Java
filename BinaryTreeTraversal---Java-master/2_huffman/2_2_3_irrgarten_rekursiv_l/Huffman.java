import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Huffman{
  char[][] irrgarten;
  String dateiname;   
  String strlast;
  int breite, hoehe,startX, startY;
  
  public Huffman(){
    dateiname = "Irrgarten.txt";
    irrgarten = ladeIrrgarten();
    getListOfCharacters();
  }
  
  
  public ArrayList getListOfCharacters(){
    
    ArrayList<String> alist = new ArrayList<String>();
    int a = 0; 
    
    for (int x = 0; x<irrgarten.length;x++) {
      for (int y = 0;y<irrgarten.length;y++){
        if (irrgarten[x][y] != ' '){
          String str = String.valueOf(irrgarten[x][y]);
          for (char newSign : str.toCharArray()) {
            if (newSign == irrgarten[x][y]){  
              alist.add(str);  
              a++;  
            }
          }
        }
      }     
    }
    
    int[] result = new int[256];
    for( int i = 0; i < 256; i++ ) result[i] = 0;
    
    for (int j = 0; j < alist.size() ; j++ ) {
      String chr = alist.get(j);
      for( char c : chr.toCharArray() )
      {
        result[(int)c]++; 
      }
    } // end of for
    
    ArrayList<CharOccurances> toReturn = new ArrayList<CharOccurances>();
    
    for( int c = 0; c < 256; c++ )
    {         
      toReturn.add(new CharOccurances((char)c, result[c]));
      if (result[c] != 0){
        System.out.println((char)c + " is there of " + result[c] + " times"); 
      }
    }
    return toReturn;
  }
  
  class CharOccurances
  {
    public CharOccurances(char C, int o){
      char c = C;
      int occurances = o;
    }
  }
      
  public void showCharacters(String str, int nrchar){
    System.out.println(str + " is there of " + nrchar + " times.");
    nrchar = 0;
  }
      
  public void removeElement(int[] arr, int removedIdx) {
    System.arraycopy(arr, removedIdx + 1, arr, removedIdx, arr.length - 1 - removedIdx);
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
    new Huffman();
  } 
}
      
