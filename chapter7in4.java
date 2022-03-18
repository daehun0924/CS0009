package chapter7;

import java.util.Scanner;
public class chapter7in4{
public static void main(String[] args)
{
    int counter, i;
	int number[] = new int[100];

	Scanner scanner = new Scanner(System.in);
	System.out.print("How many integer elements(max 100)?");
	counter = scanner.nextInt();
   

	for (i = 0; i < counter; i++) {
		System.out.print("Enter Array Element" + (i + 1) + ": ");
		number[i] = scanner.nextInt();
	}

	number=reverse(number, counter);

	System.out.print("Reversed array: ");
	for (i = 0; i < counter; i++) {
		System.out.print(number[i] + "  ");
	}

     scanner.close();
}

public static int[] reverse(int[] number, int counter) {
int reverse_number[]=new int[counter];

for (int i = counter-1, r= 0 ; 0 <= i ; i--,r++) {
        reverse_number[r]=number[i];
    }
    return reverse_number;
}




}