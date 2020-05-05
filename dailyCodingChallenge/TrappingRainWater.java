package leetcode.mayChallenge.study_coding.dailyCodingChallenge;

public class TrappingRainWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] w = new int[] {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(trap(w));
	}
	public static int trap(int[] height) {
		if(height == null || height.length==0)return 0;
		int l = height.length;
		int[] left = new int[l];
		int[] right = new int[l];
		
		left[0] = height[0];
		for(int i=1;i<l;i++) {
			left[i] = Math.max(height[i],left[i-1]);
		}
		right[l-1] = height[l-1];
		for(int i=l-2;i>=0;i--) {
			right[i] = Math.max(height[i], right[i+1]);
		}
		
		int water = 0;
		for(int i=0;i<l;i++) {
			water+= Math.min(left[i], right[i]) - height[i];
		}
		return water;
	}

}
