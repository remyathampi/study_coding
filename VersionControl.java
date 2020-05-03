//Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one,
//which causes all the following ones to be bad.
//You are given an API bool isBadVersion(version) which will return whether version is bad. Implement a function to find the first bad version.
//	You should minimize the number of calls to the API.



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
