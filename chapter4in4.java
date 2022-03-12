import java.util.Scanner; 
public class chapter4in4 {
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Input equation !!");
		int num1=sc.nextInt();
		String c= sc.next();
		int num2=sc.nextInt();
		
		sc.close();
		double result = 0;
			if(c.equals("+"))
			{
				result=num1+num2;
				System.out.print(num1+" "+c+" "+num2+"  = "+result);
				return;
			}
			else if(c.equals("-"))
			{
				result=num1-num2;
				System.out.print(num1+" "+c+" "+num2+"  = "+result);
				return;
			}
			else if(c.equals("*"))
			{
				result=num1*num2;
				System.out.print(num1+" "+c+" "+num2+"  = "+result);
				return;
			}

			else if(c.equals("/"))
			{
				result=num1/num2;
				System.out.print(num1+" "+c+" "+num2+"  = "+result);
				return;
			}
            else
			System.out.print("입력하신 내용은 결과를 낼수가 없습니다. 다시해");
			return;
	
		
	}
}
