package org.example;

import java.util.function.Predicate;

public class Main3 {
    public static void doPredicate(Predicate<Integer> p, int t) {
        boolean result = p.test(t);
        System.out.println(result);
    }

    public static void main(String[] args) {

        doPredicate(i -> i == 100, 100);
        doPredicate(i -> i == 99, 100);

    }
}
