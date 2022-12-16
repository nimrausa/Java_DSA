package Lec_52;


public class Genric_Heap_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
			Genric_Heap <Cars> gp=new Genric_Heap<>();
			gp.add(new Cars (200, 10,"white"));
			gp.add(new Cars (700, 40,"Red"));
			gp.add(new Cars (700, 1,"Green"));
			gp.add(new Cars (15, 89,"Black"));
			gp.add(new Cars (540, 90,"Blue"));
			gp.add(new Cars (23330, 56,"Brown"));
			gp.Display();
	}
}
