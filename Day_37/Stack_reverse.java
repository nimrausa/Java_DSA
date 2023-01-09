package Day_37;

import java.util.Stack;

public class Stack_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st=new Stack<>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		System.out.println(st);
		reverse(st);
		System.out.println(st);
	
	}
	public static void reverse(Stack<Integer> st) {
		if(st.isEmpty()) {
			return;
		}
		int item=st.pop();
		reverse(st);
		putDown(st,item);
	}
	public static void putDown(Stack<Integer> st, int i) {
		if(st.isEmpty()) {
			st.push(i);
			return;
		}
		
		int item=st.pop();
		putDown(st,i);
		st.push(item);

		}

}
