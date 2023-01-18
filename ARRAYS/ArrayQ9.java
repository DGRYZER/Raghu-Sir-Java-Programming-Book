//Write a java program to define a method to return how many prime numbers present in the array within 100 //
//I/P- [78,56,3,7,11,46,88,45,454,112,111] //
//O/P- 3 //

package org.jsp.Array;

import java.util.Scanner;

public class ArrayQ9 {
	static boolean getprime(int ar) {
		for (int i = 2; i < ar / 2; i++) {
//			if(ar<100)
			if (ar % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		System.out.println("Enter the " + n + " number of data");
		int count = 0;
		int[] ir = new int[n];
		for (int i = 0; i < ir.length; i++) {
			ir[i] = sc.nextInt();
		}
		for (int i = 0; i < ir.length; i++) {
			boolean res = getprime(ir[i]);

			if (res == true && i >= 0 && i <= 100)
				count++;
		}
		System.out.println("The count of prime number within 100 is " + count);
	}
}
