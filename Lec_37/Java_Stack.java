package Lec_37;
import java.util.Stack;

public class Java_Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st= new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.push(60);
		System.out.println(st.peek());  //to view the last element
		System.out.println(st);
		System.out.println(st.pop());   //to delete the last element
		System.out.println(st);
		System.out.println(st.size());
		System.out.println(st.isEmpty());
		
		
	}

}
