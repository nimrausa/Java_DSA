package Lec_09;

public class swap_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,3,4,56,6};
		int [] other= {8,9,0,6,5,4};
		System.out.println(arr[0] + " " + other[0]);
		swap(arr, other);
		System.out.println(arr[0] + " " + other[0]);
		
	}
	public static void swap(int [] arr, int []other) {
		int[] temp= arr;
		arr=other;
		other=temp;
	}

}
