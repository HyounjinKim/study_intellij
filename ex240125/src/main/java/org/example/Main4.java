package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main4 {

    public void doA(){
//        try {
            int[] ar = new int[10];
            ar[11] = 10;
            Scanner sc = new Scanner(System.in);

            System.out.println("숫자 입력");
            int a = sc.nextInt();

            System.out.println("숫자 입력");
            int b = sc.nextInt();

            System.out.println("a/b = " + a / b);
            System.out.println("try 구문 끝");
//            return;
//        }
//         catch (ArithmeticException e) {
//            System.out.println("0으로 못 나눔"+e.getMessage());
//        }catch (InputMismatchException ie){
//            System.out.println("문자 ㄴㄴ");
//        }
//        catch (Exception e){
//            e.printStackTrace();
//            System.out.println("모든예외");
//        }
//        finally {
//            System.out.println("Bye");
//        }
    }

    public static void main(String[] args) {

        Main4 main4 = new Main4();
        try {
            main4.doA();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("강제종료 실행안됨");
    }
}
