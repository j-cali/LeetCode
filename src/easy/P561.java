/**
 *  Problem: 561. Array Partition I
 *  Link: https://leetcode.com/problems/array-partition-i/description/
 *  Date (MDY): 01/29/2018
 *  Notes: Pair the smallest numbers together and pair the largest numbers together
 */

package easy;

public class P561 {

	public static void main(String[] args) {
		int[] in = {1, 4, 3, 2};
		int answer = arrayPairSum(in);
		System.out.println(answer); // expected answer: 4
	}
	
    public static int arrayPairSum(int[] nums) {
        int answer = 0;
        
        // insertion sort
        for (int i = 1; i < nums.length; i++) {
        	int curr = nums[i];
        	int j = i - 1;
        	while (j >= 0 && nums[j] > curr) {
        		nums[j+1] = nums[j];
        		--j;
        	}
        	nums[j+1] = curr;
        }
        
        for (int i = 0; i < nums.length; i += 2) {
        	answer += nums[i];
        }
        
        return answer;
    }
}
