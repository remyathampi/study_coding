package leetcode.mayChallenge;

/**
 * Given a positive integer, output its complement number. 
 * The complement strategy is to flip the bits of its binary representation.
 * Input: 5
 * Output: 2
 * Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. 
 * So you need to output 2.
 * @author remya
 *
 */
public class NumberComplement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findComplement(5));
	}
	
	public static int findComplement(int num) {
        int result = 0;
        int power = 1;
        while(num>0){
            result+=(num%2^1) * power;
            power = power<<1;
            num = num>>1;
        }
        return result;
    }

}
