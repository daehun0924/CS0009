import java.util.*;
class chapter7in18{
public static void main(String[] args) {
    String str = "00100234000";
	System.out.println("String    = " + str);
	str = removeFrontZ(str);
	System.out.println("Converted = " + str);
}
public static String removeFrontZ(String str){
    
    StringBuffer sb = new StringBuffer(str);
    sb.delete(0,1);
    sb.deleteCharAt(0);
    String result = sb.toString();
    return result;
}
}