import java.util.Scanner;
class chapter5in4
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Number1: ");
       int num1 = sc.nextInt();
       System.out.print("Input Number2: ");
       int num2 = sc.nextInt();
      
       int count=0;
       int origin_num1=num1;
       while(num1>0)
       {
       num1=num1-num2;
       if(num1<0)
       {
           num1+=num2;
           break;
       }
       count++;
       }
       System.out.print(origin_num1+" % "+num2+" = "+num1);
       
   
     
        sc.close();
    }
}