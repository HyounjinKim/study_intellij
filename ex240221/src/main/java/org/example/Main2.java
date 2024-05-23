package org.example;

public class Main2 {
    public static void main(String[] args) throws InterruptedException {
        Count counnt = new Count();
        Runnable task1 = () ->{
          for(int i = 0;i< 1000;i++){
              counnt.incre();
          }
        };

        Runnable task2 = ()->{
            for(int i = 0;i< 1000;i++){
                counnt.decre();
            }
        };
        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(counnt.getCnt());
    }
}
