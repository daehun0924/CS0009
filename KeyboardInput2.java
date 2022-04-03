import java.util.Scanner; 
import java.io.File; 
import java.io.IOException;
import java.io.*;

public class KeyboardInput2{
    
	public static void main(String[] args)throws IOException{
        try{
        Scanner sc = new Scanner(new BufferedReader(new FileReader("C:\\TEST\\IO3.txt"))); // (cf) 
		String name = sc.next();
		int age = sc.nextInt();
		char gender = sc.next().charAt(0);
		boolean truth= sc.nextBoolean();

        System.out.println(
			"My name is " + name + "(" + gender + ")" + ", age is " + age + ".\n"
			+ "This statement is " + truth + "."
		);
        System.out.printf("My name is %s(%c), age is %d.\n", name, gender, age);
        System.out.printf("This statement is %b.\n", truth);
        sc.close();
        
    }catch(FileNotFoundException e){
        System.out.println("파일 없음");
        }
	}
}