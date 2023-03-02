package ExamPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BellmanFord {

    private int[] dist;
    private int[] prev;
    private List<Edge> edges;

    public BellmanFord(List<Edge> edges, int n, int source) {
        this.edges = edges;
        dist = new int[n];
        prev = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        Arrays.fill(prev, -1);
        dist[source] = 0;

        for (int i = 0; i < n-1; i++)
            for (Edge e : edges)
                if (dist[e.src] != Integer.MAX_VALUE && dist[e.src] + e.weight < dist[e.dest]) {
                    dist[e.dest] = dist[e.src] + e.weight;
                    prev[e.dest] = e.src;
                }

        for (Edge e : edges)
            if (dist[e.src] != Integer.MAX_VALUE && dist[e.src] + e.weight < dist[e.dest])
                throw new IllegalArgumentException("Graph contains a negative cycle");
    }

    public List<Integer> getPath(int dest) {
        List<Integer> path = new ArrayList<>();
        for (int v = dest; v != -1; v = prev[v]) {
            if (prev[v] == -1 && v != 0)
                return null;
            path.add(v);
        }
        Collections.reverse(path);
        return path;
    }

    public int getDistance(int dest) {
        return dist[dest];
    }

    private static class Edge {
        int src, dest, weight;
        public Edge(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }

    public static void main(String[] args) {
        List<Edge> edges = new ArrayList<>();
        edges.add(new Edge(0, 1, 5));
        edges.add(new Edge(0, 2, 3));
        edges.add(new Edge(1, 3, 6));
        edges.add(new Edge(1, 2, 2));
        edges.add(new Edge(2, 4, 4));
        edges.add(new Edge(2, 5, 2));
        edges.add(new Edge(2, 3, 7));
        edges.add(new Edge(3, 4, -1));
        edges.add(new Edge(4, 5, -2));
        BellmanFord bf = new BellmanFord(edges, 6, 0);
        System.out.println(bf.getPath(5));
        System.out.println(bf.getDistance(5));
    }
}
