package Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Max_Value_In_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		max_value(arr);
		
	}
	public static void max_value(int [] arr) {
		int max=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			
				
			}
		System.out.print(max);
		
		}
	}


