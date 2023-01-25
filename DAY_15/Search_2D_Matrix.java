package DAY_15;

public class Search_2D_Matrix {
	
	public static void main(String[] args) {
		//sorted row and colum size
		int [] [] arr= {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		int item=1;
		System.out.println(find(arr,item));
	}
	public static boolean find(int [] [] arr, int item) {
		int row=0;
		int col=arr[0].length-1;
		while(col>=0 && row<=arr.length-1) {
			if(arr[row][col]==item) {
				return true;	
			}
			
			else if(arr[row][col]>item) {
				col--;	
			}
			else {
				row++;
			}
			
		}
		return false;
	}
}
