public class selection_sort {
	public static int[] arr = {1,6,5,7,3,8,2,9,10};

	public static void main(String[] args) {

		System.out.println("1. 선택정렬 출력");
        selectionsort(arr);
	}
    
    public static void selectionsort(int[]arr){
    int i,j,least,temp=0;
    int n= arr.length;
    
    for(i=0;i<n-1;i++){
        least=i;
        for(j=i+1;j<n;j++){
            if(arr[j]<arr[least]){
            least=j;
        } 
            temp = arr[i];
            arr[i] = arr[least];
            arr[least] = temp; 
        }
        
           
    }
   
    for(int x=0;x<n;x++){
        System.out.print(arr[x]+" ");
        }
}



}