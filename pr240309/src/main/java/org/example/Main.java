package org.example;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> playTime1 = new ArrayList<>();

        List<Integer> test = new ArrayList<>();

        playTime1.add(107);
        playTime1.add(109);
        playTime1.add(116);
        playTime1.add(132);
        playTime1.add(134);

        Collections.shuffle(playTime1);
        for (int i = 0; i < playTime1.size(); i++) {
            if (i != 0) {
                Collections.rotate(playTime1, 4);
            }
            for (int j = 0; j < playTime1.size(); j++) {
                test.add(playTime1.get(j));
            }
        }

        List<LocalDateTime> startTime1 = new ArrayList<>();
        List<LocalDateTime> startTime2 = new ArrayList<>();
        List<LocalDateTime> startTime3 = new ArrayList<>();
        List<LocalDateTime> startTime4 = new ArrayList<>();
        List<LocalDateTime> startTime5 = new ArrayList<>();
        List<LocalDateTime> endTime1 = new ArrayList<>();
        List<LocalDateTime> endTime2 = new ArrayList<>();
        List<LocalDateTime> endTime3 = new ArrayList<>();
        List<LocalDateTime> endTime4 = new ArrayList<>();
        List<LocalDateTime> endTime5 = new ArrayList<>();
        LocalDateTime openTime1 = LocalDateTime.of(2024, 03, 9, 9, 20);
        LocalDateTime openTime2 = LocalDateTime.of(2024, 03, 9, 9, 20);
        LocalDateTime openTime3 = LocalDateTime.of(2024, 03, 9, 9, 20);
        LocalDateTime openTime4 = LocalDateTime.of(2024, 03, 9, 9, 20);
        LocalDateTime openTime5 = LocalDateTime.of(2024, 03, 9, 9, 20);

        for (int i = 0; i < test.size(); i++) {

            switch (i){
                case 0,5,10,15,20:
                    if (i == 0) {
                        startTime1.add(openTime1);
                        openTime1 = openTime1.plusMinutes(test.get(i));
                        endTime1.add(openTime1);

                    } else {
                        startTime1.add(openTime1.plusMinutes(30));
                        openTime1 = openTime1.plusMinutes(test.get(i));
                        endTime1.add(openTime1.plusMinutes(30));
                    }
                    break;
                case 1,6,11,16,21:
                    if (i == 1) {
                        startTime2.add(openTime2);
                        openTime2 = openTime2.plusMinutes(test.get(i));
                        endTime2.add(openTime2);

                    } else {
                        startTime2.add(openTime2.plusMinutes(30));
                        openTime2 = openTime2.plusMinutes(test.get(i));
                        endTime2.add(openTime2.plusMinutes(30));
                    }
                    break;
                case 2,7,12,17,22:
                    if (i == 2) {
                        startTime3.add(openTime3);
                        openTime3 = openTime3.plusMinutes(test.get(i));
                        endTime3.add(openTime3);

                    } else {
                        startTime3.add(openTime3.plusMinutes(30));
                        openTime3 = openTime3.plusMinutes(test.get(i));
                        endTime3.add(openTime3.plusMinutes(30));
                    }
                    break;
                case 3,8,13,18,23:
                    if (i == 3) {
                        startTime4.add(openTime4);
                        openTime4 = openTime4.plusMinutes(test.get(i));
                        endTime4.add(openTime4);

                    } else {
                        startTime4.add(openTime4.plusMinutes(30));
                        openTime4 = openTime4.plusMinutes(test.get(i));
                        endTime4.add(openTime4.plusMinutes(30));
                    }
                    break;
                case 4,9,14,19,24:
                    if (i == 4) {
                        startTime5.add(openTime5);
                        openTime5 = openTime5.plusMinutes(test.get(i));
                        endTime5.add(openTime5);

                    } else {
                        startTime5.add(openTime5.plusMinutes(30));
                        openTime5 = openTime5.plusMinutes(test.get(i));
                        endTime5.add(openTime5.plusMinutes(30));
                    }
                    break;
            }
        }
        for (int i = 0; i < startTime1.size();i++){
            System.out.println("1관 " + startTime1.get(i).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")) + " " + endTime1.get(i).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")));
            System.out.println("2관 " + startTime2.get(i).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")) + " " + endTime2.get(i).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")));
            System.out.println("3관 " + startTime3.get(i).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")) + " " + endTime3.get(i).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")));
            System.out.println("4관 " + startTime4.get(i).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")) + " " + endTime4.get(i).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")));
            System.out.println("5관 " + startTime5.get(i).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")) + " " + endTime5.get(i).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")));
        }
    }
}