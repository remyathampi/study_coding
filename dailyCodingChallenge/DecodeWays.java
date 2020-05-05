package leetcode.mayChallenge.study_coding.dailyCodingChallenge;

public class DecodeWays {

	public static void main(String[] args) {
		System.out.println(numDecodings("27"));

	}
	
	public static int numDecodings(String s) {
        if(s == null || s.length()==0)
            return 0;
        int len = s.length();
        int dp[] = new int[len+1];
        dp[0] = 1;
        
        if(s.charAt(0) != '0')
            dp[1] = 1;
        
        for(int i=2;i<=len;i++){
            int fir = Integer.parseInt(s.substring(i-1,i));
            int sec = Integer.parseInt(s.substring(i-2,i));
            
            if(fir>0 && fir<=9)
                dp[i] = dp[i] + dp[i-1];
            if(sec>=10 && sec<=26)
                dp[i] = dp[i] + dp[i-2];
        }
        return dp[len];
    }
}
