package recursion;

import java.util.Scanner;

public class floodFill {
	
	public static void floodfill(int[][] maze,int row,int col,String ans,boolean[][] visited) {
		if(row<0 || col<0 || row==maze.length || col==maze[0].length || maze[row][col]==1 || visited[row][col]==true) {
			return;
		}
		
		if(row==maze.length-1 && col==maze[0].length-1) {
			System.out.println(ans);
			return;
		}
		visited[row][col]=true;
		floodfill(maze,row-1,col,ans+"t",visited);
		floodfill(maze,row,col-1,ans+"l",visited);
		floodfill(maze,row+1,col,ans+"d",visited);
		floodfill(maze,row,col+1,ans+"r",visited);
		visited[row][col]=false;
	}

	public static void main(String[] args) {
		int n=4,m=4;
		Scanner sc=new Scanner(System.in);
		int [][]arr=new int[n][m];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		boolean visited[][]=new boolean[n][m];
		floodfill(arr,0,0,"",visited);
	}

}
