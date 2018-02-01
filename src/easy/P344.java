/**
 *  Problem: 344. Reverse String
 *  Link: https://leetcode.com/problems/reverse-string/description/
 *  Date (MDY): 02/01/2018
 *  Notes: Use divide-and-conquer recursion
 */

package easy;

public class P344 {

	public static void main(String[] args) {
		System.out.println(reverseString("hello")); // expected answer: olleh
	}

    public static String reverseString(String s) {
    	if (s.length() <= 1) {
    		return s;
    	}
    	String right = s.substring(s.length() / 2, s.length());
    	String left = s.substring(0, s.length() / 2);
        return reverseString(right) + reverseString(left);
    }
    
}
