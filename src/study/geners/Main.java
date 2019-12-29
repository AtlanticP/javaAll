package study.geners;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(2);
//        list.add("Hello");   Error!
//        list.add("World");

        for (int i = 0; i < list.size (); i++) {
            int j = (Integer) list.get (i);
            System.out.print (j);
        }
    }
}