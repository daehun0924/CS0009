import java.util.Scanner;
public class chapter6in1 {
	public static void main(String []args) {
		
			Scanner sc = new Scanner(System.in);
            
            System.out.print("Input two number:");
            int num1=sc.nextInt();
            int num2=sc.nextInt();
            int result=sum(num1,num2);
           
            System.out.print("두정수의 합은 "+result);
           
            sc.close();
	}
    public static int sum(int num1, int num2) {
        int sums;
        sums=num1+num2;
        return sums; 
    }
    

}