package Day_37;

import java.util.Stack;

public class PutInDown_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st=new Stack<>();
		st.push(10);
		st.push(40);
		st.push(6);
		st.push(89);
		st.push(70);
		System.out.println(st);
		Insertdown(st, -11);
		System.out.println(st);
		
	}
	public static void Insertdown(Stack<Integer> st , int i) {
		if(st.isEmpty()) {
			st.push(-11);
			return;
		}
		int item=st.pop();
		Insertdown(st,i);
		st.push(item);	
	}
}
