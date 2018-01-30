/**
 *  Problem: 461. Hamming Distance
 *  Link: https://leetcode.com/problems/hamming-distance/description/
 *  Date (MDY): 01/24/2018
 *  Notes:
 */

package easy;

public class P461 {

	public static void main(String[] args) {
		int x = 1;
		int y = 4;
		System.out.println(hammingDistance(x, y)); // expected answer: 2
	}

    public static int hammingDistance(int x, int y) {
    	return Integer.bitCount(x ^ y);
    }
}
