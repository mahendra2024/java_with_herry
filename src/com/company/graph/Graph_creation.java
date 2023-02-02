package com.company.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph_creation {

    static class Edge {
        int src;
        int dest;
        public Edge(int src , int dest){
            super();
            this.dest = dest;
            this.src = src;
        }
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        creteGraph(graph);
        //        print 2's neighbours
        for (int i = 0; i < graph[2].size(); i++) {
            Edge e = graph[2].get(i);
            System.out.print(e.dest + " ");
        }
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        System.out.println();
        create_graph(adj);

    }
    public static void creteGraph(ArrayList<Edge> graph[]){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0 , 2));

        graph[1].add(new Edge(1 , 2));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2 , 0));
        graph[2].add(new Edge(2 , 3));
        graph[2].add(new Edge(2 ,1));

        graph[3].add(new Edge(3 ,1));
        graph[3].add(new Edge(3 ,2));
    }

//    Another way to create graph with Edge class
    public static void create_graph(ArrayList<ArrayList<Integer>> adj){
//        n and m are the nodes and edge
        int n = 3 ;
        int m =  3;
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

//        edge 1--> 2
        adj.get(1).add(2);
        adj.get(2).add(1);

//        edge 2 ---> 3
        adj.get(2).add(3);
        adj.get(3).add(2);

//        edge 1 ---> 3
        adj.get(1).add(3);
        adj.get(3).add(1);

//        print all edges
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(adj.get(i).get(j) + " ");
            }
        }
    }


}
