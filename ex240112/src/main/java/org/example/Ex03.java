package org.example;

import java.util.Scanner;

class AA{
    public void doA(){

    }
}
public class Ex03 {
    public static void main(String[] args) {
        AA aa = new AA();
        Scanner sc = new Scanner(System.in);
        Integer i = new Integer(10);
        String binString = Integer.toBinaryString(i);

                                        System.out.println(binString);
    }

}
