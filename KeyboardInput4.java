import java.util.*;
import java.io.*;
public class KeyboardInput4 {
    
	public static void main(String[] args)throws IOException {
		String name;
        int age,agesum=0,count=0;
        float height,heightSum=0.0F;
        Scanner sc = new Scanner(new BufferedReader(new FileReader("C://TEST//p3.in.txt")));
        
        while(sc.hasNext()){
            name=sc.next(); age=sc.nextInt(); height=sc.nextFloat();
            agesum+=age; heightSum+=height;
            count++;
            System.out.printf("%5s%5d%10.1f\n",name,age,height);
        }
        System.out.println();
        System.out.println("total number: "+count);
        System.out.println("average age: "+agesum/count);
        System.out.printf("average height: %10.3f",heightSum/count);
        


	}
}