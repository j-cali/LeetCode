/**
 *  Problem: 463. Island Perimeter
 *  Link: https://leetcode.com/problems/island-perimeter/description/
 *  Date (MDY): 02/09/2018
 *  Notes:
 */

package easy;

public class P463 {

	public static void main(String[] args) { 
		int[][] in = {{0,1,0,0},
				{1,1,1,0},
				{0,1,0,0},
				{1,1,0,0} };
		System.out.println(islandPerimeter(in)); // expected answer: 16
	}

	public static int getCellPerimeter(int[][] grid, int row, int col) {
		int perim = 0;

		if (grid[row][col] == 1) {
			if (row == 0) {
				perim++;
			}
			if (col == grid[row].length -1) {
				perim++;
			} 
			if (col == 0) {
				perim++;
			} 
			if (row == grid.length - 1) {
				perim++;
			}
			if (row > 0 && grid[row - 1][col] == 0) {
				perim++;
			} 
			if (row < grid.length - 1 && grid[row + 1][col] == 0) {
				perim++;
			}
			if (col > 0 && grid[row][col - 1] == 0) {
				perim++;
			} 
			if (col < grid[row].length - 1 && grid[row][col + 1] == 0) {
				perim++;
			}
		}

		return perim;
	}

	public static int islandPerimeter(int[][] grid) {
		int perimeter = 0;
		for (int r = 0; r < grid.length; r++) {
			for (int c = 0; c < grid[r].length; c++) {
				perimeter += getCellPerimeter(grid, r, c);
			}
		}
		return perimeter;
	}

}
