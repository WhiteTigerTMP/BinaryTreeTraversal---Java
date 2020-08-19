import java.io.*;

public class Konvertierer{     
  String dateiname;
  public Konvertierer(){
    dateiname = "input.txt";
    
    File datei = new File(dateiname);
    String input = "";
    String output = "";
    try {
      FileReader reader = new FileReader(datei);
      BufferedReader puffer = new BufferedReader(reader);
      String s = puffer.readLine();
      while (s != null) {
        input += s ;        
        s = puffer.readLine();
      }
      reader.close();
    } catch (IOException e) {
      System.err.println(e.toString());
    }
    input = input.toLowerCase();
    for (int i = 0;i<input.length() ;i++ ) {
      char c = input.charAt(i);
      if (Character.isLetter(c)) {
        output += c;
      } // end of if
    } // end of for
    
    //Output in Datei schreiben
    File file = new File("output.txt");
    try{
      
      file.createNewFile();
      FileWriter writer = new FileWriter(file); 
      writer.write(output); 
      writer.flush();
      writer.close();
    } catch (IOException e) {
      System.err.println(e.toString());
    }
  }       
 
  public static void main(String[] args){
    new Konvertierer();
  }                 
}

