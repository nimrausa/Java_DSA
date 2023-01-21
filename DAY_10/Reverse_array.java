package DAY_10;

public class Reverse_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {30,78,90,2,48,72,100,9,7};
		int i=0;
		int j=arr.length-1;
		reverse(arr,i,j);
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k]+ " ");
		}
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
