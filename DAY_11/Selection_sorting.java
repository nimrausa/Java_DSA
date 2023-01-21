package DAY_11;

public class Selection_sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr= {30,78,90,2,48,72,100,9,7};
		selection(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}

	}
	public static void selection(int [] arr) {
		
		for (int i=0 ; i<arr.length-1; i++) {
			int mini=i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j]<arr[mini]) {
					mini=j;
					
				}	
				
			}
			int temp=arr[mini];
			arr[mini]=arr[i];
			arr[i]=temp;
			
		
		}
	}
}