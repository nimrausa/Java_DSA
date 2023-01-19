package DAY_09;

public class Array_Swap_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {30,78,90,48,72,9,7};
		System.out.println(arr[0] + " " + arr[1]);
		swap(arr,0,1);
		System.out.println(arr[0] + " " + arr[1]);
		

	}
	public static void swap(int [] arr, int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j]; //now it will go inside the array so the value will
		//be changed in the heap
		arr[j]=arr[i];
		
	}

}
