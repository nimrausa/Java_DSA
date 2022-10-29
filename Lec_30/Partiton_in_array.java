package Lec_30;

public class Partiton_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {5,7,2,3,8,9,1,4};
		int ans=partition(arr,0,arr.length-1);
		System.out.println(ans);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			
		}
		

	}
	public static int partition(int [] arr, int si,int ei) {
		int pi=si;
		
		int item=arr[ei];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<item) {
				int temp=arr[i];
				arr[i]=arr[pi];
				arr[pi]=temp;
				pi++;
				
				
			}
			
		}
		int temp=arr[ei];
		arr[ei]=arr[pi];
		arr[pi]=temp;
		return pi;
		
	}

}
