import java.util.Scanner;
public class chapter4in7switch {
	public static void main(String []args) {
		
			Scanner sc = new Scanner(System.in);
            char grade;
			
            System.out.print("Input Score: ");
            int score = sc.nextInt();
			switch(score/10)
            {
                case 10:
                case 9:
                grade='A';
                break;
                case 8:
                grade='B';
                break;
                case 7:
                grade='C';
                break;
                case 6:
                grade='D';
                break;
                default:
                grade='F';

            }
            System.out.print("Grade = "+grade);
            sc.close();
	}

}