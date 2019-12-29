package com.sorting;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        byte n = 7;
        RandomArrayList rndml = new RandomArrayList (n);
        ArrayList list = rndml.getList ();
        System.out.println (list);
        Sort gnome = new Gnome ();
        ArrayList gnomeList =  gnome.sortList (list);
        System.out.println ("Gnome sorting: " + gnomeList);
        Sort stupid = new Stupid ();
        ArrayList stupidList = stupid.sortList (list);
        System.out.println ("Stupid sorting: " +stupidList);

//        Sort bubble = new Bubble();
//        ArrayList bubbleList = bubble.sortList (list);
//        System.out.println (bubbleList);
//        ArrayList<Sort> sorted = new ArrayList<> ();
//        sorted.add();
    }
}