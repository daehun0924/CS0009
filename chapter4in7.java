import java.util.Scanner;
public class chapter4in7 {
	public static void main(String []args) {
		
			Scanner sc = new Scanner(System.in);
            char grade;
			
            System.out.print("Input Score: ");
            double score = sc.nextDouble();
			if(score>=90)
            {
            grade='A';
            }
            else if(score>=80){
                grade='B';
            }
            else if(score>=70){
                grade='C';
            }
			else if(score>=60){
                grade='D';
            }
            else
            {
                grade='F';
            }
			System.out.print("Grade = "+grade);
            sc.close();
	}

}