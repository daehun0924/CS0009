import java.util.*;
import java.io.*;

public class Project3in1{
    public static void main(String[] args)throws FileNotFoundException, IOException{
    double sum=0;
    Scanner sc = new Scanner(new BufferedReader(new FileReader("C:\\TEST\\sumfile.txt")));

    while (sc.hasNext()) { // EOF 검사
        if (sc.hasNextDouble()) 
            sum += sc.nextDouble();
        else{
        sc.next(); // skip(or discard) next token
        }
    }

    System.out.println(sum);
    }

}