package ds.arrays.advance;

import java.util.Scanner;

public class SparseArray {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		String[] sts = new String[N];
		for (int i = 0; i < sts.length; i++) {
			sts[i] = scanner.next();
		}

		int Q = scanner.nextInt();
		String[] qs = new String[Q];
		for (int i = 0; i < qs.length; i++) {
			qs[i] = scanner.next();
		}
		
		for (int n : sparse(sts,qs)) {
			System.out.println(n);
		}
		scanner.close();
	}

	private static int[] sparse(String[] sts, String[] qs) {
		int[] ns = new int[qs.length];
		int i = 0;
		for (String s : qs) {
			int c = 0;
			for(String s1 : sts) {
				if(s1.equals(s))
					c++;
			}
			ns[i++] = c;
		}
		return ns;
	}
}