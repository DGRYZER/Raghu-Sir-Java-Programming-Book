// Write a java program to define a method to return how many even numbers present in the array within 1000 //
// I/P- [23,678,64,546,787,898,654,233,453,7868,2432] //
// O/P- 5 //

package org.jsp.Array;

import java.util.Scanner;

public class ArrayQ16 {
	static boolean iseven(int r) {
		if (r % 2 != 0)
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
				boolean res = iseven(a[i]);
				if (res)
					count++;
			}
		}
		System.out.println("The count of even numbers present within 1000 are " + count);
	}
}
