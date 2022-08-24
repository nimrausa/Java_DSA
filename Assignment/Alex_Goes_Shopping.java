package Assignment;

import java.util.Scanner;

public class Alex_Goes_Shopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int test=sc.nextInt();
		while(test-->0) {
			int price=sc.nextInt();
			int items=sc.nextInt();
		
		if (alex_shop(arr,price,items)==true) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		}

	}
	public static boolean alex_shop(int [] arr, int price, int items ) {
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			if(price%arr[i]==0) {
				count++;
			}
		}
			if(count>=items) {
				return true;
			}
			else {
				return false;
			}
		
		
	}

}
