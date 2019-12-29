package vit.list;

public class List {
    class Element {
        public double value;
        public Element next;
    }

    private Element first;
    private Element last;

    private int count;

    public void add(double val) {
        Element current = new Element ();

        current.value = val;

        if (first == null) {
            first = last = current;
        }
        else {
            last.next = current;
            last = current;
        }
        count++;
    }

    private Element getElementAt(int index) {
        if (index >= count) {
            return null;
        }

        Element current = first;
        for (int n=1; n <= index; n++) {
            current = current.next;
        }
        return current;
    }

    public double getAt(int index) {
        Element current = getElementAt (index);
        if (current == null) {
            return 0.000001f;
        }
        else {
            return current.value;
        }
    }

    public void addAt(int index, double val) {
        index--;
        Element prev = getElementAt (index),
                next = prev.next,
                current = new Element ();
        prev.next = current; current.next = next; current.value = val;
    }

    public void delAt(int index) {
        index--;
        Element prev = getElementAt (index),
                current = prev.next, next = current.next;
        prev.next = next;
    }
}
