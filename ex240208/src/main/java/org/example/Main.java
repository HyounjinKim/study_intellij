package org.example;

/*
    list 컬렉션 ROBOT,APPLE,BANANA
 */

import java.util.*;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("ROBOT","APPLE","BANANA","BOX","AA");
        list = new ArrayList<>(list);

        // Arrays.sort
//        Collections.sort(list, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length() - o2.length();
//            }
//        });

        Comparator<String> comp = (o1,o2) -> o1.length() - o2.length();
        Collections.sort(list,comp);


        System.out.println(list);

        Consumer<String> con = s -> {
            System.out.print(s+" ");
            System.out.println(s.length());
        };

        list.stream().forEach(con);
    }
}