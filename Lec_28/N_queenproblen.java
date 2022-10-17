package Lec_28;

import java.util.Iterator;

public class N_queenproblen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		boolean [] [] board=new boolean[n][n];
		Nqueen(board,0,n);
	}
	public static void Nqueen(boolean [] [] board, int row, int tq) {
		if(tq==0) {
				display(board);
				System.out.println();
				return;
			
		}
		for (int col = 0; col < board.length; col++) {
			if(isitsafe(board,row,col)==true) {
				board[row][col]=true;
				Nqueen(board,row+1, tq-1);
				board[row][col]=false;
				
			}
			
			
		}
	}
	public static boolean isitsafe(boolean [][]board, int row, int col) {
		//upper side
		int r=row;
		System.out.println(r);
		while(r>=0){
			if(board[r][col]==true) {
			return false;
			}
			r--;
			}
	//right diagonal
		int c=col;
		r=row;
		while(r>=0 && c<board.length) {
			if(board[r][c]==true) {
			return false;
			}
			r--;
			c++;
		
		}
	//left diagonal
		r=row;
		c=col;
		while(r>=0 && c>=0) {
			if(board[r][c]==true) {
				return false;
		}
		r--;
		c--;
		
	}
	return true;
	}
	public static void display (boolean [] [] board) {
		for (int i = 0; i < board.length; i++) {
		 for (int j = 0; j < board.length; j++) {
			 System.out.print(board[i][j]+ " ");
			
		}
		 System.out.println();
			
		}
	}
	}
