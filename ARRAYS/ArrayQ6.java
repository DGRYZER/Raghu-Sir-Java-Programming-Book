//Write a java program to define a method to return how many prime numbers present in the array //
//I/P- [24,56,3,7,11,46] //
//O/P- 3 //

package org.jsp.Array;

import java.util.Scanner;

public class ArrayQ6 {
	static boolean getprime(int ar) {

		for (int i = 2; i < ar / 2; i++) {
			if (ar % i == 0)
				return false;
		}
		return true;
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
			boolean res = getprime(ir[i]);
			if (res == true)
				count++;
		}
		System.out.println("The number of prime numbers are " + count);
	}
}
