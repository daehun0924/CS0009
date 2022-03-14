import java.util.Scanner;
class chapter3in3
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("0~25사이의 정수입력: ");
        int num=sc.nextInt();

        if(num<0&&num>25)
        {
            System.out.println("0~25 사이의 숫자가 아닙니다. 다시 입력해주세요.");
        }
        else
        {
            String result=String.format("%c",(char)num+97); //팀 회의를 통해 String.format() 메소드를 사용시 서식 문자열을 사용한 형식 문자열을 생성할수있다는 유익한 정보를 알게되었다.
            System.out.println("알파벳 출력: "+result); //printf("%.3f",result); 
        }
        

        sc.close();
        
    }
}
