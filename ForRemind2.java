
public class ForRemind2 {
    public static void main(String[] args) {
        //2또는 3의 배수 1에서20까지
        for (int i = 1; i <=20; i++ ) {
            if ((i % 2 == 0) && (i % 3 == 0)) {
                System.out.println(i + " : 2와 3의 배수");
            }
            else if ((i % 2 == 0) || (i % 3 == 0)) {
                System.out.println(i + " : 2또는 3의 배수");
            }
        } // if , else if 식들의 우선순위까지 생각하기
    } //end of main
}