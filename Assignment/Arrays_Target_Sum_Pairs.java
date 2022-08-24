package Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Target_Sum_Pairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		Arrays.sort(arr);

		target_Sum(arr, target);

	}

	public static void target_Sum(int[] arr, int target) {
		int low = 0;
		int high = arr.length - 1;
		while (low < high) {
			if (arr[low] + arr[high] == target) {
				System.out.println(arr[low] + " " + "and" + " " + arr[high]);
				low++;
				high--;

			}
			else if (arr[low] + arr[high] > target) {
				high--;
			} else {
				low++;
			}

		}

	}

}
