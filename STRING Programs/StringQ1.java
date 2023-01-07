// Write a java program to count how many CAPITAL Letters present in the String//
//I/P- DeBaJyOtI //
//O/P- 5//

package org.jsp.StringProj;

import java.util.Scanner;

public class StringQ1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String st = sc.nextLine();
		char [] ch= st.toCharArray();
		int count = 0;
		for (int i = 0; i < st.length(); i++) 
		{
		if(ch[i]>'A' && ch[i]<'Z')
			count ++;
		}
		System.out.println(count);
	}

}
