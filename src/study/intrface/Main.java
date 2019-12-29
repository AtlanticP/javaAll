package study.intrface;

public class Main {
    public static void main(String[] args) {
        System.out.print ("package interface");
        Array arr = new MyArray ();
        System.out.println (arr.Add(1));
        System.out.println (arr.Add(2));
        System.out.println (arr.Add(4));
        System.out.println (arr.Add(3));
        System.out.println (arr.Add(5));
        System.out.println (arr.Add(7));
        System.out.println (arr.Get(3));
    }
}