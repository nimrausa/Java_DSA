package Lec_10;

public class find_minimum_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {3,5,6,2,5,-19,9,2,0,-2,6,-10};
		System.out.println(min_array(arr));
		
		

	}
	public static int min_array(int [] arr) {
		int min=0;
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]<arr[min]) {
				min=i;
			}
			
		}
		return arr[min];
	}

}
