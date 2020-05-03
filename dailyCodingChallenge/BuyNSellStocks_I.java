package leetcode.mayChallenge.study_coding.dailyCodingChallenge;

public class BuyNSellStocks_I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] s = new int[] {9, 11, 8, 5, 7, 10};
		System.out.println(getProfit(s));
	}
	public static int getProfit(int[] stocks) {
		if(stocks == null || stocks.length==0)return 0;
		int min = Integer.MAX_VALUE;
		int maxProfit = Integer.MIN_VALUE;
		for(int i=0;i<stocks.length;i++) {
			if(min>stocks[i])min = stocks[i];
			else {
				maxProfit = Math.max(maxProfit, stocks[i]-min);
			}
		}
		return maxProfit;
	}

}
