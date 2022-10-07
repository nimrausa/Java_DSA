package Lec_18;

public class Subarray_Product_Less_Than_K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,4,6,3};
		int k=10;
		System.out.println(produclessk(arr,k));

	}
	public static int produclessk(int [] arr, int k) {
		int si=0;
		int ei=0;
		int p=1;
		int ans=0;
		while(ei<arr.length) {
			p=p*arr[ei];
			while(p>=k && si<=ei) {
				p=p/arr[si];
				si++;
			}
			ans=ans+(ei-si+1);
			ei++;
			
		}
		return ans;
	}

}
