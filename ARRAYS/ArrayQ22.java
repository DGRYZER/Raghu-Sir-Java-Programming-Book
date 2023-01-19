// Write a java program to define a method to combine 2 array elements into single array //
// I/P- First array-> [12,34,56] //
// 	Second array-> [36,98,76] //
// O/P- [12,34,56,36,98,76]

package org.jsp.Array;

import java.util.Scanner;

public class ArrayQ22 {
	static int[] margearray(int[] ar1, int[] ar2) {
		int n = ar1.length + ar2.length;
		int[] res = new int[n];
		for (int i = 0; i < n; i++) {
			if (i < ar1.length) {
				res[i] = ar1[i];
			} else
				for (int j = 0; j < ar2.length; j++) {
					res[i] = ar2[j];
					i++;
				}
		}
		return res;
	}

	static int[] readarray(int[] ar) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		return ar;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the first array");
		int m = sc.nextInt();
		System.out.println("Enter " + m + " number of values");
		int[] a = new int[m];
		int[] c = readarray(a);
		System.out.println("Enter the size of the second array");
		int n = sc.nextInt();
		System.out.println("Enter " + n + " number of values");
		int[] b = new int[n];
		int[] d = readarray(b);
		int[] e = margearray(a, b);
		System.out.println("Combined array is- ");
		for (int i = 0; i < e.length; i++) {
			System.out.print(e[i]);
			System.out.print(" ");
		}

	}
}
