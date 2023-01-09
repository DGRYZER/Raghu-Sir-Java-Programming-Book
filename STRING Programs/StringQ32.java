//Write a java program to define a method to calculate the sum of digits present in the string //
//I/P- gadag@12345 //
// O/P- 15 //

package org.jsp.StringProj;

import java.util.Scanner;

public class StringQ32 {
	static int sumofDigits(String st) {
		int sum = 0;
		for (int i = 0; i < st.length(); i++) {
			char ch = st.charAt(i);
			if (ch > '0' && ch <= '9')
				sum = sum + ch - 48;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String st = sc.nextLine();
		char[] ch = st.toCharArray();
		System.out.println(sumofDigits(st));
	}
}
