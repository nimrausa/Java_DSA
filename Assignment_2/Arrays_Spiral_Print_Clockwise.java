package Assignment_2;

import java.util.Scanner;

public class Arrays_Spiral_Print_Clockwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int [][] arr=new int[n][m];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j]=sc.nextInt();				
			}
		}
		Clockwise(arr);
		
		
	}
	public static void Clockwise(int[] [] arr) {
		int c=0;
		int x=(arr.length)*(arr[0].length);
		int minr=0;
		int minc=0;
		int maxr=arr.length-1;
		int maxc=arr[0].length-1;
		
		while(c<x) {
			for (int i = minc; i <= maxc && c<x; i++) {
				System.out.print(arr[minr][i]+ "," + " ");
				c++;
			}
			minr++;
			
			for (int i = minr; i <= maxr && c<x; i++) {
				System.out.print(arr[i][maxc]+ ","+ " ");
				c++;
			}
			
			maxc--;
			
			for (int i = maxc; i >=minc && c<x; i--) {
				System.out.print(arr[maxr][i]+ ","+ " ");
				c++;
			}
			
			maxr--;
			for (int i = maxr; i >=minr && c<x; i--) {
				System.out.print(arr[i][minc]+ ","+ " ");
				c++;
			}
			minc++;
			
		}
		System.out.print("END");
	}

}
