// Write a java program to define a method to return how many palindrome numbers present in the array within 100 //
// I/P- [12,34,45,33,45,77,78,99,89,66,45,989,787] //
// O/P- 4 //

package org.jsp.Array;

import java.util.Scanner;

public class ArrayQ13 {
	static boolean palindrome(int ar) {
		int sum = 0, temp = ar;
		if (ar > 0 && ar <= 100) {
			while (ar != 0) {
				int r = ar % 10;
				sum = sum * 10 + r;
				ar = ar / 10;
			}
			if (temp == sum)
				return true;
		}
		return false;
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
			boolean res = palindrome(a[i]);
			if (res)
				count++;
		}
		System.out.println("The count of palindrome numbers are " + count);
	}
}
