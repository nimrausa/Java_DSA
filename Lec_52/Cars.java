package Lec_52;




	public class Cars implements Comparable <Cars> {

		int speed;
		int price;
		String color;
		
		public Cars(){
			
		}
		public Cars(int price,int speed, String color) {
			this.price=price;
			this.speed=speed;
			this.color=color;
		}
		@Override
		public String toString() {
			return "P=" + this.price + "  C=" + this.color + "  S="+ this.speed;
		}
		@Override
		public int compareTo(Cars o) {  //comparable work for only one logic
			// TODO Auto-generated method stub
			return this.speed-o.speed ; //marks incresing order
			  //rank decreasing order
			
			//	return o.color.compareTo(this.color);
			
				//return o.price-this.price;
			
		}
		//@Override
		//public int compareTo(Cars o) {
			// TODO Auto-generated method stub
		//	return 0;
		//}
	}




	//High priority=Last


