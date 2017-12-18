package ds.arrays.advance;

import java.util.Scanner;

/*Context 
Given a  2D Array, :

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
We define an hourglass in  to be a subset of values with indices falling in this pattern in 's graphical representation:

a b c
  d
e f g
There are  hourglasses in , and an hourglass sum is the sum of an hourglass' values.

Task 
Calculate the hourglass sum for every hourglass in , then print the maximum hourglass sum.

Sample Input

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0
Sample Output

19


Explanation

 contains the following hourglasses:

1 1 1   1 1 0   1 0 0   0 0 0
  1       0       0       0
1 1 1   1 1 0   1 0 0   0 0 0

0 1 0   1 0 0   0 0 0   0 0 0
  1       1       0       0
0 0 2   0 2 4   2 4 4   4 4 0

1 1 1   1 1 0   1 0 0   0 0 0
  0       2       4       4
0 0 0   0 0 2   0 2 0   2 0 0

0 0 2   0 2 4   2 4 4   4 4 0
  0       0       2       0
0 0 1   0 1 2   1 2 4   2 4 0
The hourglass with the maximum sum (19) is:

2 4 4
  2
1 2 4
*/
public class HourGlass {

	public static void main(String[] args) {

		// Input 2-D Array.
		try {

			int[][] arr = inputArray(6);
			System.out.println(getMaxHourGlass(arr));
			

		} catch (Exception e) {

			e.getMessage();
		}
	}

	public static int getMaxHourGlass(int arr[][]) {

		int i, j, sumOfHourGlass, max = -999999;

		for (i = 0; i < (arr.length - 2); i++) {
			sumOfHourGlass = 0;
			for (j = 0; j < (arr.length - 2); j++) {
				
				int firstRow = arr[i][j] + arr[i][j+1] + arr[i][j+2];
				int secondRow = arr[i+1][j+1];
				int thirdRow = arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
				
				sumOfHourGlass = firstRow + secondRow + thirdRow;
				
				if(sumOfHourGlass > max) {
					max = sumOfHourGlass;
				}
			}
		}

		return max;
	}

	private static int[][] inputArray(int n) throws Exception {

		if (n < 0)
			throw new Exception("Size cannot be negative.");
		Scanner scanner = new Scanner(System.in);

		System.out.println("The size of Array is:  " + n + " x " + n + ".\n");
		int arr[][] = new int[n][n];

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}

		scanner.close();
		return arr;
	}
}