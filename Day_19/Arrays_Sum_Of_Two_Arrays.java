package Day_19;

import java.util.ArrayList;
import java.util.Scanner;

public class Arrays_Sum_Of_Two_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int m=sc.nextInt();
		int [] brr=new int[m];
		for (int i = 0; i < brr.length; i++) {
			brr[i]=sc.nextInt();
		}
		SumArray(arr,brr);

	}

	public static void SumArray(int[] arr, int[] arr1) {
		ArrayList <Integer> list=new ArrayList<>();
		int carry=0;
		int i=arr.length-1;
		int j=arr1.length-1;
		
		while(i>=0 || j>=0) {
			int sum=0;
			if(i>=0){
			sum=sum+arr[i];
			i--;
			
			}
			if(j>=0){
				sum=sum+arr1[j];
				j--;
				
				}
			
			sum+=carry;
			list.add(sum%10);
			carry=sum/10;
		}
		if(carry>0) {
			list.add(carry);
		}
		for(int k=list.size()-1 ; k>=0; k--) {
			System.out.print(list.get(k)+ ",");
		}
		System.out.println("END");
		
	}
}
