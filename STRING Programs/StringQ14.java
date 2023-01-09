//Write a java program to count how many capital letters and special characters are present in the string//
//I/P- GaJend#Rag&(DA) //
//O/P- Count of capital letters: 5
//     Count of Special Characters: 4 //

package org.jsp.StringProj;

import java.util.Scanner;

public class StringQ14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String st = sc.nextLine();
		char[] ch = st.toCharArray();
		int count1 = 0, count2 = 0;
		for (int i = 0; i < st.length(); i++) {
			if (ch[i] >= 'A' && ch[i] <= 'Z')
				count1++;
			else if (ch[i] >= 'a' && ch[i] <= 'z' || ch[i] >= '0' && ch[i] <= '9')
				continue;
			else
				count2++;
		}
		System.out.println("Count of capital letters: " + count1);
		System.out.println("Count of Special Characters: " + count2);
	}
}
