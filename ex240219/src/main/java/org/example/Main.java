package org.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public Main(){
        fileWrite();
        fileRead();
    }

    private void fileRead() {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("date.dat");
            int dat = fis.read();
            System.out.println(dat);
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void fileWrite() {
        try {
            FileOutputStream fos = new FileOutputStream("date.dat");
            fos.write(7);
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}