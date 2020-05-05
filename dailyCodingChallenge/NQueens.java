package leetcode.mayChallenge.study_coding.dailyCodingChallenge;

import java.util.ArrayList;
import java.util.List;

public class NQueens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> result = new ArrayList<>();
		solveNQueens(4,0,new ArrayList<Integer>(),result);
		System.out.println(result);
	}

	private static void solveNQueens(int n, int rowId, ArrayList<Integer> columns, List<List<Integer>> result) {
		if(n==rowId)
			result.add(new ArrayList<>(columns));
		else {
			for(int i=0;i<n;i++) {
				columns.add(i);
				if(isValid(columns)) {
					solveNQueens(n, rowId+1, columns, result);
				}
				columns.remove(columns.size()-1);	
			}
		}
		
	}

	private static boolean isValid(ArrayList<Integer> columns) {
		int rowId = columns.size()-1;
		for(int i=0;i<rowId;i++) {
			int diff = Math.abs(columns.get(i) - columns.get(rowId));
			if(diff == 0 || diff == rowId-i)return false;
		}
		return true;
	}

}
