package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main8 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        System.out.println(now.format(DateTimeFormatter.ofPattern("YYYY-MM-dd HH:mm:ss")));
        System.out.println(now.format(DateTimeFormatter.ofPattern("YYYY-MM-dd")));
    }
}
