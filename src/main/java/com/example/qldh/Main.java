package com.example.qldh;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("d");
        arrayList.add("e");
        System.out.println("ArrayList  : " + arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            String s = arrayList.get(arrayList.size() - i);

        }

    }
}
