package Day_37;
import Day_35.Queue;

public class Dynamic_Queue extends Queue{

	public void EnQueue(int item) throws Exception{
		if(isFull()) {
			
			int [] newarr=new int[2*arr.length];
			
			for (int i = 0; i < size; i++) {
				int idx =(front+i)%arr.length;
				newarr[i]=arr[idx];
			}
				arr=newarr;
				front=0;
			}
			super.EnQueue(item);
			
		}
	public static void main(String[] args) throws Exception {
		Dynamic_Queue dq= new Dynamic_Queue();
		dq.EnQueue(10);
		dq.EnQueue(20);
		dq.EnQueue(30);
		System.out.println(dq.DeQueue());
		System.out.println(dq.DeQueue());
		dq.EnQueue(40);
		dq.EnQueue(50);
		dq.EnQueue(60);
		dq.EnQueue(70);
		dq.Display();
		dq.EnQueue(80);
		dq.DeQueue();
		
	}
	
	
	}

