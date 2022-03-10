import java.util.Scanner;
class chapter3in2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("2치 디항식 y = a*X^2 + b*X + C");
        System.out.print("계수 및 x 입력 (a b c d): ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int x=sc.nextInt();

        double result=(a*(x*x)) + (b*x) + c;
        System.out.println("y값은 "+result+" 입니다.");

        sc.close();
        
    }
}