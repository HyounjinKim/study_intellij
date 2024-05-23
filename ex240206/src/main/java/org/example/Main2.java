package org.example;


import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        ENUM_STUDY_DB edb = new ENUM_STUDY_DB();

        while (true) {
            edb.insert();
            edb.select();

            Scanner sc = new Scanner(System.in);
            System.out.println("수정하고 싶은 id");
            int tmp = sc.nextInt();

            edb.update(tmp);
            edb.select();

            System.out.println("삭제하고 싶은 id");
            tmp = sc.nextInt();

            edb.delete(tmp);
            edb.select();
        }
    }
}
