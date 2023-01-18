//Write a java program to read n integer elements from the user and print sum of all those elements//
//I/P- [40,60,20,40,40]//
//O/P- 200//

package org.jsp.Array;

import java.util.Scanner;

public class ArrayQ2 {
	static int getsum(int[] ar) {
		int sum = 0;
		for (int i = 0; i < ar.length; i++) {
			sum = sum + ar[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		System.out.println("Enter the " + n + " number of integer");
		int[] ir = new int[n];
		for (int i = 0; i < ir.length; i++) {
			ir[i] = sc.nextInt();
		}
		int res = getsum(ir);
		System.out.println("Sum of the " + n + " integer is " + res);
	}
}
