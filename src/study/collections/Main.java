package study.collections;
import java.util.*;

public class Main {
    public static void main(String[] args) {

//        Collection col = new HashSet () // unordered
//        Collection col = new LinkedHashSet () // ordered
//        Collection col = new TreeSet () // sorted
//        List list = new ArrayList () // ordered, by index
//        Queue queue = new PriorityQueue (); // ordered, by object
//        Map map = new HashMap () // key, value

        Collection collection = new ArrayList ();
        collection.add(3);
        collection.add(4);
        collection.add(5);
        collection.add("Hello!");
        collection.remove(5);

//        Iterator iterator = collection.iterator ();
//        while (iterator.hasNext ()) {
//            System.out.println (iterator.next());
//        }

//        for (Object o : collection) {
//            System.out.println (o);
//        }

        List list = new ArrayList (); // not sorted
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(5);
        list.add("Hello");
        list.set (2, "World");

//        System.out.println (list);
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println (list.get(i));
//        }

        Queue queue = new PriorityQueue ();

//        queue.add(1);
//        queue.add(2);
//        queue.add(3);
////        queue.add("World");   // error
//        for (Object o: queue) {
//            System.out.println (o);
//        }

//        queue.offer(1);
//        queue.offer (4);
//        queue.offer(3);
//        System.out.println (queue);

//        for (Object o: queue) {
//            System.out.println (o);
//        }

        Set set = new HashSet (); //unique and sorted
        set.add (1);
        set.add (1);
        set.add (1);
        set.add (3);
        set.add (3);
        set.add (2);
        set.add (2);
        set.add (2);

//        System.out.println (set);

        Map map = new HashMap ();

        map.put("1", "One");
        map.put ("2", "Two");

//        System.out.println (map.get ("2"));

        class Book {

            String nameAuthor;

            public Book (String nameAuthor) {
                this.nameAuthor = nameAuthor;
            }

            public String toString() {
                return "Book " +
                        "name Author is" + "'" +
                        nameAuthor + "'";
            }
        }
        map.put("3", new Book("Karnegi"));

        System.out.println (map.get("3"));

        Set entryMap = map.entrySet ();
        for (Object o: entryMap) {
            System.out.println (o);
        }


    }
}