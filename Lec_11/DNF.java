package Lec_11;

public class DNF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {2,0,1,0,2,1,1,2,0,2};
		dutch(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			
		}
}
	public static void dutch(int [] arr) {
		int i=0;
		int j=arr.length-1;
		int k=0;
		while(k<=j) {
			if(arr[k]==2) {	
				int temp=arr[j];
					arr[j]=arr[k];
					arr[k]=temp;
					j--;
			}
			else if(arr[k]==0) {
				int temp=arr[i];
					arr[i]=arr[k];
					arr[k]=temp;
					i++;
					k++;
			}
			else {
				k++;
				
				
			}
		}
	}
	}
