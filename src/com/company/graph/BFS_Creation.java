package com.company.graph;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS_Creation {
    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[V];
//        creteGraph(ArrayList);
        System.out.println();

    }
    static class Edge{
        int src;
        int dest;
        public Edge(int src , int dest){
            this.dest = dest;
            this.src = src;
        }
    }
    public static void creteGraph(ArrayList<Graph_creation.Edge> graph[]){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Graph_creation.Edge>();
        }
        graph[0].add(new Graph_creation.Edge(0 , 2));

        graph[1].add(new Graph_creation.Edge(1 , 2));
        graph[1].add(new Graph_creation.Edge(1,3));

        graph[2].add(new Graph_creation.Edge(2 , 0));
        graph[2].add(new Graph_creation.Edge(2 , 3));
        graph[2].add(new Graph_creation.Edge(2 ,1));

        graph[3].add(new Graph_creation.Edge(3 ,1));
        graph[3].add(new Graph_creation.Edge(3 ,2));
    }
    public static void BFS(ArrayList<Edge> graph[] , int V){
        Queue<Integer> q = new LinkedList<>();
        boolean visited[] = new boolean[V];
        q.add(0);
        while (!q.isEmpty()){
            int curr = q.remove();
            if(visited[curr] == false){
                System.out.print(visited[curr] + " ");
                visited[curr] = true;
                for (int i = 0; i < graph.length; i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }


}
