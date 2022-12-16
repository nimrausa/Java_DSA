package Lec_52;

public class Heap_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Heap hp = new Heap();
		hp.add(2);
		hp.add(3);
		hp.add(5);
		hp.add(1);
		hp.add(-61);
		hp.add(-9);
		hp.add(-50);
		hp.add(-2);
		hp.add(-60);
		hp.add(4);
		hp.add(-7);
		hp.add(-11);
		
	
	hp.Display();
	hp.remove();
	hp.Display();
	}

}