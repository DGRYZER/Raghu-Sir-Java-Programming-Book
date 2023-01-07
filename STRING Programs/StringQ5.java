// Write a java program to count how many small Vowels present in the String//
//I/P- DeBaJyOtI //
//O/P- 2 //

package org.jsp.StringProj;

import java.util.Scanner;

public class StringQ5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String st = sc.nextLine();
		char [] ch= st.toCharArray();
		int count = 0;
		for (int i = 0; i < st.length(); i++) 
		{
		if(ch[i]=='a'||ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
			count ++;
		}
		System.out.println(count);
	}

}