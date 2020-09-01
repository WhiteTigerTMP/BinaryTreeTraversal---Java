public class Informatiker implements ComparableContent<Informatiker> {
  String nameInfo = " ";
  String datum = " ";
  public Informatiker(String name, String gebDatum){
    nameInfo = name;
    datum = gebDatum;
  }
  
  public boolean isEqual(Informatiker pContent){  
    if (this.nameInfo.compareTo(pContent.nameInfo) == 0) return true; 
    return false;
  }                                               
  
  public boolean isGreater(Informatiker pContent){
    if (this.nameInfo.compareTo(pContent.nameInfo) > 0) return true; 
    return false;
  }
    
  public boolean isLess(Informatiker pContent){
    if (this.nameInfo.compareTo(pContent.nameInfo) < 0) return true; 
    return false;
  }
    
  public String gibName(String name){
    return this.nameInfo;
  }
    
  public String gibGebDatum(String datum){
    return this.datum;
  }
  
  public String toString(int infoID){
    String idk = toString(infoID);
    return idk;
  }
}         
