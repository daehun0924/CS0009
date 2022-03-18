
public class BinarySearch {
	static int[] arr = {1, 3, 5, 7, 8, 10, 20, 35, 99, 100};

	public static void main(String[] args) {
		System.out.println("1. 재귀함수를 이용한 이진 탐색");
		System.out.println(binarySearch1(100, 0, arr.length-1)); // 
		System.out.println("\n2. 반복문을 이용한 이진 탐색");
		System.out.println(binarySearch2(20, 0, arr.length-1)); // 
		
		
	}


    public static int binarySearch1(int key, int low, int high){ //key=5 low=0 high=9
        int middle=0;

        if(low<=high){
            middle=(low+high)/2;
            if(key==arr[middle]){
            return middle;
            }
            else if(key<arr[middle]){
                return binarySearch1(key,low,middle-1);
            }
            else{
                return binarySearch1(key,middle+1,high);
            }
        }
        return middle;

    }

    public static int binarySearch2(int key, int low, int high){
        int middle=0;
        while(low<=high){
            middle=(low+high)/2;
            if(key==arr[middle]){
                return middle;
            }
            else if(key>arr[middle])
            {
                low=middle+1;
            }else{
                high=middle-1;
            }
        }
        return middle;
    }





}