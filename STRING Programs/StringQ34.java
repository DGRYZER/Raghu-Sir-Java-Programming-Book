//Write a java program to convert all the uppercase characters into lowercase characters//
//I/P- RAMA IS A GOOD BOY //
//O/P- rama is a good boy //

package org.jsp.StringProj;

import java.util.Scanner;

public class StringQ34 {
	static String lowercase(String str) {
		char[] ch = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			if (ch[i] >= 'A' && ch[i] <= 'Z')
				ch[i] = (char) (ch[i] + 32);
		}
		str = new String(ch);
		return str;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String st = sc.nextLine();
		System.out.println(lowercase(st));
	}
}
