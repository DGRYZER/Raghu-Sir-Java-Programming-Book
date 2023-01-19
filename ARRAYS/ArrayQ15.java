// Write a java program to define a method to return how many odd numbers are present in the array within 1000 //
// I/P- [24,56,3,7,11,46,678,345,124,121,123,1234,1231] //
// O/P- 6 //

package org.jsp.Array;

import java.util.Scanner;

public class ArrayQ15 {
	static boolean isodd(int r) {
		if (r % 2 == 0)
			return false;
		else
			return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		System.out.println("Enter " + n + " number of values");
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 1000) {
				boolean res = isodd(a[i]);
				if (res)
					count++;
			}
		}
		System.out.println("The count of odd numbers present within 1000 are " + count);
	}
}
