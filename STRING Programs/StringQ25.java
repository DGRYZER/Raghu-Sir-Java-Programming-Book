//Write a java program to convert all the characters into uppercase//
//I/P- DeBaJyOtI //
//O/P- DEBAJYOTI //

package org.jsp.StringProj;

import java.util.Scanner;

public class StringQ25 {
	static String uppercase(String str) {
		char[] ch = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			if (ch[i] >= 'a' && ch[i] <= 'z')
				ch[i] = (char) (ch[i] - 32);
		}
		str = new String(ch);
		return str;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String st = sc.nextLine();
		System.out.println("After uppercase to uppercase Convertion: " + uppercase(st));
	}
}
