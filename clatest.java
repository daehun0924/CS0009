import java.util.*;
class Calendar {

	private static final int[] MaxDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static final int[] LeapMaxDays = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public static boolean isLeapYear(int year) {

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
			return true;
		else 
			return false;
	}

	public static int getMaxDaysOfMonth(int year, int month) {
		if(isLeapYear(year)) 
			return LeapMaxDays[month-1];
		else
		return MaxDays[month - 1];
	}

	public static void printCalendar(int year, int month) {
		System.out.printf("   <<%4d년%3d월>>\n", year, month);
		System.out.println(" SU MO TU WE TU FR SA");
		System.out.println("----------------------");

		int maxDay = getMaxDaysOfMonth(year, month);
	
		for (int i = 1; i <= maxDay; i++) {
			System.out.printf("%3d", i);
			if (i % 7 == 0) {
				System.out.println();
			}
		}
	}
	}

public class clatest {
	private final static String PROMPT = "cal> ";
	public void runPrompt() {

		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();

		int month = 0;
		int year = 0;

		for (int i = 0;; i++) {

			System.out.println("연도를 입력하세요:");
			System.out.print(PROMPT);
			year = scanner.nextInt();
			System.out.println("달을 입력하세요:");
			System.out.print(PROMPT);
			month = scanner.nextInt();

			if (month == -1) {
				System.out.println("Have a nice day!");
				break;
			} else if (month > 12) {
				continue;
			} else {

				cal.printCalendar(year, month);;

				System.out.println("");
			}
		}
		System.out.println("bye~");
		scanner.close();
	}
	public static void main(String[] args) {
		// 셀 실행
		clatest p = new clatest();
		p.runPrompt();
	}
}