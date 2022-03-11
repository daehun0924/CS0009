import java.util.Scanner;
class chapter5in2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Number1: ");
       int num1 = sc.nextInt();
       System.out.print("Input Number2: ");
       int num2 = sc.nextInt();
       int temp=0;
       int result=0;
       if(num1<num2)
       {
           for(int cnt=num1;cnt<=num2;cnt++)
           {
              result+=cnt;
           }
           System.out.print("작은 숫자부터 큰 숫자까지의 합= "+result);
       }else if(num1>num2)
       {
        temp=num1;
        num1=num2;
        num2=temp;
        for(int cnt=num1;cnt<=num2;cnt++)
           {
              result+=cnt;
           }
           System.out.print("작은 숫자부터 큰 숫자까지의 합= "+result);
        }
        else{
        System.out.println("입력하신 두 수의 값이 동일합니다. 다시 실행해주십쇼.");
        }
        sc.close();
    }
}