package org.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Main7 {
    public static void main(String[] args) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("cc.txt"))) {
            bw.write("공부를 하기 위해서 돈이 필요한 건 아니다.");
            bw.write("필요한듯");
            bw.newLine();
            bw.write("....");
        }catch (Exception e){
            e.printStackTrace();
        }

        try(BufferedReader br = new BufferedReader(new FileReader("cc.txt"))) {
            while (true) {
                String str =  br.readLine();
                if (str == null) {
                    break;
                }
                System.out.println(str);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
