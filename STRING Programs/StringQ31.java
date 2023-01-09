// Write a java program to convert every word last character into capital remaining small //
// I/P- rama is a good boy //
// O/P- ramA iS A gooD boY //

package org.jsp.StringProj;

import java.util.Scanner;

public class StringQ31 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String st = sc.nextLine();
		char[] ch = st.toCharArray();
		for (int i = 0; i < st.length(); i++) {
			if (i == ch.length - 1 && ch[i] != ' ' || ch[i] != ' ' && ch[i + 1] == ' ') {
				if (ch[i] >= 'a' && ch[i] <= 'z')
					ch[i] = (char) (ch[i] - 32);
			} else if (ch[i] >= 'A' && ch[i] <= 'Z')
				ch[i] = (char) (ch[i] + 32);
			System.out.print(ch[i]);
		}
	}
}