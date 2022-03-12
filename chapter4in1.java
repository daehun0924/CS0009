import java.util.Scanner;
public class chapter4in1 {
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Input number 1?");
		int num1=sc.nextInt();
		
		System.out.print("Input number 2?");
		int num2=sc.nextInt();
		
		
		if(num1>num2) {
			System.out.println(num1+" is bigger than "+num2);
		}
		else if(num1<num2) {
			System.out.println(num1+" is less than "+num2);
		}else if (num1==num2){
			System.out.println(num1+", "+num2+" is same number please input another number.");
		}
		
		sc.close();
	}

}