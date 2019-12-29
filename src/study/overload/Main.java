package study.overload;

public class Main {

    public static int sum(int a, int b) {
        return a + b;
    }
    public static float sum(float a, float b) {
        return a + b;
    }
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {

        System.out.println (sum(5, 7));
        System.out.println (sum(5, 7, 9));
        System.out.print (sum(0.5f, 1.9f));

    }
}