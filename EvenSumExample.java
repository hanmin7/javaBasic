import java.util.*;

public class EvenSumExample {

    public static void main(String[] args) {

        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                continue;
            }
            sum = sum + i;
        }
        System.out.println("sum: " + sum);

        // 2또는 3의 배수를 출력하시오.
        for (int i = 1; i <= 100; i++) {
            // 조건 합 : 조건 A || 조건 B
            if ((i % 2 == 0) || (i % 3 == 0)) {
                System.out.println("2 또는 3의 배수 : " + i);
            }
            //2와 3의 공통배수
            if ((i % 2 == 0) && (i % 3 == 0)) {
                System.out.println("2와 3의 배수: " + i);
            }
            if ( !(i % 2 == 0)) {
                System.out.println("홀수값: " + i);
            } //not의 의미 = !
        }
    } // end of main
}