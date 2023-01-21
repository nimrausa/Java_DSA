package DAY_11;

public class Insertion_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {30,78,90,2,48,72,100,9,7};
		Insertion(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}

	}

	public static void Insertion(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int j=i-1;
			int item=arr[i];
			while(j>=0 && arr[j]>item) {
				arr[j+1]=arr[j];
				j--;
			}
			j++;
			arr[j]=item;	
		}
	}
}
