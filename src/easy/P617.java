/**
 *  Problem: 617. Merge Two Binary Trees
 *  Link: https://leetcode.com/problems/merge-two-binary-trees/description/
 *  Date (MDY): 01/28/2018
 *  Notes: 
 *  	- inorder: L C R
 *  	- preorder: C L R
 *  	- postorder: L R C
 */

package easy;

import obj.TreeNode;

public class P617 {

	public static void main(String[] args) {
		TreeNode root1 = new TreeNode(1);
		root1.left = new TreeNode(3);
		root1.left.left = new TreeNode(5);
		root1.right = new TreeNode(2);
		TreeNode root2 = new TreeNode(2);
		root2.left = new TreeNode(1);
		root2.left.right = new TreeNode(4);
		root2.right = new TreeNode(3);
		root2.right.right = new TreeNode(7);

		TreeNode result = mergeTrees(root1, root2);
		System.out.println("===merging root1 and root2===");
		printTreePreorder(result); // expected answer: 3 4 5 4 5 7		
	}

	/** Printing the contents of a binary tree using Preorder Traversal */
	public static void printTreePreorder(TreeNode tree) {
		if (tree != null) {
			System.out.print(tree.val + " ");
			printTreePreorder(tree.left);
			printTreePreorder(tree.right);			
		}
	}

	public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		if (t1 == null) {
			return t2;
		}
		if (t2 == null) {
			return t1;
		}

		// if we are here, then t1 and t2 are both NOT null
		t1.val += t2.val;
		t1.left = mergeTrees(t1.left, t2.left);
		t1.right = mergeTrees(t1.right, t2.right);
		return t1;
	}

}
