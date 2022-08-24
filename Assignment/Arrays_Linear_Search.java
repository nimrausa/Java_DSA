package Assignment;

import java.util.Scanner;

public class Arrays_Linear_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int [] arr= new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();	
		}
		int target = sc.nextInt();// search wala item
		
		System.out.println(Linear_search(arr, target)) ;
			
		}
	public static int Linear_search(int [] arr, int target) {
		
		for ( int i = 0; i < arr.length; i++) {
			if (target==arr[i]) {
				return i;
			}
			
		}
		return -1;
		
		

	}

}
