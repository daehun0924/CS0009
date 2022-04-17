import java.util.*;

class Figure{
private boolean haveCircle; //원이 있는가
private boolean haveRectangle; //사각형이 있는가

public Figure(boolean haveCircle, boolean haveRectangle){
    this.haveCircle=haveCircle;
    this.haveRectangle=haveRectangle;
}

public void DoesHaveCircle(boolean haveCircle){
return;
}
public void DoesHaveRectangle(boolean Rectangle){
return;
}

}

public class Object{
    public static void main(String[] args){
        Figure ob = new Figure();
        Scanner sc=new Scanner(System.in);
        boolean  run =true;

        Figure object1= new Figure("자전거",true,true);
        Figure object2=new Figure("라디오",false,true);

        String answer=answer.next();
        int select =answer.nextInt();
        System.out.println("1.자전거|2.라디오|3.종료");
        
        while(run){
            switch(select){
                case 1: //자전거 구조 조회
                System.out.println("자전거에는 원 도형이 있는가??: ");
                object1.DoesHaveCircle();
                System.out.println("자전거에는 사각형 도형이 있는가??: ");
                object1.DoesHaveRectangle();

                case 2: //라디오 구조 조회
                System.out.println("라디오에는 원 도형이 있는가??: ");
                object2.DoesHaveCircle();
                System.out.println("라디오에는 사각형 도형이 있는가??: ");
                object2.DoesHaveRectangle();


                case 3:
                run=false;
                break;

            }
        }

    }
}