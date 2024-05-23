package org.example;

class Mbox<T>{

    private T t;

    public Mbox(T t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "Mbox{" +
                "t=" + t +
                '}';
    }
}

public class Main4 {
    public static void main(String[] args) {
        Mbox<String> mbox = new Mbox<>("I am so happy");
        System.out.println(mbox);

        Mbox<Integer> ibox = new Mbox<>(100);
        System.out.println(ibox);

        Mbox<Mbox<String>> mmbox = new Mbox<Mbox<String>>(mbox);
        System.out.println(mmbox);

//        mmbox = new Mbox<>(ibox);
    }
}
