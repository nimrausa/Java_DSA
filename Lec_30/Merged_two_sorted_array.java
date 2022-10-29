package Lec_30;

public class Merged_two_sorted_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1= {1,3,4,19,67};
		int [] arr2= {2,6,7,8,79};
		int [] ans=MergeTwoArray(arr1, arr2);
		for(int i=0; i<ans.length; i++) {
			System.out.print(ans[i]+ " ");
		}
		
	}
	public static int[] MergeTwoArray(int []arr1, int[] arr2){
		
		int i=0;
		int j=0;
		int k=0;
		int [] ans=new int [arr1.length+ arr2.length];
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]>arr2[j]) {
				ans[k]=arr2[j];
				j++;
				k++;
			}
			else {
					ans[k]=arr1[i];
					i++;
					k++;
			
		}
		}
			while(i<arr1.length) {
				ans[k]=arr1[i];
				i++;
				k++;
				
			}
			while(j<arr2.length) {
				ans[k]=arr2[j];
				j++;
				k++;
				
			}
			return ans;
		
	}

}
