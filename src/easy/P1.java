/**
 *  Problem: 1. Two Sum
 *  Link: https://leetcode.com/problems/two-sum/description/
 *  Date (MDY): 01/23/2018
 *  Notes:
 */

package easy;

import java.util.Arrays;

public class P1 {

	public static void main(String[] args) {
		int[] arr = {2, 7, 11, 15};
		int target = 9;;
		int[] solution = twoSum(arr, target);
		System.out.println(Arrays.toString(solution));
	}
	
    public static int[] twoSum(int[] nums, int target) {
    	int[] answ = {-1, -1};
    	for (int i = 0; i < nums.length - 1; i++) {
			int curr = nums[i];
			for (int j = i + 1; j < nums.length; j++) {
				int next = nums[j];
				if (curr + next == target) {
					answ[0] = i;
					answ[1] = j;
				}
			}
		}
    	return answ;
    }

}
