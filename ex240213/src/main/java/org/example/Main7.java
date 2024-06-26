package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Main7 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(11,22,33,44,55);
        list.forEach(integer -> System.out.println(integer));

        System.out.println();
        for (int i:list){
            System.out.println(i);
        }

        System.out.println();
        Consumer<String> consumer = s -> System.out.println(s.length());
        consumer.accept("abcde");
        consumer.accept("123");

        System.out.println();
        BiConsumer<String,String> biConsumer = (s,s2) -> System.out.println(s+s2);
        biConsumer.accept("aa","bb");
        biConsumer.accept("cc","dd");

        Consumer<Integer> con = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };

        Consumer<Integer> con1 = i-> System.out.println(i);

    }
}
