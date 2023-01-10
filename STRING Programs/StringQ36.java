//Write a java program to reverse the String//
// I/P- chitradurga //
// O/P- agrudartihc //
package org.jsp.StringProj;

import java.util.Scanner;

public class StringQ36 {
	static String reverse(String str) {
		char[] ch = str.toCharArray();
		int i = 0, j = ch.length - 1;
		while (i < j) {
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
			i++;
			j--;
		}
		str = new String(ch);
		return str;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the strng");
		String st = sc.next();
		System.out.println(reverse(st));
	}
}


          //========= ALTERNATE PROCESS =========//


//I/P- chitradurga //
//O/P- agrudartihc /

//package org.jsp.StringProj;
//
//import java.util.Scanner;
//
//public class StringQ36 {
//	
//public static void main(String[] args) {
//	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter the string");
//	String st=sc.next();
//	char[] ch=st.toCharArray();
//	int i=0,j=ch.length-1;
//	while(j>=i)
//	{
//		System.out.print(ch[j]);
//		j--;
//	}
//}
//}
