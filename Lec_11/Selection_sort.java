package Lec_11;

public class Selection_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {5,3,-7,4,8,2};
		
	selection(arr);
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+ " ");
	}
	

}
 public static void selection(int [] arr) {
	 for (int i = 0; i < arr.length; i++) {
		 int mini=i;
		 for (int j = i+1; j < arr.length; j++) {
			 if(arr[mini]>arr[j]) {
				 mini=j;
			 }
		}
		 int temp=arr[i];
		 arr[i]=arr[mini];
		 arr[mini]=temp;
	 }
	}
}
