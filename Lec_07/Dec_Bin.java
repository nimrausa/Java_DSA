package Lec_07;

public class Dec_Bin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int	n=37;
	int mul=1;
	int sum=0;
	while(n>0) {
		int rem=n%2;
		sum=sum+mul*rem;
		n=n/2;
		mul=mul*10;
	}
	System.out.println(sum);
		
	}

}
