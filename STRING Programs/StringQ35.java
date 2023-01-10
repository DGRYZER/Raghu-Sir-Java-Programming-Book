// Write java program to frequency of each character given in the string //
// I/P- hubballi //
// O/P- Count of a->1 //
//      Count of b->2 //
//      Count of h->1 //
//      Count of i->1 //
//      Count of l->2 //
//      Count of u->1 //

package org.jsp.StringProj;

import java.util.Scanner;

public class StringQ35 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String st = sc.nextLine();
		int[] count = new int[128];
		for (int i = 0; i < st.length(); i++) {
			char ch = st.charAt(i);
			count[ch]++;
		}
		for (int i = 0; i < count.length; i++) {
			if (count[i] != 0)
				System.out.println("Count of " + (char) i + "->" + count[i]);
		}
	}
}
