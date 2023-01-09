//Write a java program to count how many capital vowels, capital consonants and special characters are present in the string//
//I/P- BEnG^AL*URu&#@ //
//O/P- Count of Capital vowels are: 3 //
//     Count of Capital Consonant are: 4 //
//     Count of Special character are: 5 //

package org.jsp.StringProj;

import java.util.Scanner;

public class StringQ18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String st = sc.nextLine();
		char[] ch = st.toCharArray();
		int count1 = 0, count2 = 0, count3 = 0;
		for (int i = 0; i < st.length(); i++) {
			if (ch[i] >= 'A' && ch[i] <= 'Z') {
				if (ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') {
					count1++;
				} else {
					count2++;
				}
			} else if (ch[i] >= 'a' && ch[i] <= 'z') {
				continue;
			} else {
				count3++;
			}

		}
		System.out.println("Count of Capital vowels are: " + count1);
		System.out.println("Count of Capital Consonant are: " + count2);
		System.out.println("Count of Special character are: " + count3);
	}
}