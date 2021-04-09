/**
 *
 * @author Tanti
 */
public class GraphApp {

    public static void main(String[] args) {
        Graph theGraph = new Graph();
            
            theGraph.addVertex('A'); //0
            theGraph.addVertex('B'); //1
            theGraph.addVertex('C'); //2
            theGraph.addVertex('D'); //3
            theGraph.addVertex('E'); //4
            theGraph.addVertex('F'); //5
            theGraph.addVertex('G'); //6

            theGraph.addEdge(0, 1); //AB
            theGraph.addEdge(1, 2); //BC
            theGraph.addEdge(2, 3); //AD
            theGraph.addEdge(3, 4); //DE
            theGraph.addEdge(4, 5); //EF
            theGraph.addEdge(5, 6); //FG
            
       Graph toGraph = new Graph();
            
            toGraph.addVertex('A'); //0
            toGraph.addVertex('B'); //1
            toGraph.addVertex('C'); //2
            toGraph.addVertex('D'); //3
            toGraph.addVertex('E'); //4
            toGraph.addVertex('F'); //5
            toGraph.addVertex('G'); //6

            toGraph.addEdge(0, 1); //AB
            toGraph.addEdge(1, 5); //BF
            toGraph.addEdge(5, 6); //FG
            toGraph.addEdge(6, 2); //GC
            toGraph.addEdge(2, 3); //CD
            toGraph.addEdge(3, 4); //DE
            
        theGraph.display();
        theGraph.bfs();
        
        toGraph.display();
        toGraph.dfs();
    }
    
}
