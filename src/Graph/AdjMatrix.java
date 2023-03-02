//package Graph;
//
//import java.util.Arrays;
//import java.util.List;
//
//public class AdjMatrix {
//    int vertices;
//    int matrix[][];
//    AdjMatrix(int vertices) {
//        this.vertices = vertices;
//        matrix = new int[vertices][vertices];
//    }
//
//    //Add edges method
//    //If weighted graph add int weight as third parameter
//    public void addEdge(int source, int desitination) {
//        //Add edge
//        matrix[source][desitination] = 1;
//
//        //Add back edge for undirected graph
//        matrix[source][desitination] = 1;
//    }
//
//    //print graph
//    public void printGraph() {
//        for(int i = 0; i < vertices; i++) {
//            System.out.print(i + " is connected to: ");
//            for(int j = 0; j < vertices; j++) {
//                if (matrix[i][j] !=0) {
//                    System.out.print(j+ " ");
//                }
//            }
//            System.out.println();
//        }
//    }
//
//    public void KruskalAlgortithmMST{
//        Arrays.sort(edge);
//        Edge result[] = new Edge[vertices - 1];
//        int parent[] = new int[vertices];
//        int size[] = new int[vertices];
//        int mstindex = -1;
//        for (int i = 0; i < vertices; i++) {
//            parent[i] = -1;
//        }
//        int edgetaken = 1;
//        int edgeindex = -1;
//        while (edgetaken < vertices) {
//            Edge e = edge[++edgeindex];
//            int uabsroot = find(e.source, parent);
//            int vabsroot = find(e.destination, parent);
//            if (uabsroot == vabsroot) {
//                continue;
//            }
//            result[++mstindex] = e;
//
//            union(uabsroot, vabsroot, parent, size);
//
//
//        }
//
//
//
//
//
//
//    }
//
//    public void union(int u, int v, int size[], int parent[]) {
//        if (size[u] < size[v]) {
//            parent[u] = v;
//            size[v] += size[u];
//        } else {
//            parent[v] = u;
//            size[u] += size[v];
//        }
//    }
//
//    int find(int u,int parent[]) {
//        if (parent[u] == -1) {
//            return u;
//        }
//       return parent[vertices] = find(parent[u], parent);
//    }
//    public static void main(String[] args) {
//        AdjMatrix graph = new AdjMatrix(4);
//        graph.addEdge(0, 1);
//        graph.addEdge(0, 2);
//        graph.addEdge(1, 2);
//        graph.addEdge(2, 3);
//        graph.printGraph();
//    }
//
//    List<Integer> get(int i) {
//        return null;
//    }
//
//
//    //Prim's Algorithm
//
//    public void prims(int source){
//        int key[] = new int[vertices];
//        boolean mstset[] = new boolean[vertices];
//        int mst[] = new int[vertices];
//        for(int i = 0; i<vertices; i++){
//            mst[i] = -1;
//            key[i] = Integer.MAX_VALUE;
//        }
//        key[source] = 0;
//        for(int i = 0; i<vertices; i++){
//            int minVertex = findMinVertex(key, mstset);
//            mstset[minVertex] = true;
//            for(int j = 0; j<vertices; j++){
//                if(matrix[minVertex][j]!=0){
//                    if(matrix[minVertex][j]<key[j] && !mstset[j]){
//                        key[j] = matrix[minVertex][j];
//                        mst[j] = minVertex;
//                    }
//                }
//            }
//
//        }
//        //print mst
//        for(int i = 0; i<vertices; i++){
//            System.out.println(i + " - " + mst[i] + " : " + key[i]);
//        }
//
//    }
//
//    public int findMinVertex(int key[], boolean mstset[]){
//        int minVertex = -1;
//        for(int i = 0; i<vertices; i++){
//            if(!mstset[i] && (minVertex == -1 || key[i] < key[minVertex])){
//                minVertex = i;
//            }
//        }
//        return minVertex;
//    }
//
//    //dijkstra algorithm
//    public void dijkstra(int source){
//        int dist[] = new int[vertices];
//        boolean sptset[] = new boolean[vertices];
//        for(int i = 0; i<vertices; i++){
//            dist[i] = Integer.MAX_VALUE;
//        }
//        dist[source] = 0;
//        for(int i = 0; i<vertices; i++){
//            int minVertex = findMinVertex(dist, sptset);
//            sptset[minVertex] = true;
//            for(int j = 0; j<vertices; j++){
//                if(matrix[minVertex][j]!=0 && !sptset[j]){
//                    int newDist = dist[minVertex] + matrix[minVertex][j];
//                    if(newDist < dist[j]){
//                        dist[j] = newDist;
//                    }
//                }
//            }
//        }
//
//
//    }
//}
//
