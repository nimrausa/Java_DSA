package Lec_13;

public class First_bad_version {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {2,3,4,5,6,7,8,9};
		System.out.println(isBadVersion(arr));
		

	}
	public static int isBadVersion(int []arr) {
		int low=0;
		int se=5;
		int high=arr.length-1;
		int ans=0;
		
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==se) {
				ans=mid;
				high=mid-1;	
				return ans;
			}
			else {
				low=mid+1;
			}
		}
		return -1;
	}

}
