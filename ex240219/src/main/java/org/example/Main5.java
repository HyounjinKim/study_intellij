package org.example;

import java.io.FileWriter;

public class Main5 {
    public static void main(String[] args) {
        try(FileWriter out = new FileWriter("aa.txt")) {
            out.write('한');
            out.write("\n");
            out.write("문자열");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
