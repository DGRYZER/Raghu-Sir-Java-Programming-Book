//Write a java program to count how many capital letters and small letters present in the string//
//I/P- DeBaJyOtI //
//O/P- Capital letters - 5//
//	   Small letters - 4//

package org.jsp.StringProj;

import java.util.Scanner;

public class StringQ2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String:");
	String st = sc.nextLine();
	char [] ch = st.toCharArray();
	int count1 = 0,count2=0;
	for (int i = 0; i < st.length(); i++) {
		if(ch[i]>='A'&&ch[i]<='Z')
			count1 ++;
		if(ch[i]>='a'&&ch[i]<='z')
			count2++;
	}
	System.out.println("Count of Capital Letters: "+count1);
	System.out.println("Count of Small Letters: "+count2);
}
}
