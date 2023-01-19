// Write a java program to define a method to return how many palindrome numbers present in the array //
// I/P- [12,34,232,43,565,678,898] //
// O/P- 3 //

package org.jsp.Array;

import java.util.Scanner;

public class ArrayQ12 {
	static boolean palindrome(int ar) {
		int sum = 0, temp = ar;
		for (int i = 0; i < ar; i++) {
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
		int a = sc.nextInt();
		int count = 0;
		System.out.println("Enter the " + a + " number of integer value");
		int[] ir = new int[a];
		for (int i = 0; i < ir.length; i++) {
			ir[i] = sc.nextInt();
		}
		for (int i = 0; i < ir.length; i++) {
			boolean res = palindrome(ir[i]);
			if (res)
				count++;
		}
		System.out.println("The count of palindrome numbers are "+count);
	}
}
