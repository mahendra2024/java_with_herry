package com.company.graph;

import java.util.ArrayList;

public class Print_All_path {
    static class Edge{
        int src;
        int dest;
        public Edge(int s , int d){
            this.dest = d;
            this.src = s;
        }
    }

    public static void main(String[] args) {
        int V = 7;
        String path = " ";
        boolean vis [] = new boolean[V];
        ArrayList<Edge> graph[] = new ArrayList[V];
        graph_bnao(graph);
        print_all_path(graph,vis , 0 ,path , 5 );

    }
    public static void graph_bnao(ArrayList<Edge> graph[]){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0 , 1));
        graph[0].add(new Edge(0 , 2));

        graph[1].add(new Edge(1 , 0));
        graph[1].add(new Edge(1 , 3));

        graph[2].add(new Edge(2 , 4));
        graph[2].add(new Edge(2 , 0));

        graph[3].add(new Edge(3 , 1));
        graph[3].add(new Edge(3 , 4));
        graph[3].add(new Edge(3 , 5));

        graph[4].add(new Edge(4 , 2));
        graph[4].add(new Edge(4 , 3));
        graph[4].add(new Edge(4 , 5));

        graph[5].add(new Edge(5 , 3));
        graph[5].add(new Edge(5 , 4));
        graph[5].add(new Edge(5 , 6));
        graph[5].add(new Edge(6 , 5));
    }
    public static void print_all_path(ArrayList<Edge> graph[] , boolean [] vis ,int curr, String path, int target){
        if(curr == target){
            System.out.println(path + curr);
            return;
        }
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                vis[curr] = true;
                print_all_path(graph ,vis , e.dest , path + curr , target);
                vis[curr] = false;
            }
        }
    }
}
