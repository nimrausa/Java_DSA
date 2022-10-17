package Lec_28;

import java.util.Scanner;

public class Leetcode_N_queen {

	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int m = sc.nextInt();
			int q=sc.nextInt();
			char[][] board = new char[n][m];
			for (int i = 0; i < board.length; i++) {
				String str = sc.next();
				for (int j = 0; j < str.length(); j++) {
					board[i][j] = str.charAt(j);
				}

			}
			Nqueen(board, 0,0,q);
		}

		public static void Nqueen(char[][] board, int row,int col, int tq) {
			if (tq == 0) {
				Display(board);
				System.out.println();
				return;
			}
			for ( col = 0; col < board.length; col++) {
				if (isitsafe(board, row, col) == "Q") {
					board[row][col] = "Q";
					Nqueen(board, row + 1, col,tq-1);
					board[row][col] = ".";
				}

			}

		}

		public static int isitsafe(char [][] board, int row, int col) {
			// TODO Auto-generated method stub
			// upper side
			int r = row;
			while (r >= 0) {
				if (board[r][col] == "Q") {
					return ".";
				}
				r--;
			}
			// right diagonal
			r = row;
			int c = col;

			while (r >= 0 && c < board.length) {
				if (board[r][c] == "Q") {
					return ".";
				}
				c++;
				r--;
			}
			// left diagonal
			r = row;
			c = col;

			while (r >= 0 && c >= 0) {
				if (board[r][c] == "Q") {
					return ".";
				}
				c--;
				r--;
			}
			return "Q";
		}

		public static void Display(char[][] board) {
			// TODO Auto-generated method stub
			for (int i = 0; i < board.length; i++) {
				for (int j = 0; j < board.length; j++) {
					System.out.print(board[i][j] + " ");
				}
				System.out.println();
			}

		}

	}