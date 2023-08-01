import java.util.ArrayList;
import java.util.Stack;

public class DepthFirstSearch {
    public static void dfs( ArrayList<ArrayList<Integer>> adj_list,int no_of_vertices ,int start){
        boolean visited[]=new boolean[no_of_vertices];
        Stack<Integer> st=new Stack<>();
        st.push(start);
        visited[start]=true;
        while(st.isEmpty()==false){
            int rem=st.pop();
            System.out.println("node :"+rem);
            for(int neigbour: adj_list.get(rem)){
                if(visited[neigbour]==false){
                    st.push(neigbour);
                    visited[neigbour]=true;
                }
            }
        }
    }
    // other method better way
    class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj_list) {
        int vis[]=new int[V];
        
         ArrayList<Integer> ar=new  ArrayList<>();
          dfs(0,adj_list,ar,vis);
          return ar;
         
    }
    public static void dfs(int v, ArrayList<ArrayList<Integer>> adj_list,  ArrayList<Integer> ar,int vis[]){
        vis[v]=1;
        ar.add(v);
        for(int neighbour : adj_list.get(v)){
            if(vis[neighbour]!=1){
                dfs(neighbour,adj_list,ar,vis);
            }
        }
    }
}
    // end
    public static void main(String[] args) {
        int no_of_vertices =5;
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
        dfs(adj,no_of_vertices,2);
    }
    
}
