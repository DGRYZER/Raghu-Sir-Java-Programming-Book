// Write a java program to count how many Small Letters present in the String//
//I/P- DeBaJyOtI //
//O/P- 4//

package org.jsp.StringProj;

import java.util.Scanner;

public class StringQ3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the string: ");
	String st = sc.nextLine();
	char [] ch = st.toCharArray();
	int count = 0;
	for (int i = 0; i < st.length(); i++) {
		if(ch[i]>='a' && ch[i]<='z')
			count ++;
		}
		System.out.println(count);
	}
}