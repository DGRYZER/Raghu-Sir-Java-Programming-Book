// Write a java program to define a method to return how many prime numbers present in the array within 1000 //
// I/P- [151,648,163,864,113,654,173,197,1234,4346] //
// O/P- 5 //

package org.jsp.Array;

import java.util.Scanner;

public class ArrayQ14 {
	static boolean isprime(int n) {
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		System.out.println("Enter the element of the array");
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 1000) {
				boolean res = isprime(a[i]);
				if (res)
					count++;
			}
		}
		System.out.println("The count of prime numbers within 1000 are " + count);
	}
}
