package DAY_10;

public class array_min_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {30,78,90,2,48,72,9,7};
		int min=arr[0];
		System.out.println(minimum(arr, min));
		

	}
	public static int minimum(int [] arr, int min) {
		for (int i = 1; i < arr.length; i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		return min;
		
	}

}
