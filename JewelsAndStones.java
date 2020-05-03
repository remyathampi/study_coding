package leetcode.mayChallenge;

/**
 * You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  
 * Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.

* The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so 
* "a" is considered a different type of stone from "A".
* Example : J = "aA" S = "aAAbbbb" Result = 3
 * @author remya
 *
 */
public class JewelsAndStones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String J = "aA";
		String S = "aAAbbbb";
		System.out.println(numJewelsInStones(J, S));
	}
	public static int numJewelsInStones(String J, String S) {
        if(J == null || J.length() == 0 || S == null || S.length() == 0)return 0;
        int count = 0;
        for(int i=0;i<S.length();i++){
            char c = S.charAt(i);
            if(J.indexOf(c)>-1)count++;
        }
        return count;
    }

}
