/**
 *  Problem: 728. Self Dividing Numbers
 *  Link: https://leetcode.com/problems/self-dividing-numbers/description/
 *  Date (MDY): 01/28/2018
 *  Notes:
 */

package easy;

import java.util.ArrayList;
import java.util.List;

public class P728 {

	public static void main(String[] args) {
		List<Integer> result = selfDividingNumbers(1, 22);
		System.out.println(result);
	}

    public static List<Integer> selfDividingNumbers(int left, int right) {
    	List<Integer> result = new ArrayList<Integer>();
    	
    	for (int i = left; i <= right; i++) {
    		String curr = Integer.toString(i);
    		if (!curr.contains("0")) {
    			boolean valid = true;
    			for (int j = 0; j < curr.length(); j++) {
    				int currDigit = Character.getNumericValue(curr.charAt(j));
    				if (!(i % currDigit == 0)) {
    					valid = false;
    					break;
    				}
    			}
    			if (valid) {
    				result.add(i);
    			}
    		}
    	}
   
        return result;
    }
}
