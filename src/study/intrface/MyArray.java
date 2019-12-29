package study.intrface;

public class MyArray implements Array {

    int n = 5;
    int a[] = new int[n];
    int size = 0;

    @Override
    public int Get(int i) {
        return a[i];
    }

    @Override
    public boolean Add(int val) {
        if (a.length != size) {
            a[size] = val;
            size++;
            return true;
        } else {
            return false;
        }
    }
}
