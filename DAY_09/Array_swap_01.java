package DAY_09;

public class Array_swap_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {30,78,90,48,72,9,7};
		System.out.println(arr[0] + " " + arr[1]);
		swap(arr[0], arr[1]);
		System.out.println(arr[0] + " " + arr[1]);
		
		

	}
	public static void swap(int a, int b) {
		int temp=a;
		a=b;
		b=temp;
	}

}
