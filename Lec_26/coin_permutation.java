package Lec_26;

public class coin_permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int coin[]= {2,3,5,6};
		int amount=10;
		printanswer(coin,amount,"");
		

	}
	public static void printanswer(int [] coin,int amount,String ans) {
		if(amount==0) {
			System.out.println(ans);
			return;
		}
		
		
		for (int i = 0; i < coin.length; i++) {
			if(amount>=coin[i]) {
				//amount-=coin[i];
				//printanswer(coin,amount,ans+coin[i]);
				//amount+=coin[i];
				printanswer(coin,amount-coin[i],ans+coin[i]);
				
			}
			
			
			
		}
	}

}
