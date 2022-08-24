package Assignment;

import java.util.Iterator;
import java.util.Scanner;

public class Squares_of_a_Sorted_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int [n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		square(arr);
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
		}
		
	}
	public static void square(int [] arr) {
		for (int i = 0; i < arr.length; i++) {
			int j=i;
			arr[j]=arr[i]*arr[i];
		}
		sort(arr);
		
	}
	public static void sort(int [] arr) {
		
		for(int turn=1; turn<arr.length; turn++) {
			for( int j=0; j<arr.length-turn; j++) {
				
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
	}

}
