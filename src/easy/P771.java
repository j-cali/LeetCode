/**
 *  Problem: 771. Jewels and Stones
 *  Link: https://leetcode.com/problems/jewels-and-stones/description/
 *  Date (MDY): 02/07/2018
 *  Notes:
 */

package easy;

public class P771 {

	public static void main(String[] args) {
		String j = "aA";
		String s = "aAAbbbb";
		System.out.println(numJewelsInStones(j, s));
	}

    public static int numJewelsInStones(String J, String S) {
    	int count = 0;
    	for (int i = 0; i < J.length(); i++) {
    		char curr = J.charAt(i);
    		if (S.contains(curr + "")) {
    			count += (S.length() - S.replace(curr + "", "").length());
    		}
    	}
        return count;
    }
    
}
