//Write a java program to define a method to return smallest element of the array//
//I/P- [34,56,78,12,45,17]//
//O/P- 12 //

package org.jsp.Array;

import java.util.Scanner;

public class ArrayQ3 {
	static int getsmallest(int ar[]) {
		int small = ar[0];
		for (int i = 1; i < ar.length; i++) {
			if (ar[i] < small)
				small = ar[i];
		}
		return small;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int a = sc.nextInt();
		System.out.println("Enter the " + a + " number of integer values");
		int ir[] = new int[a];
		for (int i = 0; i < ir.length; i++) {
			ir[i] = sc.nextInt();
		}
		int res = getsmallest(ir);
		System.out.println("Smallest number is " + res);

	}
}
