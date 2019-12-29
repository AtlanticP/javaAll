package com.sorting;

import java.util.ArrayList;

public class Stupid extends Sort {
    @Override
    ArrayList sortList(ArrayList list) {

        int i = 0;

        while (i < list.size ()-1) {

            if (list.get (i+1).hashCode () < list.get(i).hashCode ()) {
                swapList (i, i+1, list);
                i = 0;
            }
            i++;
        }

        return list;
    }
}
