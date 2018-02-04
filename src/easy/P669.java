/**
 *  Problem: 669. Trim a Binary Search Tree
 *  Link: https://leetcode.com/problems/trim-a-binary-search-tree/description/
 *  Date (MDY): 02/04/2018
 *  Notes:
 */

package easy;

import obj.TreeNode;

public class P669 {

    public static TreeNode trimBST(TreeNode root, int L, int R) {
    	if (root == null) {
    		return root;
    	}
    	
    	if (root.val < L) {
    		return trimBST(root.right, L, R);
    	}
    	
    	if (root.val > R) {
    		return trimBST(root.left, L, R);
    	}
    	
    	root.left = trimBST(root.left, L, R);
    	root.right = trimBST(root.right, L, R);
    	
    	return root;
    }
    
}
