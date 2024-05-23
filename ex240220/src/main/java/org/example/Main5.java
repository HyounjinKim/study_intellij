package org.example;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class Main5 {
    public static void main(String[] args) throws Exception{
        Path org = Paths.get("nio.txt");
        if (!Files.exists(org))
            Files.createFile(org);

        Path dst = Paths.get("niocopy.txt");

        // 파일복사, 존재하면 대체
        Files.copy(org,dst, REPLACE_EXISTING);
        // 파일이동 잘라내서 이동 시킴
        Files.move(Paths.get("aaa.txt"),Paths.get("bbb.txt"), REPLACE_EXISTING);
    }
}
