package Assignment_2;

import java.util.Scanner;

public class Arrays_Selection_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();			
		}
		selection(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+ " ");
		}
	}
		public static void selection(int [] arr) {
			for (int i = 0; i < arr.length-1; i++) {
				int min=i;
				for (int j = i+1; j < arr.length; j++) {
					if(arr[j]<arr[i]) {
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
				
			}
			
		}
		}
		

	