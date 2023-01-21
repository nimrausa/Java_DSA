package DAY_10;

public class array_max_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {30,78,90,2,48,72,100,9,7};
		int max=arr[0];
		System.out.println(maximum(arr, max));
		

	}
	public static int maximum(int [] arr, int max) {
		for (int i = 1; i < arr.length; i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		return max;
		
	}

}
