package vit.oop.third2;

public class MyArray {
    private class Element {
        public double value;
        public Element next;
        public int size;
    }

    private Element first;
    private Element last;

    int cnt = 1;

    private Element getElementById(int index) {


        if (index > cnt) {
            return null;
        } else {
            Element cur = first;
            for (int i = 0; i <= index; i++) {
                cur = cur.next;
            }
            return cur;
        }
    }

    public void add(double value) {

        Element current = new Element ();
        current.value = value;
//        last.size = cnt;

        if (first != null) {
            last.next = current;
            last = current;
        } else {
            first = last = current;
        }
        cnt++;
    }

    public void add(int index, double value) {

        Element previous = getElementById (index -1 );
        Element current = new Element ();
        current.value = value;
        Element next = getElementById (index);

        previous.next = current;
        current.next = next;
        last.size += 1;
    }

    public Double getValue(int index) {
        if (index > last.size) {
            return null;
        } else {
            Element current = getElementById (index);
            return current.value;
        }
    }

    public int getSize() {
        return last.size;
    }

}
