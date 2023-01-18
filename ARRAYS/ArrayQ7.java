//Write a java program to define a method to return how many even numbers are present in the array /
//I/P- [23,45,44,28,67,64]//
//O/P- 3 //

package org.jsp.Array;

import java.util.Scanner;

public class ArrayQ7 {
	static boolean geteven(int ar) {
		for (int i = 0; i < ar; i++) {
			if (ar % 2 == 0)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int a = sc.nextInt();
		int count = 0;
		System.out.println("Enter the " + a + " number of integer value");
		int[] ir = new int[a];
		for (int i = 0; i < ir.length; i++) {
			ir[i] = sc.nextInt();
		}
		for (int i = 0; i < ir.length; i++) {
			boolean res = geteven(ir[i]);
			if (res)
				count++;
		}
		System.out.println("The number of even numbers are " + count);
	}
}
