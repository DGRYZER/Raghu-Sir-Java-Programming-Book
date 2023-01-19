// Write a java program to define a method to return how many odd numbers present between 100 and 1000 //
// I/P- [23,45,345,323,65,67] //
// O/P- 2 //

package org.jsp.Array;

import java.util.Scanner;

public class ArrayQ17 {
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
			if (a[i] > 100 && a[i] < 1000) {
				boolean res = isodd(a[i]);
				if (res)
					count++;
			}
		}
		System.out.println("The count of odd numbers present between 100 and 1000 are " + count);
	}
}
