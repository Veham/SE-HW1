public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
        int[][] layers = new int[m.length+1][m.length];
        int[] layer_size = new int[m.length+1];
        boolean[] visited = new boolean[m.length];
        layers[0][0] = i;
        layer_size[0] = 1;
        for(int d = 0;d < m.length;++d){
            for(int vi = 0;vi < layer_size[d];++vi){
                int v = layers[d][vi];
                if(visited[v])
                    continue;
                visited[v] = true;
                if(v == j)
                    return d;
                for(int u = 0;u < m.length;u++){
                    if(m[v][u] == 1){
                        layers[d+1][layer_size[d+1]++] = u;
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}