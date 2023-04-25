import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BredthFirstSearch {
    public static void bfs(ArrayList<ArrayList<Integer>> adj_list, int no_of_vertices) {
        boolean[] visited = new boolean[no_of_vertices];
        Queue<Integer> q = new LinkedList<>();
        q.add(2);
        visited[2] = true;
        while (q.isEmpty() == false) {
            int rem = q.poll();
            System.out.println("node :" + rem);

            for (int neigbour : adj_list.get(rem)) {
                if (visited[neigbour] == false) {
                    q.add(neigbour);
                    visited[neigbour] = true;
                }

            }

        }

    }

    public static void main(String[] args) {
        int no_of_vertices = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < no_of_vertices; i++) {
            adj.add(new ArrayList<Integer>());
        }
        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(2);
        adj.get(2).add(0);
        adj.get(2).add(3);
        adj.get(3).add(3);
        bfs(adj, no_of_vertices);
    }

}
