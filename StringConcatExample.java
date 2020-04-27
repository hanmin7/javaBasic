import javax.sound.sampled.SourceDataLine;

public class StringConcatExample {
    public static void main(String[] args) {
        System.out.println("Hello, World");
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1 + ", " + str2;
        System.out.println(str3);

        System.out.println("result: " + 3 + 30);
        // 앞에 result문자가 와서 3다음30 이어서 나옴
        System.out.println("result: " + (3 + 30));
        System.out.println(3 + 30 + "result: ");
        // 먼저 숫자가 오면 숫자계산

    }
}