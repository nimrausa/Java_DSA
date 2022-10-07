package Lec_23;

public class Static_var_comp {
	static int val=100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(val);
		fun();
		System.out.println(val);
	}
	public static void fun() {
		System.out.println("hey");
		val=val-5;
		int val=50;
		Static_var_comp.val=Static_var_comp.val + 6;
		System.out.println(val);
	}
}
