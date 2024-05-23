package org.example;

class EBox<T extends Number>{

    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}

public class Main5 {
    public static void main(String[] args) {
        EBox<Integer> ebox = new EBox<>();
        ebox.setT(100);
        System.out.println(ebox.getT());
    }
}
