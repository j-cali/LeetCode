/**
 *  Problem: 566. Reshape the Matrix
 *  Link: https://leetcode.com/problems/rising-temperature/description/
 *  Date (MDY): 02/05/2018
 *  Notes:
 */

package easy;

public class P566 {

	public static void main(String[] args) {
		int[][] in = { {1,2},
		               {3,4} };
		int[][] ans = matrixReshape(in, 1, 4);
		
		for (int r = 0; r < ans.length; r++) {
			for (int c = 0; c < ans[0].length; c++) {
				System.out.print(ans[r][c] + " ");
			}
			System.out.println();
		}
	}
	
    public static int[][] matrixReshape(int[][] nums, int r, int c) {
    	int rows = nums.length;
    	int cols = nums[0].length;
    	
    	// 1st: check to see if it is reshapeable; if not return original array
    	if (rows * cols != r * c) {
    		return nums;
    	}
    	
    	// 2nd: flatten out the nums array into a 1D (for easy row traversal)
    	int[] numsFlat = new int[rows * cols];
    	int ctr = 0;
    	for (int i = 0; i < nums.length; i++) {
    		for (int j = 0; j < nums[0].length; j++) {
    			numsFlat[ctr] = nums[i][j];
    			ctr++;
    		}
    	}
    	
    	// 3rd: populate the reshaped matrix
    	int[][] out = new int[r][c];
    	ctr = 0;
    	for (int i = 0; i < r; i++) {
    		for (int j = 0; j < c; j++) {
    			out[i][j] = numsFlat[ctr];
    			ctr++;
    		}
    	}
    	
        return out;
    }
    
}
