package leetcode.mayChallenge;

public class VersionControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(firstBadVersion(2126753390));
	}
	public static int firstBadVersion(int n) {
        if(n == 0)return 0;
        return findBadVersion(1,n);
    }
    public static int findBadVersion(int s,int e){
        if(s>e)return 0;
        if(s == e && isBadVersion(s))return s;
        int mid = (s+e)/2;
        if(isBadVersion(mid))
            return findBadVersion(s,mid);
        else
            return findBadVersion(mid+1,e);
    }
	private static boolean isBadVersion(int n) {
		if(n>=4)return true;
		return false;
	}

}
