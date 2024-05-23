package org.example;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

/*
    107/109/116/132/134
    109/107/132/134/116
    116/132/134/109/107
    132/134/107/116/109
    134/116/109/107/132
 */

public class Main {
    public static void main(String[] args) {

        List<Integer> movieNum = new ArrayList<>();
        List<Integer> playTime1 = new ArrayList<>();
        List<Integer> playTime2 = new ArrayList<>();
        List<Integer> playTime3 = new ArrayList<>();
        List<Integer> playTime4 = new ArrayList<>();
        List<Integer> playTime5 = new ArrayList<>();
        List<Integer> playTimeCopy1 = new ArrayList<>();
        List<Integer> playTimeCopy2 = new ArrayList<>();
        List<Integer> playTimeCopy3 = new ArrayList<>();
        List<Integer> playTimeCopy4 = new ArrayList<>();
        List<Integer> playTimeCopy5 = new ArrayList<>();

        playTime1.add(107);
        playTime1.add(109);
        playTime1.add(116);
        playTime1.add(132);
        playTime1.add(134);

        playTime2.add(109);
        playTime2.add(107);
        playTime2.add(132);
        playTime2.add(134);
        playTime2.add(116);

        playTime3.add(116);
        playTime3.add(132);
        playTime3.add(134);
        playTime3.add(109);
        playTime3.add(107);

        playTime4.add(132);
        playTime4.add(134);
        playTime4.add(107);
        playTime4.add(116);
        playTime4.add(109);

        playTime5.add(134);
        playTime5.add(116);
        playTime5.add(109);
        playTime5.add(107);
        playTime5.add(132);

        Collections.shuffle(playTime1);
        Collections.shuffle(playTime2);
        Collections.shuffle(playTime3);
        Collections.shuffle(playTime4);
        Collections.shuffle(playTime5);

        for (int i = 0; i < playTime1.size(); i++) {
            playTimeCopy1.add(playTime1.get(i));
            playTimeCopy1.add(playTime1.get(i));
            playTimeCopy2.add(playTime2.get(i));
            playTimeCopy2.add(playTime2.get(i));
            playTimeCopy3.add(playTime3.get(i));
            playTimeCopy3.add(playTime3.get(i));
            playTimeCopy4.add(playTime4.get(i));
            playTimeCopy4.add(playTime4.get(i));
            playTimeCopy5.add(playTime5.get(i));
            playTimeCopy5.add(playTime5.get(i));
        }
        Collections.shuffle(playTimeCopy1);
        Collections.shuffle(playTimeCopy2);
        Collections.shuffle(playTimeCopy3);
        Collections.shuffle(playTimeCopy4);
        Collections.shuffle(playTimeCopy5);

        List<LocalDateTime> startTime1 = new ArrayList<>();
        List<LocalDateTime> endTime1 = new ArrayList<>();
        List<LocalDateTime> startTime2 = new ArrayList<>();
        List<LocalDateTime> endTime2 = new ArrayList<>();
        List<LocalDateTime> startTime3 = new ArrayList<>();
        List<LocalDateTime> endTime3 = new ArrayList<>();
        List<LocalDateTime> startTime4 = new ArrayList<>();
        List<LocalDateTime> endTime4 = new ArrayList<>();
        List<LocalDateTime> startTime5 = new ArrayList<>();
        List<LocalDateTime> endTime5 = new ArrayList<>();

        LocalDateTime openTime1 = LocalDateTime.of(2024, 03, 8, 9, 20);
        LocalDateTime openTime2 = LocalDateTime.of(2024, 03, 8, 9, 20);
        LocalDateTime openTime3 = LocalDateTime.of(2024, 03, 8, 9, 20);
        LocalDateTime openTime4 = LocalDateTime.of(2024, 03, 8, 9, 20);
        LocalDateTime openTime5 = LocalDateTime.of(2024, 03, 8, 9, 20);
        for (int i = 0; i < 6; i++) {

            if (i == 0) {
                startTime1.add(openTime1);
                openTime1 = openTime1.plusMinutes(playTimeCopy1.get(i));
                startTime2.add(openTime2);
                openTime2 = openTime2.plusMinutes(playTimeCopy2.get(i));
                startTime3.add(openTime3);
                openTime3 = openTime3.plusMinutes(playTimeCopy3.get(i));
                startTime4.add(openTime4);
                openTime4 = openTime4.plusMinutes(playTimeCopy4.get(i));
                startTime5.add(openTime5);
                openTime5 = openTime5.plusMinutes(playTimeCopy5.get(i));
            } else {
                if(playTimeCopy1.get(i-1) == playTimeCopy1.get(i)){
                    Collections.rotate(playTimeCopy1,i);

                    startTime1.add(openTime1.plusMinutes(30));
                    openTime1 = openTime1.plusMinutes(playTimeCopy1.get(i) + 30);
                }
                else{
                    startTime1.add(openTime1.plusMinutes(30));
                    openTime1 = openTime1.plusMinutes(playTimeCopy1.get(i) + 30);
                }

                if(playTimeCopy2.get(i-1) == playTimeCopy2.get(i)){
                    Collections.rotate(playTimeCopy2,i);

                    startTime2.add(openTime2.plusMinutes(30));
                    openTime2 = openTime2.plusMinutes(playTimeCopy2.get(i) + 30);
                }
                else{
                    startTime2.add(openTime2.plusMinutes(30));
                    openTime2 = openTime2.plusMinutes(playTimeCopy2.get(i) + 30);
                }
                if(playTimeCopy3.get(i-1) == playTimeCopy3.get(i)){
                    Collections.rotate(playTimeCopy3,i);

                    startTime3.add(openTime3.plusMinutes(30));
                    openTime3 = openTime3.plusMinutes(playTimeCopy3.get(i) + 30);
                }
                else{
                    startTime4.add(openTime4.plusMinutes(30));
                    openTime4 = openTime4.plusMinutes(playTimeCopy4.get(i) + 30);
                }
                if(playTimeCopy5.get(i-1) == playTimeCopy5.get(i)){
                    Collections.rotate(playTimeCopy5,i);

                    startTime5.add(openTime5.plusMinutes(30));
                    openTime5 = openTime5.plusMinutes(playTimeCopy5.get(i) + 30);
                }
                else{
                    startTime5.add(openTime5.plusMinutes(30));
                    openTime5 = openTime5.plusMinutes(playTimeCopy5.get(i) + 30);
                }
            }

            endTime1.add(openTime1);
            endTime2.add(openTime2);
            endTime3.add(openTime3);
            endTime4.add(openTime4);
            endTime5.add(openTime5);

            System.out.println("1관 " + startTime1.get(i).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")) + " " +
                    endTime1.get(i).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")) + " " + playTimeCopy1.get(i));
            System.out.println("2관 " + startTime2.get(i).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")) + " " +
                    endTime2.get(i).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")) + " " + playTimeCopy2.get(i));
            System.out.println("3관 " + startTime3.get(i).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")) + " " +
                    endTime3.get(i).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")) + " " + playTimeCopy3.get(i));
            System.out.println("4관 " + startTime4.get(i).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")) + " " +
                    endTime4.get(i).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")) + " " + playTimeCopy4.get(i));
            System.out.println("5관 " + startTime5.get(i).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")) + " " +
                    endTime5.get(i).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")) + " " + playTimeCopy5.get(i));
        }

    }
}