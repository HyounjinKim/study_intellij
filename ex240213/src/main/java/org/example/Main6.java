package org.example;

import java.util.function.Consumer;

public class Main6 {
    public static void main(String[] args) {
        Consumer<String> consumer = s -> System.out.println(s);

        consumer.accept("공부");
        consumer.accept("하네요");
        consumer.accept("이걸");
    }
}
