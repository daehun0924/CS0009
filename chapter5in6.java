import java.util.Scanner;

public class chapter5in6 {
	public static void main(String[] args) {
	int val,cnt=0,sum=0; 
	int []array=new int[100];
	
	Scanner sc=new Scanner(System.in);
	System.out.print("숫자 입력 0~100사이의 값 입력(그 이외의 값을 입력시 종료): ");
	val=sc.nextInt();
	System.out.println();
	while(val>=0&&val<=100)
	{
		array[cnt]=val;
		cnt=cnt+1;
		System.out.print("0~100사이의 값 입력(그 이외의 값을 입력시 종료): ");
		val=sc.nextInt();
		System.out.println();
	}
	
	 int min=array[0];
	 int max=array[0];
	 
	 for(int i=1;i<=cnt;i++){
		 sum+=array[i];
		 if(array[i]>max){
			 max=array[i];
		 }
		 if(array[i]<min){
			 min=array[i];
		 }
	 }
	 
	 if(cnt!=0) {
		 System.out.println("평균: "+sum/cnt);
	 }
	 System.out.println("최댓값= "+max);
	 System.out.println("최솟값= "+min);
	 
	 sc.close();
	}
	
	
}
