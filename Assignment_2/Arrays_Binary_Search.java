package Assignment_2;

import java.util.Scanner;

public class Arrays_Binary_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long n=sc.nextInt();
		long [] arr=new long[(int) n];
		for (long i = 0; i < arr.length; i++) {
			arr[(int) i]=sc.nextInt();			
		}
		long item=sc.nextInt();
		
		System.out.println(binary(arr,item));
	}
	public static int binary(long[] arr,long item) {
		
		for ( long i = 0; i < arr.length; i++) {
			if(item==arr[(int) i]) {
				return (int) i;
			}
		}
		return -1;
			
		}
	}