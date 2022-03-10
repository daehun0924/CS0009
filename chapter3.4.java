import java.util.Scanner;
class chapter3in4
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("몸무게 입력(Kg): ");
        double weight=sc.nextDouble();
        System.out.println("키 입력(cm): ");
        double height=sc.nextDouble();

        double condition_factor =(height-110)/weight;

        System.out.println("몸무게 = "+weight+"키 = "+height+"-------->"+(String.format("%.3f", condition_factor)));

        
        sc.close();
        
    }
}