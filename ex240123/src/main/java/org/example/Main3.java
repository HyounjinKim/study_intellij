package org.example;

class Cake{
    public void yummy(){
        System.out.println("cake yummy");
    }
}
class ACake extends Cake{
    public void yummy(){
        System.out.println("Acake yummy");
    }
}
class BCake extends ACake{
    public void yummy(){
        super.yummy();
        System.out.println("Bcake yummy");
    }
}

public class Main3 {
    public static void main(String[] args) {
        Cake cb = new BCake();
        Cake ca = new ACake();
        cb.yummy();
        ca.yummy();

        System.out.println("=========");
        System.out.println(cb instanceof BCake);
        System.out.println(cb instanceof ACake);
        System.out.println("=========");

        System.out.println("=========");
        System.out.println(ca instanceof BCake);
        System.out.println(ca instanceof ACake);
        System.out.println("=========");
    }
}
