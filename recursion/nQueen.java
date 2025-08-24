package recursion;
//https://www.youtube.com/watch?v=05y82cP3bJo&list=PL-Jc9J83PIiFxaBahjslhBD1LiJAV7nKs&index=51
public class nQueen {

	public static void printNQueens(int[][] chess,String ans,int row) {
		if(row==chess.length) {
			System.out.println(ans+".");
			return;
		}
		
		for(int col=0;col<chess.length;col++) {
			if(isItSafePlaceForQueen(chess,row,col)==true) {
			chess[row][col]=1;
			printNQueens(chess,ans+row+col+",",row+1);
			chess[row][col]=0;
			}
		}
	}
	private static boolean isItSafePlaceForQueen(int[][] chess, int row, int col) {
		//vertical check
		for(int i=row-1,j=col;i>=0;i--) {
			if(chess[i][j]==1) {
				return false;
			}
		}
		//left diagonal check
		for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--) {
			if(chess[i][j]==1) {
				return false;
			}
		}
		//right diagonal check
		for(int i=row-1,j=col+1;i>=0 && j<=chess.length-1;i--,j++) {
			if(chess[i][j]==1) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int[][] chess=new int[4][4];
		printNQueens(chess,"",0);

	}

}
