// Write a java program to check whether a string is ANAGRAM or not //
// I/P- Enter the first string
//       -> keep
//      Enter the second string
//       -> peek 
// O/P- The given string is Anagram //

package org.jsp.StringProj;

import java.util.Arrays;
import java.util.Scanner;

public class StringQ40 {
	static int[] countFrequency(String str) {
		int[] count = new int[26];
		for (int i = 0; i < str.length(); i++) {
			char[] ch = str.toCharArray();
			if (ch[i] >= 'A' && ch[i] <= 'Z')
				count[ch[i] - 65]++;
			if (ch[i] >= 'a' && ch[i] <= 'z')
				count[ch[i] - 97]++;
		}
		return count;
	}

	static boolean isAnagram(String at1, String at2) {
		int[] ch1 = countFrequency(at1);
		int[] ch2 = countFrequency(at2);
		for (int i = 0; i < 26; i++) {
			if (ch1[i] != ch2[i])
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string");
		String st1 = sc.nextLine();
		System.out.println("Enter the second string");
		String st2 = sc.nextLine();
		if (isAnagram(st1, st2))
			System.out.println("The given string is Anagram");
	}
}

// ======= ALRTERNATE PROCESS using inbuild method =======

//public class StringQ40 {
//
//	static boolean isAnagram(String at1, String at2) 
//	{
//		at1 = at1.replace(" ", " ");
//		at2 = at2.replace(" ", " ");
//		if(at1.length()!=at2.length())
//			return false;
//		else
//			return true;
//	}
//	static boolean isEqual(String st,String st1)
//	{
//		char[] c1=st.toCharArray();
//		char[] c2=st1.toCharArray();
//		Arrays.sort(c1);
//		Arrays.sort(c2);
//		return Arrays.equals(c1,c2);
//	}
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the first string");
//		String st1 = sc.nextLine();
//		System.out.println("Enter the first string");
//		String st2 = sc.nextLine();
//		if (isAnagram(st1, st2))
//		{
//			if(isEqual(st1,st2))
//				System.out.println("The given string is Anagram");
//			else	
//				System.out.println("The given string is not Anagram");
//		}
//		
//			
//			
//	}
//}