public class chapter7in16{
public static void main(String[] args) {
	String str = "Hello this is Java World";
	System.out.println("String is : " + str);
	count(str);
}
public static String count(String str){
    String[] array = str.split(" "); //*문자열 분할*
        int i = 1;

        for (String myStr : array){ //  array 배열을 들고와서 mystr에 각각에 저장된것의 길이를 출력??
            System.out.println(i + " : " + myStr + " : " + myStr.length());
            i++;
        }
        return str;
}







}