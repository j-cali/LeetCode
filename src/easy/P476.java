/**
 *  Problem: 476. Number Complement
 *  Link: https://leetcode.com/problems/number-complement/description/
 *  Date (MDY): 01/31/2018
 *  Notes: 
 */

package easy;

public class P476 {

	public static void main(String[] args) {
		System.out.println(findComplement(5)); // expected answer: 2
		System.out.println(findComplement(1)); // expected answer: 0
	}
	
    public static int findComplement(int num) {
    	String curr = Integer.toBinaryString(num);
    	String ans = "";
    	for (int i = 0; i < curr.length(); i++) {
    		if (curr.charAt(i) == '0') {
    			ans += "1";
    		} else {
    			ans += "0";
    		}
    	}
        return Integer.parseInt(ans, 2);
    }

}
