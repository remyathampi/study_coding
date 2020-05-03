package leetcode.mayChallenge;

/**
 * Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.
 * Each letter in the magazine string can only be used once in your ransom note.
 * canConstruct("a", "b") -> false
 * canConstruct("aa", "ab") -> false
 * canConstruct("aa", "aab") -> true
 * @author remya
 *
 */
public class RansomNote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(canConstruct("a", "b"));
		System.out.println(canConstruct("aa", "ab"));
		System.out.println(canConstruct("aa", "aab"));
	}
	
	public static boolean canConstruct(String ransomNote, String magazine) {
		if(ransomNote == null || ransomNote.length() == 0)return true;
        if(magazine == null || magazine.length()==0)return false;
        int[] cArr = new int[26];
        for(char c : magazine.toCharArray()) {
        	cArr[c-'a']++;
        }
        for(char c : ransomNote.toCharArray()) {
        	if(cArr[c-'a'] == 0)return false;
        	cArr[c-'a']--;
        }
        return true;
    }

}
