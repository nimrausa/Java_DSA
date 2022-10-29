package Lec_17;

public class sub_stringPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String time="Hello Bye";
		System.out.println(time.lastIndexOf("y"));
		printSubString(time);

	}
	public static void printSubString(String time) {
		
		for(int i=0; i<time.length(); i++) {
			for(int j=i+1; j<=time.length(); j++ ) {
				System.out.println(time.substring(i,j));
				
			}
		}
	}

}
