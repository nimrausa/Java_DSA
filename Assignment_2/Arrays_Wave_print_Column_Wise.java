package Assignment_2;

import java.util.Scanner;

public class Arrays_Wave_print_Column_Wise {


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
			for (int col = 0; col < arr[0].length; col++) {
					if(col%2==0) {
						for (int row = 0; row < arr.length; row++) {
							count++;
							if(count==(arr.length)*(arr[0].length)) {
								System.out.print(arr[row][col] + ", " + "END");
								
							}
							else {	
							System.out.print(arr[row][col] + ", ");
							
							
								}
						}
					
																	}
						else {
							for (int row = arr.length-1; row >=0; row--) {
								count++;
								if(count==(arr.length)*(arr[0].length)) {
									System.out.print(arr[row][col] + ", " + "END");	
								}
								else {
								System.out.print(arr[row][col]+ ", ");
								
							
								}
							}
							
																		}
														}
			
		}

	}
