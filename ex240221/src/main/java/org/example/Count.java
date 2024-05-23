package org.example;

public class Count {
    private int cnt;

    synchronized void incre(){
        cnt++;
    }

    synchronized void decre(){
        cnt--;
    }

    public int getCnt() {
        return cnt;
    }
}
