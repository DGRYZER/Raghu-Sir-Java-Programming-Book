// Write a java program to convert all the vowels into capital remaining small//
// I/P- shivamogga //
// O/P- shIvAmOggA //

package org.jsp.StringProj;

import java.util.Scanner;

public class StringQ27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String st = sc.next();
		for (int i = 0; i < st.length(); i++) {
			char ch = st.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				ch = (char) (ch - 32);
				System.out.print(ch);
			}
			else if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				System.out.print(ch);
				continue;
			} else {
				System.out.print(ch);
			}
		}
	}
}
