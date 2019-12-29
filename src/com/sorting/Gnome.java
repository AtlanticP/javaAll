package com.sorting;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class Gnome extends Sort {

    @Override
    public ArrayList sortList(@NotNull ArrayList list) {

        int cnt = 0;
        byte i = 1;
        while (i < list.size ()) {
            if (list.get(i-1).hashCode () > list.get(i).hashCode ()) {
                swapList (i, i-1, list);
                if (i != 1)
                    i--;
                continue;
            }
            i++;
            cnt++;
        }
        return list;
    }
}

