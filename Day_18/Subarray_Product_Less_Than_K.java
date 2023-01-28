package Day_18;

public class Subarray_Product_Less_Than_K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {10,5,2,6};
		int k=100;
		System.out.println(divide(arr,k));
	}

	public static int  divide(int[] arr, int k) {
		int si=0;
		int ei=0;
		int p=1;
		int ans=0;
		while(ei<arr.length) {
			p=p*arr[ei];
			
			
			while(p>=k && si<=ei  ) {	
				p=p/arr[si];
				si++;
				
			}
			ans= ans+(ei-si+1);
			
			ei++;
			
		}
		return ans;
		
	}

}
