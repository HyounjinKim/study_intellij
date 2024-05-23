package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("BOX","TOY","ROBOT","SAMPLE");
        list = new ArrayList<>(list);
        List<String> clist = Arrays.asList("BOX","TOY","ROBOT","SAMPLE");
        clist = new ArrayList<>(clist);

        clist.addAll(clist);
        System.out.println(clist);

        List streamlist = list.stream()
                .filter(s -> s.length() > 3)
                .collect(()-> new ArrayList<>(),(objects, s) -> objects.add(s),(lst1,lst2)->lst1.addAll(lst2));

        System.out.println(streamlist);

        List streamlist2 = list.stream().filter(s -> s.length() > 3).collect(Collectors.toList());
        System.out.println(streamlist2);


        List<String> list2 = new ArrayList<>();
        for(String tmp:list){
            if(tmp.length() > 3){
                list2.add(tmp);
            }
        }
        System.out.println(list2);
    }
}
