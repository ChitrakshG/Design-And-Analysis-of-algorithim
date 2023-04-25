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
