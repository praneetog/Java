package Graphs;

import java.util.*;

class Solution{
    public ArrayList<Integer> bfsOfGraph(ArrayList<ArrayList<Integer>> adj, int V){
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean[] vis = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        vis[0] = true;
        while(!q.isEmpty()){
            int node = q.poll();
            bfs.add(node);
            for(int it : adj.get(node)){
                if(!vis[it]){
                    vis[it] = true;
                    q.add(it);
                }
            }
        }
        return bfs;
    }
}

public class graph {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt(); // Number of vertices
        int E = sc.nextInt(); // Number of edges

        // Initialize adjacency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>()); // Create a new list for each vertex
        }

        // Add edges to the adjacency list
        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj.get(u).add(v); // Adding edge u -> v
            adj.get(v).add(u); // Adding edge v -> u (undirected graph)
        }

        // Create Solution object and call bfsOfGraph
        Solution obj = new Solution();
        ArrayList<Integer> result = obj.bfsOfGraph(adj, V);

        // Print the result
        for (int node : result) {
            System.out.print(node + " ");
        }
        System.out.println();
    }
}
