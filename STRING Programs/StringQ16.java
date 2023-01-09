//Write a java program to count how many capital vowels, small consonants and special characters are present in the string//
//I/P- sha$HA#pUrA@% //
//O/P- Count of Capital vowels 3 //
//     Count of Small Consonants 4 //
//     Count of Special Characters 4  //

package org.jsp.StringProj;

import java.util.Scanner;

public class StringQ16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String st = sc.nextLine();
		char[] ch = st.toCharArray();
		int count1 = 0, count2 = 0, count3 = 0;
		for (int i = 0; i < st.length(); i++) {
			if (ch[i] >= 'A' && ch[i] <= 'Z') {
				if (ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U')
					count1++;
			} else if (ch[i] >= 'a' && ch[i] <= 'z') {
				if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u'
						|| ch[i] >= '0' && ch[i] <= '9') {
					continue;
				} else {
					count2++;
				}
			} else {
				count3++;
			}
		}
		System.out.println("Count of Capital vowels " + count1);
		System.out.println("Count of Small Consonants " + count2);
		System.out.println("Count of Special Characters " + count3);
	}
}
