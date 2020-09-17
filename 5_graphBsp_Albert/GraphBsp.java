public class GraphBsp{
  Graph g;
  
  public GraphBsp(){
    g = new Graph();
    
    Vertex dor = new Vertex("Dortmund");
    Vertex k = new Vertex("Koln");
    Vertex d = new Vertex("Duesseldorf");
    Vertex aa = new Vertex("Aachen");
    Vertex bn = new Vertex("Bonn");
    Vertex wu = new Vertex("Wuppertal");
    Vertex e = new Vertex("Essen");
    Vertex bo = new Vertex("Bochum");
    Vertex du = new Vertex("Duisburg");
  
    g.addVertex(k);
    g.addVertex(d);
    g.addVertex(aa);
    g.addVertex(bn);
    g.addVertex(wu);
    g.addVertex(e);
    g.addVertex(d);
    g.addVertex(bo);
    g.addVertex(du);
    
    g.addEdge(new Edge(k,d,33.0));
    g.addEdge(new Edge(k,aa,61.0));
    g.addEdge(new Edge(k,bn,25.0));
    g.addEdge(new Edge(bn,aa,71.0));
    g.addEdge(new Edge(bn,wu,60.0));
    g.addEdge(new Edge(wu,d,30.0));
    g.addEdge(new Edge(wu,k,37.0));
    g.addEdge(new Edge(wu,e,25.0));
    g.addEdge(new Edge(wu,dor,33.0));
    g.addEdge(new Edge(dor,bo,17.0));
    g.addEdge(new Edge(bo,e,15.0));
    g.addEdge(new Edge(e,du,17.0));
    g.addEdge(new Edge(du, d,23.0));
    
    List<Edge> lE = g.getEdges();
    lE.toFirst();
                         
    while (lE.hasAccess()) { 
      Vertex[] v = lE.getContent().getVertices();
      System.out.println(v[1].getID());
      lE.next();
    } 
  }
  
  public void getDistance(Vertex selectedCity){
  
  }

  public static void main(String[] args){
    new GraphBsp();
  }
}
  
