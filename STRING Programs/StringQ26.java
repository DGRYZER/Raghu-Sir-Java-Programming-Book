// Write a java program to convert all the vowels into small remaining capital//
// I/P- davanagere //
// O/P- DaVaNaGeRe //

package org.jsp.StringProj;

import java.util.Scanner;

public class StringQ26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String st = sc.next();
		for (int i = 0; i < st.length(); i++) {
			char ch = st.charAt(i);

			if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				ch = (char) (ch + 32);
				System.out.print(ch);
			}

			else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				System.out.print(ch);
				continue;
			} else {
				ch = (char) (ch - 32);
				System.out.print(ch);
			}
		}
	}
}
