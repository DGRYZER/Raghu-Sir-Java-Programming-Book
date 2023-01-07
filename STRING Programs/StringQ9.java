//Write a java program to count how many small vowels and small consonants are present in the string//
//I/P- DeBaJyOtI //
// O/P= count of small vowel: 2
//      count of small consonant: 2//

package org.jsp.StringProj;

import java.util.Scanner;

public class StringQ9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String st = sc.next();
		int count1 = 0, count2 = 0;
		for (int i = 0; i < st.length(); i++) {
			char ch = st.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				count1++;
			else if (ch >= 'A' && ch <= 'Z')
				continue;
			else
				count2++;
		}
		System.out.println("count of small vowel: " + count1);
		System.out.println("count of small consonant: " + count2);
	}
}