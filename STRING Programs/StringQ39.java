//write a java program to return how many words present in a string //
//I/P- chitradurga is a fort city //
// O/P- 5 //

package org.jsp.StringProj;

import java.util.Scanner;

public class StringQ39 {
	static int wordcount(String str) {
		int count = 0;

		char ch[] = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			if (ch[0] != ' ' && i == 0 || i > 0 && ch[i] != ' ' && ch[i - 1] == ' ')
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String st = sc.nextLine();
		System.out.println(wordcount(st));
	}
}
