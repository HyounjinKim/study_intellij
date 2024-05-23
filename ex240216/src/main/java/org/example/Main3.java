package org.example;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        Instant before = Instant.now();
        System.out.println(before.getNano());

        List<String> list = Arrays.asList("aaa","ddd","wqwewqe","qewqdas","sdasd");
        list.stream().forEach(System.out::println);

        Instant after = Instant.now();
        System.out.println(after.getNano());

        Duration between = Duration.between(before,after);
        System.out.println(between);
        for (String temp:list){
            System.out.println(temp);
        }
        after = Instant.now();

        Duration between2 = Duration.between(before,after);
        System.out.println(between2);
    }
}
