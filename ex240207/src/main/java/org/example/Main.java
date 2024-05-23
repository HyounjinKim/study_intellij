package org.example;

// 스태틱 메서드에서는 스태틱 변수 사용 가능, heap 영역 변수 사용X
// heap 메서드이면 heap 영역 변수, 스태틱 변수 사용 가능
class Outer{
    private static int num = 0;

    public static class Nested1{
        public void add(int n){num+=n;}
    }
    public static class Nested2{
        public int get(){
            int a = 10;
            return num+a;
        }
        public void doPrint(){
            System.out.println(num);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Outer.Nested1 nes1 = new Outer.Nested1();
        nes1.add(100);

        Outer.Nested2 nes2 = new Outer.Nested2();
        System.out.println(nes2.get());
        nes2.doPrint();
    }
}