package Graph;

import java.util.Arrays;

public class DisjointUnion {
    int parent[];
    int size[]; //union by rank garna chahiyo
    int vertices;
    DisjointUnion(int vertices) {
        this.vertices = vertices;
        parent = new int[vertices];
        size = new int[vertices];
        for (int i = 0; i < vertices; i++) {
            parent[i] = -1;
        }

    }

    public int isCycleDetection(int u, int v){
        int uabsroot = find(u);
        int vabsroot = find(v);
        if (uabsroot == vabsroot) {
            System.out.println("Cycle detected");
            return 1;
        }
        union(uabsroot, vabsroot);
        return 0;

    }

     int find(int u) {
        if (parent[u] == -1) {
            return u;
        }
        return parent[u] = find(parent[u]);
    }

    public void union(int u, int v) {
       if (size[u] < size[v]) {
           parent[u] = v;
           size[v] += size[u];
       } else {
           parent[v] = u;
           size[u] += size[v];
       }
    }








    public static void main(String[] args) {
        DisjointUnion graph = new DisjointUnion(3);
        graph.isCycleDetection(0, 1);
        graph.isCycleDetection(1, 2);
        graph.isCycleDetection(0, 2);
    }
}

