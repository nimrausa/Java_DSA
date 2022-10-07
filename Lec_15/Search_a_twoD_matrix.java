package Lec_15;

import java.util.Iterator;
import java.util.Scanner;

public class Search_a_twoD_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int [][] arr=new int [n][m];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				 arr[i][j]=sc.nextInt();	
			}
		}
			int target=sc.nextInt();
			System.out.println(search(arr,target));
			//1 3 5 7
            //10 11 16 20
           //23 33 34 60
		
	}
	public static boolean search(int [] [] arr, int target) {
		int row=0;
		int col=arr[0].length-1;
		while(row<arr.length && col>=0) {
			if(arr[row][col]==target) {
				return true;
			}
			else if(arr[row][col]>target) {
				col--;	
			}
			else  {
				row++;	
			}
		}
		return false;	
	}
}
