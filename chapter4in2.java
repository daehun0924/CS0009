import java.util.Scanner;
public class chapter4in2 {
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Input number ?");
		int num=sc.nextInt();
		int result= num%2;
		
		if(result==0)
		{
			System.out.println(num+" is even number");
		}
		else{
			System.out.println(num+" is odd number");
			}
		
	
		sc.close();
	}

}
//odd number = 홀수
//even number = 짝수
