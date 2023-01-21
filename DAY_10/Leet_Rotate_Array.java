package DAY_10;

public class Leet_Rotate_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {30,78,90,2,48,72,100,9,7};
		int k=3;
		rotate(arr,k);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}
	public static void rotate(int [] arr, int k) {
		int n=arr.length;
		k=k%n; //to see how many times the array be rotated
		int i=0;
		int j=n-1;
		reverse(arr,n-k,n-1);
		reverse(arr,0,n-k-1);
		reverse(arr,0,n-1);
		
	}
	public static void reverse(int [] arr, int i, int j) {
	while(i<j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		i++;
		j--;
		}
	}
}
