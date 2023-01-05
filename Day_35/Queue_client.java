package Day_35;

public class Queue_client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Queue q=new Queue();
		q.Enqueue(10);
		q.Enqueue(20);
		q.Enqueue(30);
		q.Enqueue(40);
		q.Display();
		System.out.println(q.DeQueue());
		System.out.println(q.DeQueue());
		q.Display();
		q.Enqueue(-90);
		q.Enqueue(-80);
		q.Enqueue(-100);
		q.Display();
	}

}
