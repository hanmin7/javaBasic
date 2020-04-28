
public class WhileExample {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum = sum + i;
        }

        //while 사용
        int i = 1;
        while(i <= 5) {
            sum = sum + i;
            i++;
        }
        System.out.println("sum1: " + sum);

        //while...
        i = 1;
        sum = 0;
        while (true) {
            if (i > 5) {
                break;
            }
            sum = sum + i;
            i++;
        }
        System.out.println("sum2: " + sum);


        i = 1;
        sum = 0;
        while (i <= 100) {
            if (i % 2 == 0)
            sum = sum + i;
            i++;
        }
        System.out.println("100까지짝수합: " + sum);


        i = 1;
        sum = 0;
        while (i <= 100) {
            if (i % 2 == 1)
            sum = sum + i;
            i++;
        }
        System.out.println("100까지홀수합: " + sum);

        i = 1;
        sum = 0;
        while (true) {
            if (i > 100) {
                break;
            }
            if (i % 2 ==1) {
                sum = sum + i;
            }
            i++;
        }
        System.out.println("100까지 홀수 합(true이용): " + sum);


   } //end of main()
}