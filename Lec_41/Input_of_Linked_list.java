package Lec_41;

//import java.util.Scanner;

//import Lec_40.LinkedList;


public class Input_of_Linked_list {
	private class node{              //inner class so no access the node
		int val;
		node next;
		
	}
	private node head; //to remember the address of first node of every linklist that is 1k //default=null
	private node tail; //to remember the address of last node of every linklist that is 5k  //default=null
	private int  size; //to know the total node size of the linkedlist    //default=0
	//O(1)
	public void addfirst(int item) {
		node nn=new node();   //1k
		nn.val=item;    //10
		if(size==0) {
			
			this.head=nn;   //1k
			this.tail=nn;    //1k
			this.size++;    //1
		}
		else {
			nn.next=head;    //1k
			head=nn;     //2k
			this.size++;    //2---3---4
		}
		
			
			
		}
	public void addlast(int item) {
		if(size==0) {
			addfirst(item);
		}
		else {
			node nn=new node();
			nn.val=item;
		tail.next=nn; //4k;
		tail=nn;
		size++;
		}//40
		
	}
	public int middleNode() {
		return middleNode(head).val;
	}
	
	  public node middleNode(node head) {
	    	node slow=head;
	    	node fast=head;
	    	while(fast!=null && fast.next !=null) {
	    		slow=slow.next;
	    		fast=fast.next.next;
	    		
	    	}
	    	return slow;
	        
	    }
	
/**	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		Input_of_Linked_list ll=new Input_of_Linked_list();
		for (int i = 0; i < 5; i++) {
			ll.addlast(sc.nextInt());
			
		}
		
		System.out.println(ll.middleNode());

	}
	*/

}
