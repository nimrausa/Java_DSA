package DAY_10;

public class Rotate_Array {

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
		k=k%n;
		
		while(k>0) {
			int temp=arr[n-1];
			for (int i = n-2; i>=0; i--) {
				arr[i+1]=arr[i];
			}
			arr[0]=temp;
			k--;
			
		}
	}

}
