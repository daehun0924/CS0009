import java.util.Scanner;

public class chapter6in3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input two number: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        System.out.print("나눗셈 결과값: " + DivisiontoMinus(num1,num2));
        sc.close();
    }
    
    public static int DivisiontoMinus(int num1,int num2) {
       int cnt=0;
       
       if(num2==0){ 
           System.out.println("나누기 불가능"); 
           return 0;
       }
        while (num1>=num2) {
            num1-=num2;
            cnt++;
        }
        return cnt;
    }


 
}