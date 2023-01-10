//Write a java program to check user entered string is palindrome or not//
// I/P- madam //
// O/P- madam is a palindrome string //

package org.jsp.StringProj;

import java.util.Scanner;

public class StringQ37 {
	static boolean isPalindrome(String str) {
		char[] ch = str.toCharArray();
		int i = 0, j = str.length() - 1;

		while (i < j) {
			if (ch[i] != ch[j])
				return false;
			i++;
			j--;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string");
		String st = scanner.nextLine();
		if (isPalindrome(st)) {
			System.out.println(st + " is a palindrome string");
		} else {
			System.out.println(st + " is not a palindrome string");
		}
	}

}
