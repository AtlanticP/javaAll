package temp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Temp {

    public String returnNull () {
        return null;
    }

    public void mapAnalyzing () {
        Map t = new HashMap();
        t.put(1, "ABC");
        t.put(2, "CDE");
        t.put(3, "DEF");

        Iterator it = t.entrySet ().iterator ();
        while (it.hasNext ()) {
            it.next();
            it.remove ();
        }

        System.out.println (t.size());


    }
}
    // OUT
//        Iterator iterKeys = graph.keySet ().iterator ();
//        while (iterKeys.hasNext ()) {
//            Object key = iterKeys.next ();
//            String[] neighbors = graph.get(key).toString ().split ("");
//
//            for (int i = 0; i < neighbors.length; i++) {
//                root += getRoot (graph, neighbors[i], target, viewed);
//            }
//        }

//    String A = "BC";
//    String B ="AC";
//    String C = "BED";
//    String D = "C";
//    String E = "FCA";
//    String F = "E";
//    String G = "";