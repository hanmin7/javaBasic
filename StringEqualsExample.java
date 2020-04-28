
public class StringEqualsExample {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        System.out.println(str1 == str2);
        System.out.println(str1 == str3); // 같지않다고 나옴
        System.out.println(str1.equals(str3));
        // 참조타입. 기본데이터타입 int뭐..등등 그 외는 equals로 비교해줘야함

    }

}