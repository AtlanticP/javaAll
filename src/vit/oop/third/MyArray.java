package vit.oop.third;

import java.util.ArrayList;

public class MyArray {
    private char a, b;
    private int c, d;
    protected ArrayList array = new ArrayList ();

    public MyArray(char a, char b) {
        this.a = a;
        this.b = b;
        this.array = getArray (a, b);
    }

    public MyArray(int c, int d) {
        this.c = c;
        this.d = d;
        this.array = getArray (c, d);
    }

    public ArrayList getArray(int a, int b) {

        int cnt = 0;
        for (int i = a; i <= b; i++) {
            array.add(cnt, i);
            cnt++;
        }
        return array;
    }

    public ArrayList getArray(char c, char d) {

        int cnt = 0;
        for (char ch = a; ch <= b; ch++) {
            array.add (cnt, ch);
            cnt++;
        }
        return array;
    }

    public void addElement(char ch) {
        array.add(ch);
    }
    public void addElement(int el) {
        array.add(el);
    }

    public void delElement(int el) {
        array.remove(el);
    }

    public boolean checkElement(char ch) {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).hashCode () == ch)
                return true;
        }
        return false;
    }
    public boolean checkElement(int d) {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).hashCode () == d)
                return true;
        }
        return false;
    }

}