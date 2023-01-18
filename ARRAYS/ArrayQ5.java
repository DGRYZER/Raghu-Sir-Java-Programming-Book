//Write a java program to define a method to return average of integer array elements//
//I/P- [23,45,56,78]//
//O/P- 50.5 //

package org.jsp.Array;

import java.util.Scanner;

public class ArrayQ5 {
	static double getavg(double[] ar) {
		double sum = 0;
		for (int i = 0; i < ar.length; i++) {
			sum = sum + ar[i];
		}
		double avg = sum / ar.length;
		return avg;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int a = sc.nextInt();
		System.out.println("Enter the " + a + " number of integer value");
		double[] ir = new double[a];
		for (int i = 0; i < ir.length; i++) {
			ir[i] = sc.nextInt();
		}
		double res = getavg(ir);
		System.out.println("Sum of the numbers is " + res);
	}
}
