package DAY_14;

public class Two_D_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] [] arr=new int [3][4];
		System.out.println(arr);// to print the address of the array
		
		//for row
		System.out.println(arr[0]); //address of the array
		System.out.println(arr.length);
		
		//for column
		System.out.println(arr[0][1]);//default value of the array
		System.out.println(arr[0].length); //first go to the address of the array
		//that is address of the row than the length of the column of that particular
		//column
		

	}

}
