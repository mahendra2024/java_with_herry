package com.company.graph;

import java.util.ArrayList;

public class DFS {
    static class Edge{
        int src ;
        int dest;
        public Edge(int s , int d){
            this.dest = d;
            this.src = s;
        }
    }
    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[V];

        boolean [] vis = new boolean[V];
        Bnao_graph(graph,0 , vis);
        DFS(graph,0,vis);
        System.out.println();
//        If the graph is given in the form of parts
//        then we have to use this code
        for (int i = 0; i < vis.length; i++) {
            DFS(graph , i , vis);
        }

    }
    public static void Bnao_graph(ArrayList<Edge>[] graph, int v, boolean[] vis){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0 , 1));
        graph[0].add(new Edge(0 , 2));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));

        graph[4].add(new Edge(4 , 2));
        graph[4].add(new Edge(4 , 3));
        graph[4].add(new Edge(4 , 5));

        graph[5].add(new Edge(5,4));
        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,6));
        graph[5].add(new Edge(6,5));
    }
    public static void DFS(ArrayList<Edge> graph[] , int curr , boolean vis[]){
        System.out.print( curr + " ");
        vis[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if(vis[e.dest] == false){
                DFS(graph , e.dest, vis);
            }
        }

    }
}
