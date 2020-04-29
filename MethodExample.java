
public class MethodExample {
    public static void main(String[] args) {
        // System.out.println("result: " + sum(10, 20));
        // System.out.println("result: " + sum(10, 20, 30));
        // System.out.println("result: " + sum(10.5, 20.3));
        // System.out.println("1 ~10 합: " + toSum(1, 10));
        //printStar(1, 5);
        //printStar(3);
        //printDouble(10);
        //printDouble(10,5);
        //printString("Good Morning", "Hong");
        //printStar(3, "Hello");
        //printGugudan(8);
        printTriangle(5);

    }

    public static void printTriangle(int a) {
        for (int i = 1; i <= a; i++ ) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }



    public static void printGugudan(int dan){
        for (int i = 1; i<=9; i++)
        System.out.println(dan + " x " + i + " = " + (dan* i));
    }


    // 입력문자를 n번 반복하시오.
    public static void printStar(int a, String str) {
        for (int i = 1; i <= a; i++) {
            System.out.println(str);
        }
    }


    public static void printString(String str, String name ) {
        System.out.println(str + ", " + name);
    }

    public static void printString(String str ) {
        System.out.println(str);
    }


    //printDouble 매개값1번2번의 곱 나타나게하라
    public static void printDouble(int a, int b) {
        System.out.println("결과 : " + a * b);
    }

    //printDouble 입력값의 두배값 출력 메소드 만들어라
    public static void printDouble(int i) {
        System.out.println(i * 2);
    }


    public static void printStar(int a) {
        for (int i = 1; i <= a; i++) {
            System.out.println("****");
        }
    }
    
    public static void printStar(int a, int b) {
        for (int i = a; i <= b; i++) {
            System.out.println("*****");
        } // void는 반환값 없다. return 안적음. 위에main구문에서 sysout안적어도됨.

    }

    public static int toSum(int num1, int num2) {
        int sum = 0;
        for (int i = num1; i <= num2; i++) {
            sum += i; // sum = sum + i;
        }
        return sum;
    }

    public static int sum(int a, int b) {
        int sum = 0;
        sum = a + b;
        return sum;
    } // 메소드 int와같은 타입이 달라지면 알아서 구분해서 계산

    public static double sum(double c, double d) {
        double sum = 0;
        sum = a + b;
        return sum;
    }

    public static int sum(int a, int b, int c) {
        int sum = 0;
        sum = a + b + c;
        return sum;
    }
}