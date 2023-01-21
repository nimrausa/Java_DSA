package DAY_11;

public class DNF {
	//dutch national flag==it has only three elements

	public static void main(String[] args) {
		int [] arr= {0,2,0,1,2,0,1,2,0,2,1,0,2,0,0,1};
		flag(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}

	}

	public static void flag(int[] arr) {
		int i=0;
		int k=0;
		int j=arr.length-1;
		while(k<j) {
			if(arr[k]==2) {
				int temp=arr[k];
				arr[k]=arr[j];
				arr[j]=temp;
				j--;
			}
		
			else if(arr[k]==0) {
				int temp=arr[k];
				arr[k]=arr[i];
				arr[i]=temp;
				k++;
				i++;
			}
			else {
				k++;
			}
		}
		
	}

}
