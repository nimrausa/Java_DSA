package DAY_13;

public class Binary_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {2,3,6,7,9,10,12,45,67};
		int item=6;
		System.out.println(binary(arr,item));
		
	}

	public static int binary(int[] arr, int item) {
		int si=0;
		int ei=arr.length-1;
		
		
		while(si<=ei) {
			int mid=(si+ei)/2;
			if(arr[mid]==item) {
				return mid;
			}
			else if(arr[mid]>item) {
				ei=mid-1;
			}
			else {
				si=mid+1;
			}
			
		}
		return -1;
		
	}

}
