/**
 *  Problem: 500. Keyboard Row
 *  Link: https://leetcode.com/problems/keyboard-row/description/
 *  Date (MDY): 02/02/2018
 *  Notes: 
 */

package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P500 {
	
	public static char[] KEYBOARD = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p',
			'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l',
			'z', 'x', 'c', 'v', 'b', 'n', 'm'};
	
	public static void main(String[] args) {
		String[] in = {"Hello", "Alaska", "Dad", "Peace"};
		String[] res = findWords(in);
		System.out.println(Arrays.toString(res)); // expected answer: ["Alaska", "Dad"]
	}
	
	public static int getRow(int letter) {
		int letterIndex = 0;
		
		for (int i = 0; i < 26; i++) {
			if (KEYBOARD[i] == letter) {
				letterIndex = i;
			}
		}
		
		if (letterIndex >= 0 && letterIndex <= 9) {
			return 0;
		} else if (letterIndex > 9 && letterIndex <= 18) {
			return 1;
		} else {
			return 2;
		}
	}
	
    public static String[] findWords(String[] words) {
        List<String> ans = new ArrayList<>();
        
        for (int i = 0; i < words.length; i++) {
        	boolean add = true;
        	String curr = words[i].toLowerCase();
        	int row = getRow(curr.charAt(0));
        	for (int j = 1; j < curr.length(); j++) {
        		int currRow = getRow(curr.charAt(j));
        		if (currRow != row) {
        			add = false;
        			break;
        		}
        	}
        	if (add) {
        		ans.add(words[i]);
        	}
        }
        
        return ans.toArray(new String[0]);
    }
    
}
