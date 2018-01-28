/**
 *  Problem: 760. Find Anagram Mappings
 *  Link: https://leetcode.com/problems/find-anagram-mappings/description/
 *  Date (MDY): 01/23/2018
 *  Notes:
 */

package easy;

import java.util.Arrays;

public class P760 {

	public static void main(String[] args) {
		int a[] = {12, 28, 46, 32, 50};
		int b[] = {50, 12, 32, 46, 28};
		int answ[] = anagramMappings(a, b);
		System.out.println(Arrays.toString(answ)); // expected answer: [1, 4, 3, 2, 0]
	}
	
	public static int[] anagramMappings(int[] A, int[] B) {
		int[] P = new int[A.length];
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B.length; j++) {
				if (A[i] == B[j]) {
					P[i] = j;
				}
			}
		}	
		return P;
	}
}
