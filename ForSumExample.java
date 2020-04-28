
public class ForSumExample {

    public static void main(String[] args) {
        //1부터 100까지 합을 구하는 프로그램
        //3의 배수만 구하는 프로그램

        int sum = 0;
        for ( int i = 1; i <= 100; i++) {
            if (i % 3 == 0 ) {
                sum = sum + i;
            }
        }
        System.out.println("1 ~ 100 3의 배수의 합" + sum);

    }
}