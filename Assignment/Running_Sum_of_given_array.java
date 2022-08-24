package Assignment;

import java.util.Scanner;

public class Running_Sum_of_given_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		running_sum(arr);
		

	}
	public static void running_sum(int [] arr) {
		int [] brr=new int[arr.length+1];
		brr[0]=0;
		for(int i=1; i<=arr.length;i++) {
			brr[i]=arr[i-1]+brr[i-1];
			}
		
	for (int i = 1; i <= arr.length; i++) {
		System.out.print(brr[i]+ " ");
	}
	
	}
	
	

}
