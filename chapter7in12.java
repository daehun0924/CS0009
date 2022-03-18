import java.util.*;
class chapter7in12{
public static void main(String[] args) {
	System.out.println(sTimes("Hi", 3));
	System.out.println(sTimes("Hello", 2));
	System.out.println(sTimes("My Java", 2));
}
public static String sTimes(String str,int n){
    int count=n;
    StringBuffer sb = new StringBuffer();
    for(int i=0;i<count;i++){
        StringBuffer append = sb.append(str);
    }
    String result = sb.toString();
    return result;
}


}