package study.anonymous_nested_classes;

public class Computer {

    class Processor {

        private boolean isStart = false;

        public void start () {
            isStart = true;
            System.out.printf ("is start ? %s%n", isStart);
        }

        public void shutdown () {
            isStart = false;
            System.out.printf ("is start ? %s%n", isStart);
        }
    }
    Processor i7 = new Processor ();
}
