package ds.arrays.advance;

import java.util.Scanner;

public class LeftRotation {

	static int[] leftRotation(int[] a, int d) {
		
		while(d > 0) {
			
			int i = 0;
			int re = a[i];
			for(	; i < (a.length - 1); i++) {
				a[i] = a[i + 1];
			}
			a[i] = re;
			d--;
		}
		
		return a;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int d = in.nextInt();
		int[] a = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		int[] result = leftRotation(a, d);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
		}
		System.out.println("");

		in.close();
	}
}
