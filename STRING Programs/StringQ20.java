//Write a java program to count how many letters and digits are present in the string//
//I/P- ba6n5gal7o4r2e9 //
//O/P- Count of letters: 9 //
//     Count of digits: 6 //

package org.jsp.StringProj;

import java.util.Scanner;

public class StringQ20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String st = sc.nextLine();
		char[] ch = st.toCharArray();
		int count1 = 0, count2 = 0;
		for (int i = 0; i < st.length(); i++) {
			if (ch[i] >= 'A' && ch[i] <= 'Z' || ch[i] >= 'a' && ch[i] <= 'z')
				count1++;
			if (ch[i] >= '0' && ch[i] <= '9')
				count2++;
		}
		System.out.println("Count of letters: " + count1);
		System.out.println("Count of digits: " + count2);
	}
}
