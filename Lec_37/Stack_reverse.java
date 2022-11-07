package Lec_37;

import java.util.Stack;

public class Stack_reverse {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Stack <Integer> st=new Stack ();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.push(60);
		System.out.println(st);
		
		reverse(st);
		System.out.println(st);

	}
	private static void reverse(Stack <Integer> st) {
		if(st.isEmpty() ){  //lifo 
			return;	
		}
		int item=st.pop();
		reverse(st);
		InsertDown(st, item);
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
