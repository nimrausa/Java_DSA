package DAY_07;

public class Lexi_Numbers {
	public static void main(String[] args) {
	int n=1000;
	int curr=0;
	counting(curr,n);
	}
	
	public static void counting(int curr,int n) {
		if(curr>n) {
			return;
		}
		
		System.out.println(curr);
		int i=0;
		if(curr==0) {
		 i=1;
	}
		for(; i<=9 ; i++) {
			counting(curr*10+i,n);
		}
}
}
