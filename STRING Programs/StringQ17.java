//Write a java program to count how many small vowels, capital consonants and special characters are present in the string//
//I/P- SHa$HA#pUrA@% //
//O/P- Count of small vowels 1 //
//     Count of capital Consonants 3 //
//     Count of Special Characters 4 //

package org.jsp.StringProj;

import java.util.Scanner;

public class StringQ17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String st = sc.nextLine();
		char[] ch = st.toCharArray();
		int count1 = 0, count2 = 0, count3 = 0;
		for (int i = 0; i < st.length(); i++) {
			if (ch[i] >= 'a' && ch[i] <= 'z') {
				if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u')
					count1++;
			} else if (ch[i] >= 'A' && ch[i] <= 'Z') {
				if (ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U'
						|| ch[i] >= '0' && ch[i] <= '9') {
					continue;
				} else {
					count2++;
				}
			} else {
				count3++;
			}
		}
		System.out.println("Count of small vowels " + count1);
		System.out.println("Count of capital Consonants " + count2);
		System.out.println("Count of Special Characters " + count3);
	}
}
