import java.util.*;


class Edge {
    int from, to, wt;

    public Edge(int from, int to, int wt) {
        this.from = from;
        this.to = to;
        this.wt = wt;
    }
}

public class PrimsAlgorithimMST {
    static class Pair implements Comparable< Pair> {
        Integer v;
        Integer p;
        int wt;
    
        Pair(Integer v, Integer p, int wt) {
          this.v = v;
          this.p = p;
          this.wt = wt;
        }
    
        public int compareTo(Pair o) {
          return this.wt - o.wt;
        }
      }


      static void prim(int V, ArrayList<ArrayList<Edge>> adj) {
        int src = 0;
        PriorityQueue<Pair> queue = new PriorityQueue<>();
        queue.add(new Pair(src, -1, 0));
        Integer[] visited = new Integer[V];
        while (queue.size() > 0) {
            Pair rem = queue.remove();
    
            if (visited[rem.v] != null) {
                continue;
            }
            visited[rem.v] = rem.p;
            if (rem.p != -1) {
                System.out.println("[" + rem.v + "-" +
                        rem.p + "->" + rem.wt + "]");
            }
    
            for (Edge e : adj.get(rem.v)) {
                if (visited[e.to] == null) {
                    queue.add(new Pair(e.to, rem.v, e.wt));
                }
            }
        }
    }
public static void main(String[] args) {
    int V = 5;
    ArrayList<ArrayList<Edge>> adj = new ArrayList<ArrayList<Edge>>();
    for (int i = 0; i < V; i++) {
        adj.add(new ArrayList<Edge>());
    }
    adj.get(0).add(new Edge(0, 1, 2));
    adj.get(0).add(new Edge(0, 3, 6));
    adj.get(1).add(new Edge(1, 0, 2));
    adj.get(1).add(new Edge(1, 2, 3));
    adj.get(1).add(new Edge(1, 3, 8));
    adj.get(1).add(new Edge(1, 4, 5));
    adj.get(2).add(new Edge(2, 1, 3));
    adj.get(2).add(new Edge(2, 4, 7));
    adj.get(3).add(new Edge(3, 0, 6));
    adj.get(3).add(new Edge(3, 1, 8));
    adj.get(3).add(new Edge(3, 4, 9));
    adj.get(4).add(new Edge(4, 1, 5));
    adj.get(4).add(new Edge(4, 2, 7));
    adj.get(4).add(new Edge(4, 3, 9));
    prim(V, adj);


}    

    
}


