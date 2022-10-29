package Lec_21;

public class print_inc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			// TODO Auto-generated method stub
			int n=5;
			PI(n);

		}
		public static void PI(int n) {
			if(n==0) {
				return;
			}
			PI(n-1);
			System.out.println(n);
			
		}

	}