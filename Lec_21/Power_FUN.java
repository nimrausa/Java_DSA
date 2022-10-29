package Lec_21;

public class Power_FUN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=3;
		int b=4;
		System.out.println(pow(a,b)); 
		
	}
	public static int pow(int a, int b) {
		if(b==0) {
			return 1;
		}
		int p=pow(a,b-1);
		return a*p;
	}

}
