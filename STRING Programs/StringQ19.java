//Write a java program to count how many small vowels, small consonants and special characters are present in the string//
//I/P- baNg!A#IUru@% //
//O/P- Count of small vowels are: 2
//     Count of small Consonant are: 3 //
//     Count of Special character are: 4 //

package org.jsp.StringProj;

import java.util.Scanner;

public class StringQ19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String st = sc.nextLine();
		char[] ch = st.toCharArray();
		int count1 = 0, count2 = 0, count3 = 0;
		for (int i = 0; i < st.length(); i++) {
			if (ch[i] >= 'a' && ch[i] <= 'z') {
				if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
					count1++;
				} else {
					count2++;
				}
			} else if (ch[i] >= 'A' && ch[i] <= 'Z') {
				continue;
			} else {
				count3++;
			}

		}
		System.out.println("Count of small vowels are: " + count1);
		System.out.println("Count of small Consonant are: " + count2);
		System.out.println("Count of Special character are: " + count3);
	}
}