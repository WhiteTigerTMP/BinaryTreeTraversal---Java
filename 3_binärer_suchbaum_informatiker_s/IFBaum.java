 /**
 * <p>Qualitaets- und UnterstuetzungsAgentur - Landesinstitut fuer Schule, Materialien zum schulinternen Lehrplan Informatik SII</p>
 *
 * @version 2014-03-13
 */
public class IFBaum {
  private BinarySearchTree<Informatiker> baum;

  public IFBaum() {
    baum = new BinarySearchTree<Informatiker>();
  }

  public String suche(String pName) {
    Informatiker inf = new Informatiker(pName,"");
    if (!baum.isEmpty()) {
      Object ergebnis = baum.search(inf);
      if (ergebnis != null)
        return ergebnis.toString() + "\n";
      else
        return "--\n";
    } else {
      return "Baum leer \n";
    }
  }

  public void ergaenze(String pName, String pDatum) {
    //ToDo
  }

  public void loesche(String name) {
    //ToDo
  }

  public BinaryTree<Informatiker> gibBaum() {  
     
      return gibBaum(baum);
      
  }
  private BinaryTree<Informatiker> gibBaum(BinarySearchTree<Informatiker> bs){
    BinaryTree<Informatiker> b;
    if(bs.isEmpty())
      b=new BinaryTree<Informatiker>();
   else {b=new BinaryTree<Informatiker>(bs.getContent());   
       if(bs.getLeftTree()!=null)
           b.setLeftTree(this.gibBaum(bs.getLeftTree()));
       if(bs.getRightTree()!=null)
           b.setRightTree(this.gibBaum(bs.getRightTree()));   
        }  
   return b;     
  }
  
  public void leereBaum() {  
    baum = new BinarySearchTree<Informatiker>(); 
  }

  public String toString() {
    return inorder(baum);
  }

  public String inorder(BinarySearchTree<Informatiker> b) {
    //ToDo
    return "ToDo";
  }

}
