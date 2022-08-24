package Assignment;

import java.util.Scanner;

public class Sorting_In_Linear_Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();	
		}
		linear(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+ " ");
		}

	}
	public static void linear(int [] arr) {
		int i=0;
		int j=arr.length-1;
		int k=0;
		while(k<=j) {
			if(arr[k]==2) {
				int temp=arr[j];
				arr[j]=arr[k];
				arr[k]=temp;
				j--;
				
			}
			else if(arr[k]==0) {
				int temp=arr[i];
				arr[i]=arr[k];
				arr[k]=temp;
				i++;
				k++;
				
			}
			else {
				k++;
			}
		}
	}

}
