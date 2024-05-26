import java.util.Arrays;

/*
    String
    성적관리 프로그램
    국어 영어 수학
    [0]["홍길동"] = [100],[80],[90]
    [1]["이길동"] = [70],[90],[100]
    [2]["박길동"] = [80],[70],[200]

 */
public class Ex05 {
    public static void main(String[] args) {
        String[] student1 = {"홍길동","80","90","100"};
        String[] student2 = {"이길동","70","60","80"};
        String[] student3 = {"박길동","100","90","40"};

        String [][] all = {student1,student2,student3};

        System.out.println("학생의 숫자 = " + all.length + "명");

        int korsum = 0;
        int engsum = 0;
        int mathsum = 0;

        for (int i = 0; i < all.length; i++) {
            korsum += Integer.parseInt(all[i][1]);
            engsum += Integer.parseInt(all[i][2]);
            mathsum += Integer.parseInt(all[i][3]);
        }
        System.out.println("국어점수 총합 = " + korsum);
        System.out.println("국어점수 평균 = " + korsum/all.length);

        System.out.println("영어점수 총합 = " + engsum);
        System.out.println("영어점수 평균 = " + engsum/all.length);

        System.out.println("수학점수 총합 = " + mathsum);
        System.out.println("수학점수 평균 = " + mathsum/all.length);

        System.out.println("모든점수 평균 = " + mathsum);
        System.out.println((korsum+engsum+mathsum) / (all.length*3));
        // 학생의 숫자, 학생들 국어평균,영어평균,수학평균
        // 모든 점수의 평균, 123등 구하기

        int student1_total[] = new int[3];

        for (int i = 0; i < 3; i++) {
            for (int j = 1; j < 4; j++) {
                student1_total[i] += Integer.parseInt(all[i][j]);
            }
        }
        System.out.println(Arrays.toString(student1_total));
    }
}
