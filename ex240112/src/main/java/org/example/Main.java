package org.example;

import aa.bb.AA;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        System.out.println(a + b);

        AA aa = new AA();
        aa.doA();
        a = 30;
        System.out.println(a + b);
    }
}