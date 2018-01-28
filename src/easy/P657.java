/**
 *  Problem: 657. Judge Route Circle
 *  Link: https://leetcode.com/problems/judge-route-circle/description/
 *  Date (MDY): 01/26/2018
 *  Notes:
 */

package easy;

public class P657 {

	public static void main(String[] args) {
		String m1 = "UD";
		String m2 = "LL";
		System.out.println(judgeCircle(m1));
		System.out.println(judgeCircle(m2));
	}
	
    public static boolean judgeCircle(String moves) {
    	int x = 0;
    	int y = 0;
    	for (char move : moves.toCharArray()) {
    		switch (move) {
    		case 'U': y++; break;
    		case 'D': y--; break;
    		case 'L': x--; break;
    		case 'R': x++; break;
    		}
    	}
        return x == 0 && y == 0;
    }

}
