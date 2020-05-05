package leetcode.mayChallenge.study_coding.dailyCodingChallenge;

public class MoveZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n = new int[] {0,1,0,3,12};
		moveZeroes(n);
		print(n);
	}
	private static void print(int[] n) {
		for(int i=0;i<n.length;i++) {
			System.out.print(n[i]+" ");
		}
		
	}
	public static void moveZeroes(int[] nums) {
        if(nums==null || nums.length==0)return;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                int j=i+1;
                while(j<nums.length && nums[j]==0)j++;
                if(i<nums.length && j<nums.length)
                    swap(i,j,nums);
            }
        }
        
    }
    public static void swap(int i,int j,int[] a){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
