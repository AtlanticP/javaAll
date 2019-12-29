package com.abstractClasses;

public class Main {
    public static void main(String[] args) {
        System.out.println ("package com.abstractClasses;");

        Shape[] arr = new Shape[]{new Circle (), new Triangle ()};
        for (int i = 0; i < arr.length; i++) {
            arr[i].draw ();
        }
    }
}
