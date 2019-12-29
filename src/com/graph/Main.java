package com.graph;

import java.util.ArrayList;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MyGraph graph = new MyGraph ();

//        System.out.println ();
        ArrayList root = graph.getRoot (graph.buildGraph (), 'F', 'D', new ArrayList ());
        System.out.println ("root " + root);
    }
}