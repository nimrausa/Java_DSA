package Day_37;
import Day_35.Stack;

public class Dynamic_Stack extends Stack {

	@Override
	public void push(int item) throws Exception{
		if(this.isFull()==true) {
			int [] newarr=new int [2*arr.length];
			for (int i = 0; i < super.arr.length; i++) {
				newarr[i]=arr[i];	
			}
			arr=newarr;
		}
		super.push(item); //to use push in child class that is coming from parent class
	}

	
}
