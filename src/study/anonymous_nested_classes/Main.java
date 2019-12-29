package study.anonymous_nested_classes;

public class Main {
    public static void main(String[] args) {


        // NESTED CLASSES

        Computer comp = new Computer ();
        comp.i7.start ();
        comp.i7.shutdown ();

        // ANONYMOUS CLASSES
//        Computer comp;
//        comp = new Computer () {
//            void superComp () {
//
//                this.i7.start ();
//                this.i7.shutdown ();
//            }
//        };

    }
}