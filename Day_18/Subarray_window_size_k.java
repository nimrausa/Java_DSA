package Day_18;

public class Subarray_window_size_k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {10,20,100,3,17,150,18,12,25};
		int k=3;
		SubarraySum(arr,k);

	}

	public static void SubarraySum(int[] arr, int k) {
		int sum=0;
				
		for (int i = 0; i < k; i++) {
			sum=sum+arr[i];
		}
		int ans=sum;
		for (int i = k; i < arr.length; i++) {
			sum=sum+arr[i];
			sum=sum-arr[i-k];
			ans=Math.max(ans, sum);
			
		}
		System.out.println(ans);
	}

}
//fixed size window //subarray is fixed
//1. calculation of first window
//2. window grow
//3. window shrink

//final ans calculate

