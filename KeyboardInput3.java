import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

class KeyboardInput3{
public static void main(String[] args)throws FileNotFoundException{
double sum=0;
Scanner sc = new Scanner(new BufferedReader(new FileReader("C:\\TEST\\sumfile.txt")));

while (sc.hasNext()) { // EOF 검사
    if (sc.hasNextDouble()) 
    sum += sc.nextDouble();
    else
        sc.next(); // skip(or discard) next token
}

System.out.println(sum);

}
}