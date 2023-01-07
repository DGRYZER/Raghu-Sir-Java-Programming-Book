///Write a java program to initialize 5 students percentage and display the highest percentage/
//I/P- [78.05% , 65.87% , 45.67% , 76.43% , 98.08%] //
//O/P- 98.08% //

package org.jsp.Array;

import java.util.Scanner;

public class ArrayQ1 {
	static double getperc(double[] ar) {
		double biggest = ar[0];
		for (int i = 1; i < ar.length; i++) {
			if (ar[i] > biggest)
				biggest = ar[i];
		}
		return biggest;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		double[] dr = new double[n];
		System.out.println("Enter the " + n + " number of value");
		for (int i = 0; i < dr.length; i++) {
			dr[i] = sc.nextDouble();
		}
		double res = getperc(dr);
		System.out.println("Biggest percentage " + res);
	}
}
