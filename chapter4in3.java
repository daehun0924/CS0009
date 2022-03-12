import java.util.Scanner;
public class chapter4in3 {
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Input number ?");
		int num=sc.nextInt();
		int result= num%2;
		
		
		if(num>0)
		{
			if(result==0)
			{
				System.out.print(num+" is even number and positive number");
			}
			else
			{
				System.out.print(num+" is odd number and positive number");
			}
			
		}
		else if(num<0){
			if(num<0&&result!=0)
			{
				System.out.print(num+" is odd number and negative number");
			}
			else
			{
				System.out.print(num+" is even number and negative number");
			}
			
			}
		
	
		sc.close();
	}

}
//odd number = 홀수
//even number = 짝수
