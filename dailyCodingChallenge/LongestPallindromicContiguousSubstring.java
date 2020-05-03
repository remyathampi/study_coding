package leetcode.mayChallenge.study_coding.dailyCodingChallenge;

/**
 * Given a string, find the longest palindromic contiguous substring. 
 * If there are more than one with the maximum length, return any one.
 * For example, the longest palindromic substring of "aabcdcb" is "bcdcb". 
 * The longest palindromic substring of "bananas" is "anana".
 * @author remya
 *
 */
public class LongestPallindromicContiguousSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getLongestPallindromicSS("aabcdcb"));
		System.out.println(getLongestPallindromicSS("banana"));
		
	}
	public static String getLongestPallindromicSS(String s) {
		int start = 0;int end = 0;
		for(int i=0;i<s.length();i++) {
			int l1 = getPSubStringLength(i,i,s);
			int l2 = getPSubStringLength(i,i+1,s);
			int len = Math.max(l1, l2);
			if(len>end-start) {
				start = i-(len-1)/2;
				end = i+len/2;
			}
		}
		return s.substring(start, end+1);
	}
	private static int getPSubStringLength(int start, int end,String s) {
		while(start>=0 && end<s.length() && s.charAt(start) == s.charAt(end)) {
			start--;end++;
		}
		return end-start-1;
	}

}
