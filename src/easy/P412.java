/**
 *  Problem: 412. Fizz Buzz
 *  Link: https://leetcode.com/problems/fizz-buzz/description/
 *  Date (MDY): 02/05/2018
 *  Notes:
 */

package easy;

import java.util.ArrayList;
import java.util.List;

public class P412 {

	public static void main(String[] args) {
		List<String> ans = fizzBuzz(15);
		for (String s : ans) {
			System.out.println(s);
		}
	}

    public static List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {
        	if (i % 3 == 0 && i % 5 == 0) {
        		ans.add("FizzBuzz");
        	} else if (i % 3 == 0) {
        		ans.add("Fizz");
        	} else if (i % 5 == 0) {
        		ans.add("Buzz");
        	} else {
        		ans.add(Integer.toString(i));
        	}
        }
        return ans;
    }
}
