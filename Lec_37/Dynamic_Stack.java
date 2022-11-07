package Lec_37;
import Lec_35.Stack;



	public class Dynamic_Stack extends Stack {
		// TODO Auto-generated method stub

	
	@Override
	public void push (int item) throws Exception{
		if(this.isfull()==true)	{
			int [] newarr=new int[2*arr.length];
			for (int i = 0; i < this.arr.length; i++) {
				newarr[i]=arr[i];
				
			}
			arr=newarr ; // to change the address
			
		}
		//Stack s=new Stack(); //it is only applicable to itc class
		//s.push(item);
		super.push(item); //recursive call function calling itself stack overflow
	//if the parent and child class have the same function and if want to use the  oarent class function to the child class 
		// than user---super--

}
	}
//public -- can be access in other package.It can be access to other package without inheritance
// default --is only access to its package and also inherit but not in other package 
// protected --access in same package and also it can be inherited (client get inherit but can;t able to access)
//private---access within the class no inheritance