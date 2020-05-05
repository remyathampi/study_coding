package leetcode.mayChallenge.study_coding.dailyCodingChallenge;

import java.util.HashMap;
import java.util.Map;

class TreeNode{
	char value;
	TreeNode left;
	TreeNode right;
	TreeNode(char c){
		this.value = c;
	}
}
public class ReconstructTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] preorder = new char[] {'a', 'b', 'd', 'e', 'c', 'f', 'g'};
		char[] inorder = new char[] {'d', 'b', 'e', 'a', 'f', 'c', 'g'};
		TreeNode root = reconstruct(preorder,inorder);
		print(root);
	}

	private static void print(TreeNode root) {
		if(root == null)return;
		print(root.left);
		System.out.print(root.value+" ");
		print(root.right);
		
	}

	private static TreeNode reconstruct(char[] preorder, char[] inorder) {
		Map<Character,Integer> inMap = constructMap(inorder);
		return createTree(preorder,0,preorder.length-1,inMap);
		
	}

	private static TreeNode createTree(char[] preorder, int start, int end, Map<Character, Integer> inMap) {
		if(start>end)return null;
		else if(start == end)return new TreeNode(preorder[start]);
		else {
			TreeNode root = new TreeNode(preorder[start]);
			int pivot = findPivot(preorder,start,end,inMap);
			if(pivot >=0) {
				root.left = createTree(preorder,start+1,pivot-1,inMap);
				root.right = createTree(preorder,pivot,end,inMap);
			}
			return root;
		}
		
	}

	private static int findPivot(char[] preorder, int start, int end, Map<Character, Integer> inMap) {
		char root = preorder[start];		
		int rootPos = (Integer)inMap.get(root).intValue();
		for(int i= start+1;i<=end;i++) {
			char key = preorder[i];int val = (Integer)inMap.get(key).intValue();
			if(rootPos<val)return i;
		}
		return -1;
	}

	private static Map<Character, Integer> constructMap(char[] inorder) {
		Map<Character,Integer> inMap = new HashMap<>();
		for(int i=0;i<inorder.length;i++) {
			inMap.put(inorder[i], i);
		}
		return inMap;
	}

}
