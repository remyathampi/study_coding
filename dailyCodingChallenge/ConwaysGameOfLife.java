package leetcode.mayChallenge.study_coding.dailyCodingChallenge;

public class ConwaysGameOfLife {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int M = 10, N = 10; 
		  
        // Intiliazing the grid. 
        int[][] grid = { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, 
            { 0, 0, 0, 1, 1, 0, 0, 0, 0, 0 }, 
            { 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 }, 
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, 
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, 
            { 0, 0, 0, 1, 1, 0, 0, 0, 0, 0 }, 
            { 0, 0, 1, 1, 0, 0, 0, 0, 0, 0 }, 
            { 0, 0, 0, 0, 0, 1, 0, 0, 0, 0 }, 
            { 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 }, 
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } 
        }; 
        System.out.println("Old gen");
        printMatrix(grid);
        findNextGenerations(grid,2);
	}

	private static void findNextGenerations(int[][] grid, int G) {
		for(int i=0;i<G;i++) {
			int [][] futureGen = nextGenaration(grid);
			System.out.println("NewGen");
			printMatrix(futureGen);
		}
		
	}

	private static int[][] nextGenaration(int[][] grid) {
		int [][] future = new int[grid.length][grid[0].length];
		for(int i=0;i<grid.length;i++) {
			for(int j=0;j<grid[0].length;j++) {
				if(grid[i][j] == 0 && getNeighbours(i,j,grid) == 3)
					future[i][j] = 1;
				else if(grid[i][j] == 1) {
					int n = getNeighbours(i,j,grid);
					if(n==2 || n==3)
						future[i][j] = 1;
				}
			}
		}
		return future;
	}

	private static int getNeighbours(int i,int j,int[][] grid) {
		int [][] dir = {{0,-1},{0,1},{1,0},{-1,0},{-1,-1},{1,1},{1,-1},{-1,1}};
		int count = 0;
		for(int[] d : dir) {
			int nI = i+d[0];
			int nJ = j+d[1];
			if((nI>=0 && nI<grid.length) && (nJ>=0 && nJ< grid[i].length))
				if(grid[nI][nJ]==1)
					count++;
		}
		return count;
	}

	private static void printMatrix(int[][] grid) {
		for(int i=0;i<grid.length;i++) {
			for(int j=0;j<grid[i].length;j++) {
				if(grid[i][j] == 0)
					System.out.print('.');
				else
					System.out.print('*');
			}
			System.out.println();
		}
		
	}

}
