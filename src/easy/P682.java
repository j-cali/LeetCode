/**
 *  Problem: 682. Baseball Game
 *  Link: https://leetcode.com/problems/baseball-game/description/
 *  Date (MDY): 02/03/2018
 *  Notes: Use stack to record valid points
 */

package easy;

import java.util.Stack;

public class P682 {

	public static void main(String[] args) {
		String[] in1 = {"5","2","C","D","+"};
		String[] in2 = {"5","-2","4","C","D","9","+","+"};
		System.out.println(calPoints(in1)); // expected answer: 30
		System.out.println(calPoints(in2)); // expected answer: 27
	}

    public static int calPoints(String[] ops) {
        Integer pts = 0;
        Stack<Integer> stack = new Stack<Integer>();
        
        for (int i = 0; i < ops.length; i++) {
        	String curr = ops[i];
        	if (curr.equals("D")) {
        		pts += stack.push(2 * stack.peek());
        	} else if (curr.equals("C")) {
        		pts -= stack.pop();
        	} else if (curr.equals("+")) {
        		int temp = stack.pop();
        		int total = temp + stack.peek();
        		stack.push(temp);
        		pts += stack.push(total);
        	} else {
        		int num = 0;
        		if (curr.charAt(0) == '-') {
        			num = -Integer.parseInt(curr.substring(1));
        		} else {
        			num = Integer.parseInt(curr);
        		}
        		pts += stack.push(num);
        	}
        }
        
        return pts;
    }
    
}
