package study.stat;

public class Main {
    public static void main(String[] args) {
        First first = new First ();
        Second sec = new Second ();
        System.out.println (first.N);  // 4
        sec.N = 5;
        System.out.println (first.N);  // 5
    }
}