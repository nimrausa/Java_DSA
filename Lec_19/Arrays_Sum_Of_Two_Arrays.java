package Lec_19;

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
		
		sumofarray(arr,brr);
	}
	public static void sumofarray(int [] arr, int [] brr) {
		int carry=0;
		int i=arr.length-1;
		int j=brr.length-1;
		ArrayList<Integer> list= new ArrayList<>();
		while(i>=0 || j>=0) {
			int sum=0;
			if(i>=0) {
			sum+=arr[i];
			i--;
			}
			if(j>=0) {
				sum+=brr[j];
				j--;
				}
			sum+=carry;
			list.add(sum%10);
			carry=sum/10;
			
		}
		if(carry>0) {
			list.add(carry);
		}
		for (int k=list.size()-1; k>=0; k--) {
			System.out.print(list.get(k) + ", ");
		}
		System.out.print("END");
	}

}
