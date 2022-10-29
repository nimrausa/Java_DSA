package Assignment_2;

import java.util.Scanner;

public class Arrays_Wave_Print_Row_Wise {

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
		waveColumn(arr);
		
		
	}
	public static void waveColumn(int [] [] arr) {
		int count=0;
		for (int row = 0; row < arr.length; row++) {
				if(row%2==0) {
					for (int col = 0; col < arr[0].length; col++) {
						count++;
						if(count==(arr.length)*(arr[0].length)) {
							System.out.print(arr[row][col] + "," + "END");
							
						}
						else {	
						System.out.print(arr[row][col] + ",");
						
						
							}
					}
				
																}
					else {
						for (int col = arr[0].length-1; col >=0; col--) {
							count++;
							if(count==(arr.length)*(arr[0].length)) {
								System.out.print(arr[row][col] + "," + "END");	
							}
							else {
							System.out.print(arr[row][col]+ ",");
							
						
							}
						}
						
																	}
													}
		
	}

}
