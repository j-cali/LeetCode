/**
 *  Problem: 557. Reverse Words in a String III
 *  Link: https://leetcode.com/problems/reverse-words-in-a-string-iii/description/
 *  Date (MDY): 02/01/2018
 *  Notes:
 */

package easy;

public class P557 {

	public static void main(String[] args) {
		String in = "Let's take LeetCode contest";
		System.out.println(reverseWords(in)); // expected answer: s'teL ekat edoCteeL tsetnoc
	}
	
	public static String reverseWord(String w) {
		String reversed = "";
		for (int i = w.length() - 1; i >= 0; i--) {
			reversed += w.charAt(i);
		}
		return reversed;
	}
	
    public static String reverseWords(String s) {
    	String ans = "";
    	String[] words = s.split(" ");
    	for (int i = 0; i < words.length - 1; i++) {
    		ans += reverseWord(words[i]) + " ";
    	}
    	return ans + reverseWord(words[words.length - 1]);
    }
    
}
