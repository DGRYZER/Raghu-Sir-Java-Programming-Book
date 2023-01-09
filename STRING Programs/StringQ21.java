//Write a java program to count how many special character and digits are present in the string//
//I/P- @123#9%3! //
//O/P- Count of special characters: 4 //
//     Count of digits: 5 //

package org.jsp.StringProj;

import java.util.Scanner;

public class StringQ21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String st = sc.nextLine();
		char[] ch = st.toCharArray();
		int count1 = 0, count2 = 0;
		for (int i = 0; i < st.length(); i++) {
			if (ch[i] >= 'A' && ch[i] <= 'Z' || ch[i] >= 'a' && ch[i] <= 'z')
				continue;
			else if (ch[i] >= '0' && ch[i] <= '9')
				count1++;
			else
				count2++;
		}
		System.out.println("Count of special characters: " + count2);
		System.out.println("Count of digits: " + count1);
	}
}
