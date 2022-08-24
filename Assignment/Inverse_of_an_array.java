package Assignment;

import java.util.Scanner;

public class Inverse_of_an_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr= new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();	
		}
		reverse( arr) ;
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]+ " ");	
			}	
		}
	public static void reverse(int [] arr ) {
		int [] arr1=new int[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			int idx=arr[i];
			arr1[idx]=i;
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i]=arr1[i];
		}
	}
}
