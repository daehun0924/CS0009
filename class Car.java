import java.util.Scanner;
class chapter3in1 {
    
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Input number = ");
        int num1 = sc.nextInt();
        System.out.println("Input number = ");
        int num2 = sc.nextInt();

        int sum= num1+num2;
        int sub = num1-num2;
        double division = num1/num2;
        int multi = num1*num2;
        int remain = num1%num2;

        System.out.println(num1+"+"+num2+"="+sum);
        System.out.println(num1+"-"+num2+"="+sub);
        System.out.println(num1+"*"+num2+"="+multi);
        System.out.println(num1+"/"+num2+"="+division);
        System.out.println(num1+"%"+num2+"="+remain);

        sc.close();
    }
    
}