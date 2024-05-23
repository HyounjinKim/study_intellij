package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main5 {
    public static void main(String[] args) {

        // List -> ArrayList,LinkedList
        // Set -> HashSet, TreeSet
        // HashSet 중복X
        // TreeSet 순서정렬

        List<String> list = Arrays.asList("Toy","Box","ROBOT","Toy");
        System.out.println(list);

        Set<String> set = new HashSet<>(list);
        System.out.println(set);
    }
}
