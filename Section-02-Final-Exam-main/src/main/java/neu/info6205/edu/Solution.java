package neu.info6205.edu;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public static int V,E;
    HashMap<Integer,ArrayList<Integer>> edges;
    int[] id;
    int count;
    boolean[] marked;
    public int connectedSquareSum(int graph_nodes, List<Integer> graph_from, List<Integer> graph_to){
        this.V = graph_nodes;
        edges = new HashMap<>();
        id = new int[V+1];
        count = 0;
        marked = new boolean[V+1];
        for(int i=0;i<graph_from.size();i++){
            int v = graph_from.get(i);
            int w = graph_to.get(i);
            ArrayList<Integer> edge = edges.getOrDefault(v, new ArrayList<>());
            if(!edge.contains(w)) edge.add(w);
            edges.put(v, edge);
        }
        for(int i=1;i<=V;i++){
            if(!marked[i]) dfs(i);
            count++;
        }
        int time = 0;
        int lastid = -1;
        int ans = 0;
        for(int i = 1;i<=V;i++){
            if(id[i]==lastid) time++;
            else{
                ans+= time*time;
                lastid = id[i];
                time = 1;
            }
        }
        return 0;
    }
    public void dfs(int v){
        marked[v] = true;
        id[v] = count;
        for(int w:edges.getOrDefault(v, new ArrayList<>())){
            if(!marked[w]) dfs(w);
        }
    }
}
