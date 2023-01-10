//Write a java program to count how many characters present in the all words //
// I/P- rama is a good boy //
// O/P- rama->4 //
//      is->2 //
//      a->1 //
//      good->4 //
//      boy->3 //

package org.jsp.StringProj;

import java.util.Scanner;

public class StringQ43 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String st = sc.nextLine();
		char[] ch = st.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			String s = "";
			while (i < ch.length && ch[i] != ' ') {
				s = s + ch[i];
				i++;
			}
			if (s.length() > 0)
				System.out.println(s + "->" + s.length());
		}
	}
}
