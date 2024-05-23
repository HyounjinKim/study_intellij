package org.example;

interface Calculate<T>{
    void cal(T a,T b);
}

public class Main4 {
    public static void main(String[] args) {
        Calculate<Integer> cal1 = (a, b) -> System.out.println(a+b);
        cal1.cal(10,20);

        Calculate<Double> cal2 = (a, b) -> System.out.println(a+b);
        cal2.cal(10.d,20.d);

        Calculate<String> cal3 = (a, b) -> System.out.println(a+b);
        cal3.cal("zzz","xxx");
    }
}
