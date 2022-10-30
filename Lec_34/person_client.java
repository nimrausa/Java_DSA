package Lec_34;

public class person_client {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub	
		  //object----new person
		//constructor calling----person
		System.out.println("Hello");
	
		System.out.println("hey");
		person p =new person();
		person p1 =new person("Stan",34);
		person p2 =new person("Clay",23);
		p.Intro_yourself();
		p1.Intro_yourself();
		p2.Intro_yourself();
		p1.setName("Anik");
		p1.Intro_yourself();
		System.out.println(p1.getAge());
		p1.setAge(-91);
		System.out.println("bye");
		p1.Intro_yourself();
	}

}
