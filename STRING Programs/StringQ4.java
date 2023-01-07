// Write a java program to count how many CAPITAL Vowels present in the String//
//I/P- DeBaJyOtI //
//O/P- 2//

package org.jsp.StringProj;

import java.util.Scanner;

public class StringQ4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String st = sc.nextLine();
		char [] ch= st.toCharArray();
		int count = 0;
		for (int i = 0; i < st.length(); i++) 
		{
		if(ch[i]=='A'||ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U')
			count ++;
		}
		System.out.println(count);
	}

}