//Write a java program to count how many capital vowels and small consonants are present in the string//
//I/P- DeBaJyOtI //
// O/P= count of capital vowel: 2
//      count of small consonant: 3//

package org.jsp.StringProj;

import java.util.Scanner;

public class StringQ11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String st = sc.next();
		int count1 = 0, count2 = 0;
		for (int i = 0; i < st.length(); i++) {
			char ch = st.charAt(i);
			if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
				count1++;
			else if (ch >= 'a' && ch <= 'z' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				continue;
			else
				count2++;
		}
		System.out.println("count of capital vowel: " + count1);
		System.out.println("count of small consonant: " + count2);
	}
}