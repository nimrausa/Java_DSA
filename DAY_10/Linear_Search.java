package DAY_10;

public class Linear_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {30,78,90,48,72,9,7};
		int item=78;
		System.out.println(LinearSearch(arr, item));;
		
	}
	public static int LinearSearch(int [] arr, int item) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==item) {
				return i;//return=out of the function
				//break=not using it it will come out of the loop so -1 will
				//print in all the case
			}	
		}
		return -1;
	}
}
