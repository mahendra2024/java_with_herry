package com.company.graph;

public class Create_graph_Matrix {
    public static void main(String[] args) {
//        n and m are the number of nodes and edges
        int n = 3;
        int m = 3;
        int [][] graph = new int[n + 1 ] [m + 1];


//        basically we can store graph as the form of matrix like
//        g[v][u] = 1;
//        g[u][v] = 1;


//        if we want to store the weighted graph in form of matrix
//        then what we have to do
//        simply we have to store weight in the place of 1 like that
//        g[v][u] = 5;
//        g[u][v] = 10;

//        edges 1 ----> 2
        graph[1][2] = 1;
        graph[2][1] = 1;

//        edges  2  ----> 3
        graph[2][3] = 1;
        graph[3][2] = 1;

//        edge 1 ----> 3
        graph[1][3] = 1;
        graph[3][1] = 1;

    }
}
