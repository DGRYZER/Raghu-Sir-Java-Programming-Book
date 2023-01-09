//Write a java program to count how many letters and special characters are present in the string//
//I/P- shiv>va<#mo$gga@ //
//O/P- Count of letters: 11
//     Count of Special Characters: 5//

package org.jsp.StringProj;

import java.util.Scanner;

public class StringQ12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String st = sc.next();
		char[] ch = st.toCharArray();
		int count1 = 0, count2 = 0;
		for (int i = 0; i < st.length(); i++) {
			if (ch[i] >= 'A' && ch[i] <= 'Z' || ch[i] >= 'a' && ch[i] <= 'z')
				count1++;
			else if (ch[i] >= '0' && ch[i] <= '9')
				continue;
			else
				count2++;
		}
		System.out.println("Count of letters: " + count1);
		System.out.println("Count of Special Characters: " + count2);
	}
}
