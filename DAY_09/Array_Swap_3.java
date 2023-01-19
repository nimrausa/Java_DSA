package DAY_09;

public class Array_Swap_3 {
	//Java is call by value not call by reference

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {30,78,90,48,72,9,7};
		int [] other= {80,7,100,344,2,35,54};
		System.out.println(arr[0] + " " + other[0]);
		swap(arr,other); //it is call by reference
		System.out.println(arr[0] + " " + other[0]);
	}
	public static void swap(int [] arr, int [] other) {
		//it will swap in local variable not in actual value
		//when it will run than it will be volatile
		//it will not go to heap and change but it will change in the stack
		//it can't change in to main function
		int[] temp=arr;
		arr=other;
		other=temp;
		
	}

}
