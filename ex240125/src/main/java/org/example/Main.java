package org.example;


interface Printable{
    int a = 10;
    public void print(String doc);

    default public void doA(){
        System.out.println("doA 메서드");
    }


}

interface CMYKPrintable extends Printable{
    public void printCMYK(String doc);
}

class PRN909 implements CMYKPrintable{

    @Override
    public void print(String doc) {
        System.out.println("S Printer 흑백 출력");
        System.out.println(doc);
    }

    @Override
    public void printCMYK(String doc) {
        System.out.println("S Printer 컬러 출력");
        System.out.println(doc);
    }
}

class SPrint implements Printable{
    @Override
    public void print(String doc) {
        System.out.println("S Printer 출력");
        System.out.println(doc);
    }
}

class LPrint implements Printable{
    @Override
    public void print(String doc) {
        System.out.println("L Printer 출력");
        System.out.println(doc);
    }
}

public class Main {
    public static void main(String[] args) {
        String doc = "REPORT";

    SPrint sp = new SPrint();
    LPrint lp = new LPrint();
    sp.print(doc);
    lp.print(doc);

    Printable p1 = (d)->{
        System.out.println("람다");

     };
     p1.print(doc);

        PRN909 prn909 = new PRN909();
        prn909.print("흑백출력");
        prn909.printCMYK("컬러출력");
    }
}