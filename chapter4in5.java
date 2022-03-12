import java.util.Scanner;
public class chapter4in5 {
	public static void main(String []args) {
		
			Scanner s = new Scanner(System.in);
			System.out.print("알파벳을 입력하세요: ");
			
			String input = s.next().toLowerCase();
			
			boolean uppercase = input.charAt(0) >= 65 && input.charAt(0) <=90;
			//charAt 는 인덱스[0]에 있는 한글자를 리턴 해준다, uppercase는 대문자 
			//ASCII 60~90은 대문자
			boolean lowercase = input.charAt(0) >= 97 && input.charAt(0) <=122;
			// lowercase는 소문자 
			//ASCII 97~122은 소문자
			boolean vowels = input.equals("a") || input.equals("e") || input.equals("i") || input.equals("e")||input.equals("o");
			//equals는 문자 그자체를 비교 ==는 주소를 비교 
			
			
			if(input.length()>1) { //문자 길이가 1이상일시 실행
				System.out.println("문자가 아닙니다. 한 글자만 입력하세요");
			}
			else if(!(uppercase || lowercase)) { 
				System.out.println("알파벳(a~z, A~Z)이 아닙니다.");
			}//입력한 문자가 대문자 소문자 둘다아닐때 실행
			else if(vowels) {
				System.out.println(input +"은(는)모음입니다.");
			}
			else {
				System.out.println(input +"은(는)자음입니다.");
			}
			s.close();
		
    }
	}