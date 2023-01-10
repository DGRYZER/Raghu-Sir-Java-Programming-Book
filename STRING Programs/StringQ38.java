//Write a java program to swipe every word first character with the same word last character //
//I/P- ramesh is a good boy //
//O/P- hamesr si a doog yob //

package org.jsp.StringProj;

import java.util.Scanner;

public class StringQ38 {
	static String swap(String str) {
		char[] ch = str.toCharArray();
		int t = 0;
		for (int i = 0; i < ch.length; i++) {
			if (i == 0 && ch[i] != ' ' || ch[i] != ' ' && ch[i - 1] == ' ') {
				t = i;
			} else if (i == ch.length - 1 && ch[i] != ' ' || ch[i] != ' ' && ch[i + 1] == ' ') {
				char temp = ch[i];
				ch[i] = ch[t];
				ch[t] = temp;
			}
		}
		str = new String(ch);
		return (str);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String st = sc.nextLine();
		System.out.println(swap(st));
	}
}
