package Day_18;

public class Kartik_Bhaiya_And_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abababbaaaaabbb";
		int k=2;
		int fliba=flipchar(str,k,'a');
		int flipb=flipchar(str,k,'b');
		System.out.println(Math.max(fliba, flipb));
		

	}

	public static int flipchar(String str, int k, char ch) {
		// TODO Auto-generated method stub
		int si=0;
		int ei=0;
		int flip=0;
		int ans=0;
		//variable window size of the array and string change with the 
		//question condition
		//grow
		while(ei<str.length()) {
			if(str.charAt(si)==ch) {
				flip++;
				
			}
			//shrinl
			while((flip>k) && si<=ei) {
				if(str.charAt(ei)==ch) {
					flip--;
				}
				si++;
				
			}
			//ans calculation
			ans=Math.max(ans, (ei-si+1));
			ei++;
		}
		return ans;
	}

}
