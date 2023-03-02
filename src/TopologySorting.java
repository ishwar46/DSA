public class TopologySorting {
    public static void main(String[] args) {
        int v = 4;
        int edges = 5;

        int graphTop[][] = new int[v][v];
        graphTop[0][1] = 1;
        graphTop[0][2] = 1;
        graphTop[1][2] = 1;
        graphTop[2][3] = 1;
        graphTop[3][1] = 1;
        int indegree[] = new int[v];
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                if (graphTop[i][j] == 1) {
                    indegree[j]++;
                }
            }
        }
        for (int i = 0; i < v; i++) {
            if (indegree[i] == 0) {
                System.out.println(i);
            }
        }

    }
}
