//Write a java program to convert all the characters into lowercase//
//I/P- DeBaJyOtI //
//O/P- debajyoti //

package org.jsp.StringProj;

import java.util.Scanner;

public class StringQ24 {
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
		System.out.println("After uppercase to lowercase Convertion: " + lowercase(st));
	}
}
