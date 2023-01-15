package Day_37;


public class Queue_Dequeue_Efficient {
	private Dynamic_Stack ds=new Dynamic_Stack();
	public boolean is_Empty() {
		return ds.isEmpty();	
				}
	public int size() {
		return ds.size();
	}
	public void EnQueue (int item) throws Exception {
		Dynamic_Stack hlp=new Dynamic_Stack();
		while(!ds.isEmpty()) {
			hlp.push(ds.pop());	
		}
		ds.push(item);
		while(!hlp.isEmpty()) {
			ds.push(hlp.pop());
			
		}
	}
		public int DeQueue() throws Exception{
			return ds.pop();
			
		}
		public int getFront() throws Exception{
			return ds.peek();
		}
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Queue_Dequeue_Efficient qdf=new Queue_Dequeue_Efficient();
		qdf.EnQueue(10);
		qdf.EnQueue(20);
		qdf.EnQueue(30);
		qdf.EnQueue(40);
		qdf.EnQueue(50);
		System.out.println(qdf.DeQueue());
		System.out.println(qdf.DeQueue());
		System.out.println(qdf.getFront());
		qdf.EnQueue(60);
		qdf.EnQueue(70);
		System.out.println(qdf.DeQueue());
		System.out.println(qdf.getFront());

	}

}
