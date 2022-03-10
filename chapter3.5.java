import java.util.Scanner;
class chapter3in5
{
    public static void main(String[] args) {
        int min,hour,sec;
        Scanner sc = new Scanner(System.in);
        System.out.print("시간 입력(초): ");
        sec=sc.nextInt();
        
        min=sec/60;
        hour=min/60;
        sec=sec%60;
        min=min%60;

        System.out.println("입력된 시간: "+hour+"시"+min+"분"+sec+"초");
        
        sc.close();
    }
}