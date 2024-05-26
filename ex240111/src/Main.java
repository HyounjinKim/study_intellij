public class Main {
    public static void main(String[] args) {
        int[] lottoNumber = new int[45];

        for (int i = 0; i < lottoNumber.length; i++) {
            lottoNumber[i] = (int) (Math.random() * 45) + 1;
            int count = 0;
            for (int j = 0; j < i; j++) {
                if (lottoNumber[i] == lottoNumber[j]) {
                    count++;
                }
            }
            if (count > 0) {
                lottoNumber[i] = (int) (Math.random() * 45) + 1;
            }
            System.out.println(count);
        }

        for (int i = 0; i < lottoNumber.length; i++) {

            System.out.print(lottoNumber[i] + " ");
        }
    }
}