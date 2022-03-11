import java.util.Scanner;
class chapter5in1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Number: ");
        int num =sc.nextInt();
        int length = (int)(Math.log10(num)+1);
        
        for(int i=1;i<=length;i++)
        {
            int result = num%10;
            System.out.print(result+" ");
            num=num/10;
        }
    
        sc.close();
    }
}