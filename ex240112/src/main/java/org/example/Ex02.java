package org.example;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열 입력");
        String str = sc.nextLine();
        String answer = "";

        System.out.println("숫자 입력");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            answer += str;
        }
        System.out.println(answer);
    }
}