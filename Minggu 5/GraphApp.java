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
            theGraph.addVertex('H'); //7
            theGraph.addVertex('I'); //8

            theGraph.addEdge(0, 1); //AB
            theGraph.addEdge(1, 2); //BC
            theGraph.addEdge(2, 3); //CD
            theGraph.addEdge(3, 4); //DE
            theGraph.addEdge(4, 5); //EF
            theGraph.addEdge(5, 6); //FG
            theGraph.addEdge(6, 7); //GH
            theGraph.addEdge(7, 8); //HI
            
        theGraph.display();
        theGraph.bfs();
        
       Graph toGraph = new Graph();
            
            toGraph.addVertex('A'); //0
            toGraph.addVertex('B'); //1
            toGraph.addVertex('C'); //2
            toGraph.addVertex('D'); //3
            toGraph.addVertex('E'); //4
            toGraph.addVertex('F'); //5
            toGraph.addVertex('G'); //6
            toGraph.addVertex('H'); //7
            toGraph.addVertex('I'); //8

            toGraph.addEdge(0, 1); //AB
            toGraph.addEdge(1, 5); //BF
            toGraph.addEdge(5, 7); //FH
            toGraph.addEdge(7, 2); //HC
            toGraph.addEdge(2, 3); //CD
            toGraph.addEdge(3, 6); //DG
            toGraph.addEdge(6, 8); //GI
            toGraph.addEdge(8, 4); //IE
            
     
        
        toGraph.display();
        toGraph.dfs();
    }
    
}
