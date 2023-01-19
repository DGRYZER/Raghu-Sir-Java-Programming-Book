// Write a java program to define a method to return how many even numbers present in the array within 100 //
// I/P- [23,45,44,28,67,64,886] //
// O/P- 3 //

package org.jsp.Array;

import java.util.Scanner;

public class ArrayQ11 {
	static boolean geteven(int ar) {
		if (ar > 0 && ar < 100) {
			if (ar % 2 == 0)
				return true;
		}
		return false;
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

			boolean res = geteven(ir[i]);
			if (res == true && ir[i] < 100)
				count++;
		}
		System.out.println(count);
	}
}