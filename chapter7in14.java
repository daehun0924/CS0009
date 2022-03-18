import java.util.*;
public class chapter7in14{
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
    System.out.print("1. 8글자 이상입니다.\n" 
			+ "2. 영문자와 숫자만 사용 가능합니다. \n" 
			+ "3. 숫자는 2개 이상이어야 합니다.\n"
			+ "위의 패스워드 규칙에 따라 원하는 패스워드를 입력하시오: ");
	
            String s = sc.nextLine();
	if (is_Valid_Password(s)) {
		System.out.println("적절한 패스워드입니다: " + s);
	} else {
		System.out.println("패스워드 규칙에 어긋납니다: " + s);
	}
}

public static boolean is_Valid_Password(String password){
int count=0;
if(!(password.length()>=8)){
    return false;
}

    
for(int i=0;i<password.length()-1;i++){
    if(password.charAt(i) >= '0' && password.charAt(i) <= '9'){
        count++;
    }else if((password.charAt(i)>='A'&&password.charAt(i)<='Z')||(password.charAt(i)>='a'&&password.charAt(i)<='z')){
        return true;
    }
    else 
    return false;
}
if (count< 2){
            return false;
}
return true;

}



}