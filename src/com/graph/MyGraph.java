package com.graph;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MyGraph {

    public Map buildGraph() {
        ArrayList A = new ArrayList ();
        ArrayList B = new ArrayList ();
        ArrayList C = new ArrayList ();
        ArrayList D = new ArrayList ();
        ArrayList E = new ArrayList ();
        ArrayList F = new ArrayList ();
        ArrayList G = new ArrayList ();
        A.add('E'); A.add('B');
        B.add('A'); B.add('C');
        C.add('D'); C.add('B');
        D.add('C');
        E.add('F'); E.add('A');
        F.add('E');

        ArrayList[] values = new ArrayList[]{A, B, C, D, E, F, G};
        char[] keys = new char[]{'A', 'B', 'C', 'D', 'E', 'F'};
        // continue building the graph
        Map graph = new HashMap ();

        for (int i = 0; i < keys.length; i++) {
            graph.put (keys[i], values[i]);
        }

        return graph;
    }

    public ArrayList getRoot(Map graph, char current, char target,
                             ArrayList viewed) {
        ArrayList root = new ArrayList ();

        if (current == target) {
//            System.out.println ("Дошел до базы!");
            ArrayList path = new ArrayList ();
            path.add(current);
            return path;
        }

        if (viewed.contains (current)){
            return null;
        }

        viewed.add(current);

        Object value = graph.get(current);
//        System.out.println (value);
        if (value == null) {
            return null;
        }
        ArrayList neighbors = (ArrayList)value;

        for (int i = 0; i < neighbors.size (); i++) {
            char curr = (char) neighbors.get (i);
            ArrayList path = getRoot (graph, curr, target, viewed);
//            System.out.println ("path " + path);

            if (path == null) {
                continue;
            }
            if (path.size() != 0)
                root.add(current);
                root.addAll (path);
                return root;
        }

        return root;
    }
}


