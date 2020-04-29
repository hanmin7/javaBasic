
public class ForRemind {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <=10; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
                continue;
            } else {
                System.out.println(i + "는 홀수입니다.");
            }
            System.out.println(i);
        }
        System.out.println("sum: " + sum);
    }
}