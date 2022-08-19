package Assignment;

import java.util.Scanner;

public class Sum_of_odd_placed_and_even_placed_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = n;
		int odd = 0;
		int even = 0;
		int count = 0;
		while (n != 0) {
			n = n / 10;
			count++;
			int rem = sum % 10;
			if (count % 2 != 0) {
				odd = odd + rem;
			}
			else {
				even = even + rem;
			}
			sum = sum / 10;
		}
		System.out.println(odd);
		System.out.println(even);

	}

}
