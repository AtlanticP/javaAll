package com.sorting;

import java.util.ArrayList;

public class RandomArrayList {

    byte n;
    public RandomArrayList(byte n) {
            this.n = n;
        }
    public ArrayList getList() {
        ArrayList list = new ArrayList ();
        for (byte i = 0; i < n; i++) {
            list.add ((byte) (Math.random () * 30));
        }
        return list;
    }
}

