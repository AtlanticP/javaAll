//package com.sorting;
//
//import java.util.ArrayList;
//
//public class Bubble extends Sort {
//
//
//    @Override
//    ArrayList sortList(ArrayList list) {
//
//        int i = 0;
//
//        boolean swapped = true;
//        boolean isUp = true;
//        while (swapped) {
//            swapped = false;
//            switch (isUp) {
//                case (true): {
//                    if (list.get (i + 1).hashCode () < list.get (i).hashCode ()) {
//                        swapList (i, i + 1, list);
//                        swapped = true;
//                        i++;
//                        if (i == list.size () - 1)
//                            isUp = false;
//                        continue;
//                        i++;
//                        break;
//                    }
//                }
//                case (false): {
//                    if (list.get (i + 1).hashCode () < list.get (i).hashCode ()) {
//                        swapList (i, i + 1, list);
//                        swapped = true;
//
//                    }
//            }
//            return null;
//        }
//        }
//    }
//
//}
//
