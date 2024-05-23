package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ItemDB id = new ItemDB();

        List<Item> list = id.findAll();

        Collections.sort(list);

        for(int i =0;i<list.size();i++){
            Item temp = list.get(i);
            System.out.println(temp);
        }


    }
}