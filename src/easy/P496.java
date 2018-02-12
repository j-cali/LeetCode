/**
 *  Problem: 496. Next Greater Element I
 *  Link: https://leetcode.com/problems/next-greater-element-i/description/
 *  Date (MDY): 02/12/2018
 *  Notes:
 */

package easy;

public class P496 {

	public static void main(String[] args) {
		int[] nums1 = {4, 1, 2};
		int[] nums2 = {1, 3, 4, 2};
		int[] ans = nextGreaterElement(nums1, nums2); // expected answer = [-1, 3, -1]
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
	}
	
	public static int getIndex(int[] nums2, int num) {
		for (int i = 0; i < nums2.length; i++) {
			if (nums2[i] == num) {
				return i;
			}
		}
		return -1;
	}
	
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        
        for (int i = 0; i < nums1.length; i++) {
        	int index = getIndex(nums2, nums1[i]);
        	boolean greater = false;
        	
        	if (index < 0) {
        		ans[i] = index;
        		continue;
        	}
        	
        	for (int j = index; j < nums2.length; j++) {
        		if (nums2[j] > nums1[i]) {
        			ans[i] = nums2[j];
        			greater = true;
        			break;
        		}
        	}
        	
        	if (!greater) {
        		ans[i] = -1;
        	}
        }
        
        return ans;
    }
    
}
