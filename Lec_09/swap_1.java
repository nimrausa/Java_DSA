package Lec_09;

public class swap_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,3,4,5,6};
		
		System.out.println(arr[0] + " " + arr[1]);
		swap(arr);
		System.out.println(arr[0] + " " + arr[1]);
		
	}
	public static void swap(int[] arr) {
	int temp= arr[0];
	arr[0]=arr[1];
	arr[1]=temp;
	}

}
