package Assignment;

import java.util.Scanner;

public class Odd_and_Even_back_in_Delhi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			int n = sc.nextInt();
			int oddsum = 0;
			int evensum = 0;
			int sum=0;
			while (n > 0) {
				int rem = n % 10;
				sum=sum+rem;
				n /= 10;// n = n/10;

			}
			if (sum % 2 == 0) {
				evensum =sum;// evensum = evensum +rem;
				oddsum=1;
			} else {
				oddsum =sum;
				evensum=1;
			}
			if (evensum % 4 == 0 || oddsum % 3 == 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
			t--;
		}

	}

}
		