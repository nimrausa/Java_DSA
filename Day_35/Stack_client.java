package Day_35;

public class Stack_client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Stack s=new Stack();
		System.out.println(s.size());
		s.push(12);
		s.push(67);
		s.push(90);
		s.push(956);
		s.push(45);
		System.out.println(s.size());
		s.display();
		System.out.println(s.peek());
		s.display();
		System.out.println(s.pop());
		s.display();
		System.out.println(s.size());
		

	}

}
