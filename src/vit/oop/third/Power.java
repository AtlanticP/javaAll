package vit.oop.third;

public class Power extends MyArray {

    public Power(char a, char b) {
        super (a, b);
    }
    public Power(int a, int b) {
        super (a, b);
    }
    public int getPower() {
        return array.size ();
    }
}
