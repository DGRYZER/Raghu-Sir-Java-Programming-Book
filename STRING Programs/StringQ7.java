//Write a java program to count how many vowels and consonants are present in the string//
//I/P- DeBaJyOtI //
//O/P- count of vowels: 4 //
//     count of consonants: 5 //


package org.jsp.StringProj;

import java.util.Scanner;

public class StringQ7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String st = sc.nextLine();
		char [] ch= st.toCharArray();
		int count1 = 0, count2=0;
		for (int i = 0; i < st.length(); i++) 
		{
		if(ch[i]=='A'||ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U'||
				ch[i]=='a'||ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
			count1 ++;
		else
			count2 ++;
		}
		System.out.println("count of vowels: "+count1);
		System.out.println("count of consonants: "+count2);
	}

}
