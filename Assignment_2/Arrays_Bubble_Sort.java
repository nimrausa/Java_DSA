package Assignment_2;

import java.util.Scanner;

public class Arrays_Bubble_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();			
		}
		bubble(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+ " ");
		}

	}
	public static void bubble(int [] arr) {
		for (int turn = 1; turn < arr.length; turn++) {
			for (int i = 0; i < arr.length-turn; i++) {
				if(arr[i]>arr[i+1]) {
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
			
		}
	}

}
