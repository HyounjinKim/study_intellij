package org.example;

import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        String[] str = {"홍길동","김길동","박길동"};

        Arrays.stream(str).forEach(s -> System.out.println(s));
        System.out.println();
        Arrays.stream(str).forEach(System.out::println);

        System.out.println(

        );
        for (String tmp:str){
            System.out.println(tmp);
        }
    }
}
