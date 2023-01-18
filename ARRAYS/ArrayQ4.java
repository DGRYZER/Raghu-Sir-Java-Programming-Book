//Write a java program to define a method to return biggest element of the array//
//I/P- [34,65,43,12,56,99]//
//O/P- 99 //

package org.jsp.Array;

import java.util.Scanner;

public class ArrayQ4 {
	static int getbiggest(int[] ar) {
		int big = ar[0];
		for (int i = 1; i < ar.length; i++) {
			if (ar[i] > big)
				big = ar[i];
		}
		return big;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int a = sc.nextInt();
		System.out.println("Enter the " + a + " number of integer value");
		int[] ir = new int[a];
		for (int i = 0; i < ir.length; i++) {
			ir[i] = sc.nextInt();
		}
		int res = getbiggest(ir);
		System.out.println("Biggest number is " + res);
	}
}
