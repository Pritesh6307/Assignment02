package assignmentTwo;

import java.util.Scanner;

public class PalindromeDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type Any Number");
		int num = sc.nextInt();
		int Given = num;
		int rev = 0;
		

		while (num > 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}

		if (Given == rev) {
			System.out.println("This is Palindrome");
		} else
			System.out.println("This is Not Palindrome");
	}

}
