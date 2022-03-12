import java.util.Scanner;

public class chapter6in2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수입력: ");
        int num = sc.nextInt();
        System.out.print("factorial 결과값: " + factorial(num));
        sc.close();
    }
    
    public static int factorial(int num) {
        int res = 1;
        for (int i = 1; i <= num; i++) {
            res *= i;
        }
        return res;
    }
}