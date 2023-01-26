package Day_17;

public class Print_substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Mango Apple";
		System.out.println(s.lastIndexOf("go")); //5-2=3
		print(s);
	}

	public static void print(String s) {
		for (int i = 0; i < s.length(); i++) {
			for (int j = i+1; j <= s.length(); j++) {
				System.out.println(s.substring(i,j)); //index of j not included
				
			}
			
		}
		
	}

}
