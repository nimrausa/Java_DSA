package Lec_34;

public class person {
	private String name= "John"; //class data member
	private int age=22;
	
	public void Intro_yourself() {
		System.out.println("My name is " + name + " and age is " + age);
		
	}
	//consructor intialize class data member
	public person() {  //call for one object separately
		this.name="Mike";
		this.age=23;
		
		
	}
	public person(String name, int age) {  
		this.name=name;
		this.age=age;	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		
		return age;
	}
	public void setAge(int age) throws Exception {
		if(age<0) {
			 throw new Exception("Age can not be negative");
		}
		
		this.age = age;
	}
	
}
