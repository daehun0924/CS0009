public class inserttion_sort {
	public static int[] arr = {1,6,5,7,3,8,2,9,10};

	public static void main(String[] args) {

		System.out.println("1. 삽입정렬 출력");
        inserttionsort(arr,9);
	}
    
    public static void inserttionsort(int[]arr,int num){
    int i,j,key=0;
    int n=num;
    
    for(i=1;i<n;i++){
        key=arr[i];
        for(j=i-1;i>=0&&arr[j]>key;j--){
            arr[j+1]=arr[j];
        }
        arr[j+1]=key;
    }


    for(int x=0;x<n;x++){
        System.out.print(arr[x]+" ");
        }
}
}
