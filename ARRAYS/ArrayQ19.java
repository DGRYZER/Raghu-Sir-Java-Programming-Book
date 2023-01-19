// Write a java program to define a method to return how many prime numbers present between 100 and 1000 //
// I/P- [103,646,101,788,107] //
// O/P- 3 //

package org.jsp.Array;

import java.util.Scanner;

public class ArrayQ19 {
	static boolean isprime(int r) {
		for (int i = 2; i <= r / 2; i++) {
			if (r % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array ");
		int n = sc.nextInt();
		System.out.println("Enter " + n + " number of values");
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		int count = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > 100 && ar[i] < 1000) {
				boolean res = isprime(ar[i]);
				if (res)
					count++;
			}
		}
		System.out.println("The count of odd numbers present between 100 and 1000 are " + count);
	}
}
