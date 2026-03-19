
import java.util.*;

public class cycleundirected {

    static class edge {

        int src;
        int dest;

        public edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    static void creategraph(ArrayList<edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new edge(0, 2));
        graph[0].add(new edge(0, 1));
        graph[0].add(new edge(0, 3)); 

        graph[1].add(new edge(1, 0));
        graph[1].add(new edge(1, 2));

        graph[2].add(new edge(2, 0));
        graph[2].add(new edge(2, 1));

        graph[3].add(new edge(3, 0));
        graph[3].add(new edge(3, 4));

        graph[4].add(new edge(4, 3));

    }

    public static boolean iscyclicutil(ArrayList<edge>[] graph, boolean vis[], int curr, int par) {
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            edge e = graph[curr].get(i);

            if(vis[e.dest] && e.dest != par) {
                boolean iscycle = iscyclicutil(graph, vis, e.dest, curr);

                if(iscycle) {
                    return true;
                }
            } else if(e.dest == par) {
                continue;
            } else {
                return true;
            }
        }

        return false;
    }

    public static boolean iscyclic(ArrayList<edge>[] graph, boolean vis[]) {
        for (int i = 0; i < graph.length; i++) {
            if(iscyclicutil(graph, vis, i, -1)) {
                return true;
            }
        }

        return false;
    } 

    public static void main(String args[]) {
        int v = 5;
        ArrayList<edge> graph[] = new ArrayList[v];
        creategraph(graph);

        System.out.println(iscyclic(graph, new boolean[v]));
    }
}
