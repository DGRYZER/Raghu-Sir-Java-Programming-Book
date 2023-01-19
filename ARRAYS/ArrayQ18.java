// Write a java program to define a method to return how many even numbers present between 100 and 1000 //
// I/P- [24,464,322,468,464,28] //
// O/P- 4 //

package org.jsp.Array;

import java.util.Scanner;

public class ArrayQ18 {
	static boolean iseven(int r) {
		if (r % 2 == 0)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		System.out.println("Enter " + n + " number of values");
		int[] a = new int[n];
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 100 && a[i] < 1000) {
				boolean res = iseven(a[i]);
				if (res)
					count++;
			}
		}
		System.out.println("The count of odd numbers present between 100 and 1000 are " + count);
	}
}
