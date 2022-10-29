package Lec_13;

public class Binary_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= { 3,5,8,9,10,12,16,18,19,20};
		System.out.println(binary_search(arr));
		
}
	public static int binary_search(int [] arr) {
		int item=20;
		int low=0;
		int high=arr.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
		
		if(arr[mid]==item){
			return mid;
	}
		else if (arr[mid]>item) {
			high=mid-1;
		}
		else {
			low=mid+1;
		}
		}
		return -1;
}
}
