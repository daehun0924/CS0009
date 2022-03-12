
import java.util.Scanner; 
public class chapter5in5 {
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		char cont ='y';
		while(cont == 'y')
		{
		System.out.print("Input equation (num1 op num2)? ");
		double num1=sc.nextInt();
		String c= sc.next();
		double num2=sc.nextInt();
		
			switch (c) {
                case "+":
                    System.out.println(num1+c+num2+"="+(num1+num2));
                    break;
                case "-":
                    System.out.println(num1+c+num2+"="+(num1 - num2));
                    break;
                case "*":
                    System.out.println(num1+c+num2+"="+(num1 * num2));
                    break;
                case "/":
                    System.out.println(num1+c+num2+"="+(num1 / num2));
                    break;
                default:
                    System.out.println("잘못된 연산자입니다.");
		}
		System.out.print("반복수행? (yes/no)");
		cont = sc.next().charAt(0);
		
		}
		sc.close();
	}
}