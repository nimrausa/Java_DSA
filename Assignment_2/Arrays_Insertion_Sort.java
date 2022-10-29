package Assignment_2;

import java.util.Scanner;

public class Arrays_Insertion_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();			
		}
		insertion(arr);
		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]+ " ");
		}
	}
	public static void insertion(int [] arr) {
		for (int i = 1; i < arr.length; i++) {
			int item=arr[i];
			int j=i-1;
			while(j>=0 && item<arr[j]) {
				arr[j+1]=arr[j];
				j--;
			}
			j++;
			arr[j]=item;
			
		}

	}

}
