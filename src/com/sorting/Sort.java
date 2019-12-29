package com.sorting;

import java.util.ArrayList;

abstract public class Sort {
    abstract ArrayList sortList (ArrayList list);
    public void swapList(int x, int y, ArrayList list) {
        Object t;
        t = list.get(x);
        list.set(x, list.get(y));
        list.set(y, t);
    }
}
