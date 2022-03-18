import java.text.DecimalFormat;
import java.util.*;
public class chapter7in20{

    public class Stud {
        public double kor,eng,math;
        public String name;
        
        public Stud(String std_name, double value1, double value2, double value3) {
        
        name=std_name;
        kor=value1;
        eng=value2;
        math=value3;
        }

        public String getName() {
            return name;
        }

        public Object getAverage() {
            double result =(kor+eng+math)/3;
            return result;
        }
    }
    public static void main(String[] args){
    DecimalFormat df2 = new DecimalFormat(".##");
    
	Stud st[] = new Stud[4];// 레퍼런스 배열 생성
	st[0] = new Stud("Betty", 65.0, 98.0, 80.0); //배열의 각 원소 객체 생성
	st[1] = new Stud("John", 98.0, 89.0, 72.0);
	st[2] = new Stud("Billy", 78.0, 76.0, 92.0);
	st[3] = new Stud("Helen", 98.0, 77.0, 91.0);

    
	
    for (int i = 0; i < 4; i++){
		System.out.println(st[i].getName() + " " + df2.format(st[i].getAverage()));
    }

}

}