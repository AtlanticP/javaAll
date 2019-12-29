package study.polymorphizm;

public class Person {

    public int height = 180;
    public String name = "Default";

    public static void say(String name) {
        System.out.println ("Hello, " + name);
    }
    public Person () {}
    public Person (int h) {}
    public Person(int h, String n) {
        height = h;
        name = n;
    }
}
