package Day_37;

import java.util.Iterator;
import java.util.Stack;

public class Push_Efficient {
	private int [] arr;
	private Dynamic_Queue dq= new Dynamic_Queue();
	public boolean isEmpty() {
	return dq.isEmpty();
	}
	public void push (int item) throws Exception{
		dq.EnQueue(item);
	}
	public int size() {
		return dq.size();
	}
	public int pop() throws Exception{
		Dynamic_Queue hlp=new Dynamic_Queue();
		while(dq.size()>1) {
		hlp.EnQueue(dq.DeQueue());
		}
		int item=dq.DeQueue();
		dq=hlp;
		return item;
		
		
	}
	public int peek() throws Exception{
		Dynamic_Queue hlp=new Dynamic_Queue();
		while(dq.size()>1) {
			hlp.EnQueue(dq.DeQueue());
		}
		int item=dq.DeQueue();
		return item;
		}
	
	
	

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Push_Efficient spf=new Push_Efficient();
		spf.push(10);
		spf.push(20);
		spf.push(40);
		spf.push(50);
		spf.push(60);
		
		System.out.println(spf.pop());
		System.out.println(spf.pop());
		System.out.println(spf.peek());
		
		
		
		
		
	}
	
		
	}


