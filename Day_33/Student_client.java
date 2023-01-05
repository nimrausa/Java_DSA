package Day_33;

public class Student_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s=new Student();  //s=refrence variable  //new student=object instance
		Student s1=new Student();
		s.name="John";
		s.age=35;
		s1.name="Mike";
		s1.age=18;
		s1.Intro_yourself();
		s.Intro_yourself();
		
		
		s.sayhey("sarah");
		Student.fun();
		//int x=Student.noofcount;
		
		
		

	}

}
