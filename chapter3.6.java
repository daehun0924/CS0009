import java.util.Scanner;
class chapter3in6
{
    public static void main(String[] args) {
        int r;
        Scanner sc = new Scanner(System.in);
        System.out.print("원의 반지름 입력: ");
        r=sc.nextInt();
        double PI=3.14;
        double result=PI*r*r;
      double circumference = 2*PI*r;
        System.out.println("면적: "+result+"둘레: "+circumference);
        
        sc.close();
    }
}