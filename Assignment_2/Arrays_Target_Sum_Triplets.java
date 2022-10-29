package Assignment_2;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Target_Sum_Triplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
			
		}
		int target=sc.nextInt();
		Arrays.sort(arr);
		Targetsum(arr,target);
	}
	public static void Targetsum(int [] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			int j=i+1;
			int k=arr.length-1;
			while(j<k) {
				if(arr[i]+ arr[j]+arr[k]==target) {
					System.out.println(arr[i] + ", " + arr[j] + " and " + arr[k]);
					k--;
					j++;
					
				}else if(arr[i] + arr[j]+arr[k]>target) {
					k--;
					
				}
				else {
					j++;
				}
			}
		}
		 
	}
}
