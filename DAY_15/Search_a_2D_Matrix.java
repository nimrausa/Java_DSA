package DAY_15;

import java.util.Iterator;

public class Search_a_2D_Matrix {
	//brurt force n2 complexity

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] [] arr= {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		int item=20;
		System.out.println(find(arr,item));
		
	}

	public static boolean find(int[][] arr, int item) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if(arr[i][j]==item) {
					return true;
				}
				
			}
			
		}
		return false;
		
		
	}

}
