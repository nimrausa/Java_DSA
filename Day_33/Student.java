package Day_33;

public class Student {
	int age;
	String name;
	static int noofcount;
	
	public void Intro_yourself() {
		System.out.println("My name is " + name + " and age is "+  age);
	}
    public void sayhey(String name) {
    	System.out.println(name + " say hi to "+ this.name);
    }
    public static void fun() { //we need to call static function
    	System.out.println("working");
    }
    static {//no need to call static block it will run automatically
    System.out.println("You don't need to call me because i am in static block i can run automatically");
    }
}
