package study.polymorphizm;

public class Student extends Person {

    byte course = 1;

    public Student (int h, String n, byte course) {
        super(h, n);
        this.course = course;
    }

    void tell () {
        System.out.println (super.name);
        System.out.println (super.height);
        System.out.println (this.course);
    }
}