//Write a java program to count how many small letters, special character and digits are present in the string//
//I/P- g2a^jen5d%ra8g#ad6a@ //
//O/P- Count of small letters: 12 //
//     Count of special characters: 4 //
//     Count of digits: 4 //

package org.jsp.StringProj;

import java.util.Scanner;

public class StringQ23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String st = sc.nextLine();
		char[] ch = st.toCharArray();
		int count1 = 0, count2 = 0, count3 = 0;
		for (int i = 0; i < st.length(); i++) {
			if (ch[i] >= 'a' && ch[i] <= 'z')
				count1++;
			else if (ch[i] >= 'A' && ch[i] <= 'Z')
				continue;
			else if (ch[i] >= '0' && ch[i] <= '9')
				count2++;
			else
				count3++;
		}
		System.out.println("Count of small letters: " + count1);
		System.out.println("Count of special characters: " + count3);
		System.out.println("Count of digits: " + count2);
	}
}
