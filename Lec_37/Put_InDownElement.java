package Lec_37;

import java.util.Stack;

public class Put_InDownElement {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Stack <Integer> st=new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.push(60);
		System.out.println(st);
		InsertDown(st, -11);
		System.out.println(st);
		
		

	}
	private static void InsertDown(Stack <Integer> st, int i) {
		if(st.isEmpty() ){  //lifo
			st.push(i);
			return;
			
		}
		int item=st.pop();
		InsertDown(st, i);
		st.push(item);
		
	}

}
