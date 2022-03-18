package chapter7;

public class chapter7in2{
public static void main(String[] args)
{
    int[] my_array ={1,2,3,4,5,6,7,8,9,10};
    int sum=0;

    for(int k:my_array){ //가독성이 좋고 편함 인덱스 사용이 안된다 배열출력만 가능하다.
        System.out.print(k+" ");
        sum+=k;
    }
    System.out.print("the sum is "+sum);

}
}