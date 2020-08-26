import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Comparator;

public class Huffman{
  char[][] irrgarten;
  String dateiname;   
  String strlast;
  int breite, hoehe,startX, startY;
  ArrayList<String> alist = new ArrayList<String>();
  HashMap<Character, Integer> toReturn = new  HashMap<Character, Integer>();
  
  
  public Huffman(){
    dateiname = "input.txt";
    irrgarten = ladeIrrgarten();
    getListOfCharacters();
  }
  
  public HashMap getListOfCharacters(){
    
    
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
    
    int[] result = new int[alist.size()];
    for( int i = 0; i < alist.size(); i++ ) result[i] = 0;
    
    for (int j = 0; j < alist.size() ; j++ ) {
      String chr = alist.get(j);
      for( char c : chr.toCharArray() )
      {
        result[(int)c]++; 
      }
    } // end of for
    
    HashMap<Character, Integer> toReturn = new  HashMap<Character, Integer>();
    
    for( int c = 0; c < alist.size(); c++ )
    {         
      if (result[c] != 0 && (char)c != ' '){
        toReturn.put((char)c, result[c]);       
      }                                    
    }
    Object[] values = toReturn.values().toArray();
    Arrays.sort(values);
    System.out.println(Arrays.toString(values));  
    
    
              
    return toReturn;    
  }

  public void crateNewTree(HashMap<Character, Integer> map){
    
  }
  
  class CharOccurances
  {
    public CharOccurances(char C, int o){
      char c = C;
      int occurances = o;
    }
  }
      
  public char[][] ladeIrrgarten(){
    File datei = new File(dateiname);
    String irrgartenString = "";
    int breite = 0;
    int max = 0;
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
    hoehe = zeilen.length;                               // Höhe = Anzahl der Zeilen
    int[] getNrLetters = new int[hoehe];
    for (int p = 0; p < zeilen.length; p++){
      getNrLetters[p] = zeilen[p].length();
    }
    for (int l = 0; l < getNrLetters.length; l++){
      if (getNrLetters[l] > breite){
        breite = getNrLetters[l];
      }
    }                                                      // Breite = Länge einer Zeile
    char[][] feld = new char[breite][hoehe];                  // und dann alle Felder setzen
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
      
