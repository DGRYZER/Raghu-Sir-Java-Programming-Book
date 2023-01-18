//Write a java program to define a method to return how many odd numbers are present in the array /
//I/P- [23,42,24,56,3,7]//
//O/P- 3 //

package org.jsp.Array;

import java.util.Scanner;

public class ArrayQ8 {
	static boolean getodd(int ar) {
		for (int i = 0; i < ar; i++) {
			if (ar % 2 == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		int count = 0;
		int[] ir = new int[n];
		System.out.println("Enter the " + n + " number of data");
		for (int i = 0; i < ir.length; i++) {
			ir[i] = sc.nextInt();
		}
		for (int i = 0; i < ir.length; i++) {
			boolean res = getodd(ir[i]);
			if (res)
				count++;
		}
		System.out.println("The count of odd numbers are " + count);
	}
}
