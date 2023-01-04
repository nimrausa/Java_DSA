package Day_35;

public class Stack {

		private int [] arr;
		private int top;
		
		public Stack() {
			arr=new int [5];
			top=-1; //no element
		}
		public Stack(int cap) {
			arr=new int [cap];
					top=-1;
		}
		public boolean isEmpty() {
			return top==-1;
		}
		public boolean isFull() {
			return top==arr.length-1;
		}
		
		public void push(int item) throws Exception {
			if(isFull()==true) {
				throw new Exception("Stack is full");
			}
			top++;
			arr[top]=item;
		}
		public int pop() throws Exception{
			if(isEmpty()==true) {
				throw new Exception("Stack id Empty");
			}
			int val=arr[top];
			top--;
			return val;
				
		}
		public int peek() throws Exception{
			if(isEmpty()==true) {
				throw new Exception("Stack id empty");
			}
			int val=arr[top];
			return val;
		}
		public void display() {
			for(int i=0 ; i<=top; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			
		}
		public int size() {
			return top+1;
			
		}
		

	

	

}
