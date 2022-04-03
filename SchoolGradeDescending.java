import java.util.*;


public class SchoolGradeDescending{
    public static void main(String[] args){
        int max=0;
        int min=100;
        double average=0;//인원수 파악후 점수받고 최대최소 구하고 평균구하기
        Scanner sc=new Scanner(System.in);
        System.out.print("인원수:");
        int numofPeople=sc.nextInt();
        int[] scores=new int[numofPeople];
        int[] gradepeople=new int[10];
        int lowthanavg=0;
        int highthanavg=0;
        

        for (int i = 0; i < numofPeople; i++) {
            System.out.print((i+1)+"번째 점수 입력: ");
            scores[i] = sc.nextInt();
            if (scores[i] > max) {
                max = scores[i];
            }
            if (scores[i] < min) {
                min = scores[i];
            }
            average += scores[i];
        }

        average/=numofPeople;

       ;
        //0-9 10-19 20-29 30-39 40-49 50-59 60-69 70-79 80-89 90-100 총=>10
        for(int count=0;count<=numofPeople;count++){ //등급별 인원수 계산
            switch(scores[count]%10){
                case 0:
                gradepeople[0]++;
                break;
                case 1:
                gradepeople[1]++;
                break;
                case 2:
                gradepeople[2]++;
                break;
                case 3:
                gradepeople[3]++;
                break;
                case 4:
                gradepeople[4]++;
                break;
                case 5:
                gradepeople[5]++;
                break;
                case 6:
                gradepeople[6]++;
                break;
                case 7:
                gradepeople[7]++;
                break;
                case 8:
                gradepeople[8]++;
                break;
                case 9:
                gradepeople[9]++;
                break;
                case 10:
                gradepeople[10]++;
                break;

               
                   
        }
        }
        int temp = 0;
        for(int j=0;j<=numofPeople;j++){
            if(scores[j] > average) {
                highthanavg++;
            }
            else if(scores[j] < average) {
                lowthanavg++;
            }

            if(scores[j]<scores[j+1]){
                temp=scores[j];
                scores[j]=scores[j+1];
                scores[j+1]=scores[j];
            }


        }
        
       


        for (int i = 0; i < gradepeople.length - 2; i++) {
            if (gradepeople[i] > 0) {
                System.out.println((i * 10) + "~" + ((i * 10) + 9) + "점대 인원수: " + gradepeople[i] + "명");
            }
        }
        if (gradepeople[gradepeople.length - 1] > 0) {
            System.out.println("90~100점대 인원수: " + gradepeople[gradepeople.length - 1] + "명");

        }
        System.out.println("평균 이상: " +highthanavg+ "명");
        System.out.println("평균 이하: " +lowthanavg+ "명");
        System.out.println("MAX: " + max);
        System.out.println("MIN: " + min);
        System.out.println("AVG: " + average);

        

        sc.close();
        
        
        

    }
}