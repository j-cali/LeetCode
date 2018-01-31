/**
 *  Problem: 766. Toeplitz Matrix
 *  Link: https://leetcode.com/problems/toeplitz-matrix/description/
 *  Date (MDY): 01/31/2018
 *  Notes: Skip 1st row, then for the following rows, skip the 1st element in the row
 */

package easy;

public class P766 {

	public static void main(String[] args) {
		int[][] matrix = {{1,2,3,4},
						  {5,1,2,3},
						  {9,5,1,2}};
		System.out.println(isToeplitzMatrix(matrix));
	}
	
    public static boolean isToeplitzMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int r = 1; r < rows; r++) {
        	for (int c = 1; c < cols; c++) {
        		if (matrix[r-1][c-1] != matrix[r][c]) {
        			return false;
        		}
        	}
        }
        return true;
    }
}
