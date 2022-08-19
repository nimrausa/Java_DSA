package Lec_10;

import java.util.Scanner;

public class Reverse_range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int p=sc.nextInt();
		int q=sc.nextInt();
		int [] arr=new int[n];
		for(int i=0; i<arr.length; i++) {
			 arr[i]= sc.nextInt();
		}
		reverse_range(arr, p, q);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			
		}
	}
	public static void  reverse_range(int [] arr, int p, int q) {
		
	while(p<q) {
			int temp=arr[p];
			arr[p]=arr[q];
			arr[q]=temp;
			p++;
			q--;
			
		}
		
		
	}

}
