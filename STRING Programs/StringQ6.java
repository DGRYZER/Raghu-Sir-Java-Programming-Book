// Write a java program to count how many CAPITAL Vowels and Small Vowels present in the String//
//I/P- DeBaJyOtI //
//O/P- count of Capital vowels: 2//
//     count of small vowels: 2 //

package org.jsp.StringProj;

import java.util.Scanner;

public class StringQ6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String st = sc.nextLine();
		char [] ch= st.toCharArray();
		int count1 = 0, count2=0;
		for (int i = 0; i < st.length(); i++) 
		{
		if(ch[i]=='A'||ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U')
			count1 ++;
		if(ch[i]=='a'||ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
			count2 ++;
		}
		System.out.println("count of Capital vowels: "+count1);
		System.out.println("count of Small vowels: "+count2);
	}

}