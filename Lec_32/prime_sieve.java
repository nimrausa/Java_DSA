package Lec_32;

public class prime_sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=100;
		primeprime(n);
		

	}
	//false==prime
	//true===not prime
	public static void primeprime(int n) {
		boolean[] prime =new boolean [n+1]; 
		prime [0] =true;//0 is not prime number
		prime[1]=true ;//1 is prime
		
		for (int i = 0; i *i <=n; i++) {
			if(prime[i]==false) {
				for(int mul=2; i*mul<=n; mul++) {
					prime[mul*i]=true;
				}
				
				}
			}
		for (int i=0 ; i<prime.length ; i++) {
			if(prime[i]==false) {
				System.out.print(i + " ");
			}
			
		}
		
	}

}
