package Lec_32;

public class Check_Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=37;
		System.out.println(isprime(n));
		

	}
	public static boolean isprime (int n) {
		int i=2;
		if(i*i<=n) {
			return false;
		}
		i++;
		return true;
	}

}
