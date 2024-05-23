package org.example;

class BB{}
interface Inter{
    public void interFuntion();
}
public class Main6 {

    public Main6() {
        doA(100,new BB(),()->{System.out.println("aaa");});
    }

    public void doA(int a, BB b,Inter inter){
        inter.interFuntion();
        System.out.println("test");
    }

    public static void main(String[] args) {
        new Main6();
//        Main6 m = new Main6();
//        m.doA();
    }
}
