import java.util.*;

public class Bank1{
	public static void main (String[] args){
        Scanner input=new Scanner(System.in);
	    boolean run =true;
        BankApp user= new BankApp("178-13-054299","1234","Mark Spector",0);
	    
        while(run) {
	      System.out.println("-------------------------------------");
	      System.out.println("1.계좌 정보출력|2.예금|3.출금|4.종료");
	      System.out.println("-------------------------------------");
          System.out.print("선택>");
          int selectNo = input.nextInt();
          
          switch(selectNo) {
          case 1: // 계좌 정보 출력
          user.printAccount(); 
          
          break; 
          
          case 2: // 예금
          System.out.print("입금할 금액을 입력하세요: ");
          int balance =input.nextInt();
          user.deposit(balance); 
          user.printAccount();
          break; 


          case 3: //출금
          System.out.print("출금할 금액을 입력하세요: ");
          int balance2 =input.nextInt();
          user.withdraw(balance2);
          user.printAccount();
          break; 
          
          
          case 4: run=false; break;
          }
      }
      System.out.println("프로그램 종료");
      
  }
}

class BankApp{
    private String number; //계좌번호
    private String password; //비밀번호
    private String name; //고객이름
    private long balance; //잔고

    public BankApp(String number, String password,String name, long balance){
        this.number=number;
        this.password=password;
        this.name=name;
        this.balance=balance;
    }

    public void deposit(long balance){
        this.balance+=balance;
    }
    
    public void withdraw(long balance2){
        if(this.balance>balance2){
        this.balance-=balance2;
        }
        else{
            System.out.print("잔고부족!");
        }
    }

    public void printAccount(){
        System.out.println("계좌번호: "+number);
        System.out.println("비밀번호: "+password);
        System.out.println("예금주이름: "+name);
        System.out.println("잔액: "+balance);
        
    }

   


}