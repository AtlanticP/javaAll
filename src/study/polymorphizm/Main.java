package study.polymorphizm;

public class Main {
    public static void main(String[] args) {

//                PERSONS

//        Person viktor = new Person();
//        Person vladimir = new Person();
//        System.out.println ("Viktor's height is " + viktor.height);
//        System.out.println ("Vladimir's height is " + vladimir.height);
//        viktor.height = 168;
//        viktor.say("Vityok!");
//
//        Person viktor = new Person(120);
//        Person vladimir = new Person(180);
//        System.out.println ("Viktor's height is " + viktor.height);
//        System.out.println ("Vladimir's height is " + vladimir.height);
//        System.out.println ("");
//
//        Student student = new Student (158, "Julya", (byte) 2);
//        student.tell ();

//        SHAPES   Polymorphyzm

        Shape[] array = new Shape[] {new Triangle (), new Square (), new Rectangle ()};

        for (int i = 0; i < array.length; i++) {
            array[i].draw ();
        }




    }
}