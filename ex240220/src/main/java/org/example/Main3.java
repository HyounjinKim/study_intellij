package org.example;

import javax.imageio.IIOException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main3 {
    public static void main(String[] args) {

        Path path = Paths.get("d:\\javastudy\\AA.java");
        Path dp = Paths.get("d:\\javastudy\\EMPTY");
        Path aaa = Paths.get("d:\\aa\\bb\\cc");

        try{
            if (!Files.exists(path)) // 파일이 없으면 파일 생성 이 부분이 없으면 이미 있는 파일일때 에러남
                Files.createFile(path); // 파일 만들기
            if (!Files.exists(dp))
                Files.createDirectory(dp); // 폴더 만들기
            if (!Files.exists(aaa))
                Files.createDirectories(aaa); // 폴더 한번에 만들기

        }catch (IOException e){
            e.printStackTrace();
        }

        try(FileWriter fw = new FileWriter("aaa.txt")){
            fw.write("새로운 문자열");
            fw.write("\n");
            fw.write("테스트");
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
