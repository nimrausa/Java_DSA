package Assignment_2;

import java.util.Scanner;

public class Product_of_Array_Except_Self {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			long n=sc.nextLong();
			long [] arr=new long [(int) n];
			for (int i = 0; i < arr.length; i++) {
				arr[i]=sc.nextInt();
			}
			product(arr);
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]+ " ");
			}
			
	}
	public static void product(long [] arr) {
		long [] left=new long [arr.length];
		left[0]=1;
		for (long i = 1; i < arr.length; i++) {
			left[(int) i]=left[(int) (i-1)]*arr[(int) (i-1)];	
		}
		long [] right=new long [arr.length];
		right[arr.length-1]=1;
		for (int i = arr.length-2; i>=0; i--) {
			right[i]=right[i+1]*arr[i+1];	
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i]=left[i]*right[i];
		}
		
		
	}

}
