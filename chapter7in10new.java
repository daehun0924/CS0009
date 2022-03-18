public class chapter7in10new{
    public static void main(String[] args) {
        int[] a1 = { 1, 1, 2, 2, 1 };
        int[] a2 = { 1, 1, 2, 2, 2, 1};
        int[] a3 = { 1, 1, 2, 1, 2, 1 };
        System.out.println(noTriples(a1));
        System.out.println(noTriples(a2));
        System.out.println(noTriples(a3));
    }
    
    
    public static boolean noTriples(int[]arr){
    int i=0;
    
    for(i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]&&arr[i+1]==arr[i+2]){
            return true;
            }
            
        }
        return false;
    
    
    }
    }
    
    