package Lec_18;

public class Subarray_Sum_window_size_k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {2,3,4,5,80,40,12,34,56};
		int k=3;
		System.out.println(subarray_sum(arr,k));

	}
	public static int subarray_sum(int [] arr, int k) {
		int sum=0;
		for (int i = 0; i < k; i++) {
			sum+=arr[i];
			
		}
		int ans=0;
		for (int i=k; i<arr.length; i++) {
			sum=sum+arr[i]-arr[i-k];
			ans=Math.max(ans,sum);
			
		}
		return ans;
	}

}
