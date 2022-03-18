package chapter7;
import java.util.*;

public class chapter7in6{
public static void main(String[] args) {
	int[] my_array = { 11, 22, 33, 44, 55 };
	int Index_position = 2;
	int newValue = 99;
	System.out.println("Original Array : " + Arrays.toString(my_array));

	insertArray(my_array, Index_position,newValue);
	
    my_array[Index_position] = newValue;
	System.out.println("      New Array: " + Arrays.toString(my_array));
}

public static int[] insertArray(int[] my_array, int Index_position,int newValue) {
    int temp1 =my_array[Index_position];
    my_array[Index_position]=newValue;
    int temp2; //->[11, 22, 99, 44, 55] temp1엔 33
   
    for(int x=3;x<=my_array.length;x++){
            temp2=my_array[x]; //temp2에 44저장
            my_array[x]=temp1;
            temp1=temp2;
    }

    return my_array;

}
}