// Write a java program to define a method to return reverse the elements present in the array //
// I/P- [12,34,57,43,56] //
// O/P- [56,43,57,34,12] // 

package org.jsp.Array;

import java.util.Scanner;

public class ArrayQ21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int n = sc.nextInt();
		System.out.println("Enter " + n + " number of values");
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("Before the reverse ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			System.out.print(" ");
		}

		System.out.println();
		System.out.println("After the reverse ");
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i]);
			System.out.print(" ");
		}
	}
}
