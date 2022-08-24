package Lec_12;

public class Subarray_max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {2,1,3,4};
		System.out.println(subarray(arr));
		
	}
	public static int subarray(int [] arr) {
		int ans=Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			int sum=0;
			for (int j = i; j < arr.length; j++) {
				sum=sum+arr[j];
				System.out.print(sum + " ");
				ans=Math.max(ans,sum);
			}
				
			}
		return ans;
			
		}
		
	}

