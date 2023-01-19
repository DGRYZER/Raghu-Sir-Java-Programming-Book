// Write a java program to define a method to return how many palindrome numbers present between 100 and 1000 //
// I/P- [103,646,101,788,107,787,989,567,878] //
// O/P- 5 //

package org.jsp.Array;

import java.util.Scanner;

public class ArrayQ20 {
	static boolean ispalindrome(int r) {
		int sum = 0, temp = r;
		while (r != 0) {
			int p = r % 10;
			sum = sum * 10 + p;
			r = r / 10;

			if (sum == temp)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		System.out.println("Enter " + n + " number of values");
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}

		int count = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > 100 && ar[i] < 1000) {
				boolean res = ispalindrome(ar[i]);
				if (res)
					count++;
			}
		}
		System.out.println("The count of palindrome numbers present between 100 and 1000 are " + count);
	}
}
