public class MiniBinaerBaum
{
  public MiniBinaerBaum(){
    BinaryTree<Integer> test = new BinaryTree<Integer>(13, new BinaryTree<Integer>(8, new BinaryTree<Integer>(7, null, new BinaryTree<Integer>(7)), new BinaryTree<Integer>(9, null, new BinaryTree<Integer>(10))), new BinaryTree<Integer>(15, null, new BinaryTree<Integer>(12, new BinaryTree<Integer>(11), new BinaryTree<Integer>(40))));
    System.out.println("pre-order");                                                                                                                                                                                                                                                                                     
    ausgabe_preOrder(test);
    System.out.println();  
    System.out.println("post-order");
    ausgabe_postOrder(test);
    System.out.println(); 
    System.out.println("in-order");
    ausgabe_inOrder(test);
    System.out.println("");
    System.out.println("TEST");
    drawTheTree(test);
  }
  
  public void ausgabe_preOrder(BinaryTree<Integer> baum){    //N-l-r
    if (!baum.isEmpty()) {
      System.out.print(baum.getContent()+" ");
      ausgabe_preOrder(baum.getLeftTree());
      ausgabe_preOrder(baum.getRightTree());
    }
  }
  public void ausgabe_postOrder(BinaryTree<Integer> baum){     //l-r-N
    if (!baum.isEmpty()) {
      ausgabe_postOrder(baum.getLeftTree());
      ausgabe_postOrder(baum.getRightTree());
      System.out.print(baum.getContent()+" ");
    }
  }
  public void ausgabe_inOrder(BinaryTree<Integer> baum){      //l-N-r
    if (!baum.isEmpty()) {
      ausgabe_inOrder(baum.getLeftTree());
      System.out.print(baum.getContent()+" ");
      ausgabe_inOrder(baum.getRightTree());
    } // end of if
  }
  public void drawTheTree(BinaryTree<Integer> baum){
    if (!baum.isEmpty()){
      System.out.println(baum.getContent());
      drawTheTree(baum.getLeftTree());
      drawTheTree(baum.getRightTree());
      }
    } 
  public static void main(String[] args) {
    new MiniBinaerBaum();
  }
}
