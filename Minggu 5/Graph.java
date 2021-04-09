/**
 *
 * @author Tanti
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Graph {
    private final int MAX_VERTS = 20;
    private Vertex vertexList[];
    private int adjMat[][];
    private int nVerts;
    
    //Pengggunaan BFS
    private Queue theQueue;
     public void bfs() {
        System.out.println("Visit by using BFS Algorithm : ");
        vertexList[0].wasVisited = true;
        displayVertex(0);
        theQueue.insert(0);
        
        int v2;
        
            while (!theQueue.isEmpty()) {
                int v1 = (int) theQueue.remove();
                while ((v2 = getAdjUnivisitedVertex(v1)) != -1) {
                    vertexList[v2].wasVisited =  true;
                    displayVertex(v2);
                    theQueue.insert(v2);
                }
            }
            System.out.println("");
            resetFlags();
            System.out.println("");
    }
 
    public void dfs() {
        System.out.println("Visit by using DFS Algorithm : ");
        vertexList[0].wasVisited = true;
        displayVertex(0);
        theQueue.insert(0);
        int v2;
        
            while (!theQueue.isEmpty()) {
                int v1 = (int) theQueue.remove();
                while ((v2 = getAdjUnivisitedVertex(v1)) != -1) {
                    vertexList[v2].wasVisited =  true;
                    displayVertex(v2);
                    theQueue.insert(v2);
                }
            }
            System.out.println("");
            resetFlags();
    }
    
        public Graph() {
            vertexList = new Vertex[MAX_VERTS];
            adjMat = new int[MAX_VERTS][MAX_VERTS];
            nVerts = 0;
                for (int i = 0; i < MAX_VERTS; i++){
                    for (int j = 0; j < MAX_VERTS; j++) {
                        adjMat[i][j] = 0;
                    }
                }
   
    //Menggunakan DFS
    theQueue = new Queue(MAX_VERTS);
    }
    
        public void addVertex(char label) {
            vertexList[nVerts++] = new Vertex(label);
        }
        
        public void addEdge(int start, int end) {
            adjMat[start][end] = 1;
            adjMat[end][start] = 1;
        }
        
        public void display() {
            System.out.println("Adjecency : ");
            for (int row = 0; row < nVerts; row++) {
                for (int col = 0; col < row; col++) {
                    if (adjMat[row][col] == 1) {
                        System.out.println(vertexList[col].label + " -- " + vertexList[row].label);
                    }
                }
            }
            System.out.println("");
        }
        
        public void displayVertex(int v) {
            System.out.print(vertexList[v].label + " ");
        }
        
        public int getAdjUnivisitedVertex(int v) {
            for (int i = 0; i <nVerts; i++) {
                if (adjMat[v][i] == 1 && vertexList[i].wasVisited == false) {
                    return i;
                }
            }
            return -1;
        }
        
        private void resetFlags() {
            for (int i = 0; i < nVerts; i++) {
                vertexList[i].wasVisited = false;
            }
        }
}