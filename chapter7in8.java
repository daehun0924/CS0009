public class chapter7in8{
public static void main(String[] args) {
	int[] a1 = { 1, 1, 2, 3, 4 };
	int[] a2 = { 1, 1, 2, 4, 1 };
	int[] a3 = { 1, 1, 2, 1, 2, 3 };
	System.out.println(array123(a1));
	System.out.println(array123(a2));
	System.out.println(array123(a3));
}


public static boolean array123(int[]arr){
int i=0;
for(i=0;i<arr.length-1;i++){
        if(arr[i]>arr[i+1]){
        return false;
        }
        
    }
    return true;


}
}

