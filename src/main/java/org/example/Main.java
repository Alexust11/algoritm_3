package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Main {
   public static ArrayList<Integer> list=new ArrayList<Integer>();
    public static void main(String[] args) {
       addNew(21,20);
        System.out.println(list.toString());



    }
    public static void addNew(Integer index, Integer item) {
        if (index > list.size()) {
            grow();
        }
    }

    public static void grow() {
        list.ensureCapacity();

    }

}
