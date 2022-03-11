import java.util.Scanner;
class chapter5in3
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Number1: ");
       int num1 = sc.nextInt();
       System.out.print("Input Number2: ");
       int num2 = sc.nextInt();
       int result=0;
       int temp=0;
       
       if(num1<=num2)
       {
           for(int cnt=1;cnt<=num2;cnt++)
           {
              result+=num1;
           }
           System.out.print(num1+" * "+num2+" = "+result);
       }else if(num1>=num2)
       {
        temp=num1;
        num1=num2;
        num2=temp;
        for(int cnt=1;cnt<=num2;cnt++)
           {
              result+=num1;
           }
           System.out.print(num1+" * "+num2+" = "+result);
        }
       
        sc.close();
    }
}