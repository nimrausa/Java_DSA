package DAY_15;

public class Divisible_Subarrays {

	public static void main(String[] args) {
		int [] arr= {5,5,5,5,5};
		int n=5;
		System.out.println(divide(arr,n));
		

	}

	public static int divide(int[] arr, int n) {
		int c=0;
		for (int i = 0; i < arr.length; i++) {
			int sum=0;
			for(int j=i; j<arr.length; j++ ) {
				sum=sum+arr[j];
				if(sum%n==0) {
					System.out.print(sum + " ");
					c++;
				}
				
				
			}
		}
		System.out.println();
		return c;
		
	}


}
