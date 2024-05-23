package org.example;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\javastudy\\PathDemo.java");

        System.out.println(path.getRoot());
        System.out.println(path.getParent());
        System.out.println(path.getFileName());

        System.out.println();

        // 현재경로를 상대경로로 작성
        Path curpath  = Paths.get("");

        if (curpath.isAbsolute()){
            System.out.println(curpath);
        }
        else {
            String temp = curpath.toAbsolutePath().toString();
            System.out.println(temp);
        }

        try(FileOutputStream fos = new FileOutputStream("C:\\Users\\hyoun\\IdeaProjects\\ex240220\\bb.dat")) {
             fos.write(10);
             fos.write(20);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}