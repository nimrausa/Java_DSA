package DAY_14;

public class Transponse_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] [] arr= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		transponse(arr);
	}

	private static void transponse(int[][] arr) {
		for (int j = 0; j < arr[0].length; j++) {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}
	

}