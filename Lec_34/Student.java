package Lec_34;

public class Student {
	private String name ="Jane";
	private int age=22;
	
	public Student (String name, int age) {
		this.name=name;
		this.age=age;
		
	}
	void Intro_yourself() {
		System.out.println("My name " + name + " and the age is " + age);
	}

	public int getAge() {
		
		return age;
	}
	

// public void setAge (int age) throws Exception{
	// if(age<0) {
		// throw new Exception("The age will never be negative");	 
	 //}
//	 this.age=age;
// }
	public void setAge (int age) {
		 try {
			 if(age<0) {
				 System.out.println("In try");
			 throw new Exception("The age will never be negative");	 
			 }
			 this.age=age;
		 
		 }catch (Exception e) {
			 System.out.println("In catch");
			 e.printStackTrace();
		 }
		 
		finally {  ///to close the file in the end of programe
			 System.out.println("I am i the final blocks");
		 }
		 
		
	 }
}