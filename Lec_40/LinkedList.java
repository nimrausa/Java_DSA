package Lec_40;

public class LinkedList {
	
	
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
	//O(1)
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
	//O(1)
	public int Getfirst() throws Exception{
		if(size==0) {
			throw new Exception("Linked list is empty");
		}
		return head.val;
	}
	//O(1)
	public int Getlast() throws Exception{
		if(size==0) {
			throw new Exception("Linked list is empty");
		}
		return tail.val;
	}
	//O(N)
	public int Getindex(int k) throws Exception{
		return Getnode(k).val;
		
	}
	//O(n)
	public void addatindex(int k, int item) throws Exception {
		if(k==0) {
			addfirst(item);
		}
		else if(k==size-1) {
			addlast(item);
			
		}
		else {
			node nn=new node();  //new node with size=0 and address=null
			nn.val=item;   // the provided item come to the node
			node k_1th=Getnode(k-1);   // address of the just previous node will arrive
			nn.next=k_1th.next; //address of the previous node added to the current node
			k_1th.next=nn;   //in the previous node new coming node address will added
			size++;   //size will increase with the coming of the new node 
				
			
		}
	}
	public int removefirst() throws Exception{
		if(size==0) {
			throw new Exception("Linked list is empty");
		}
		node temp=head;  //putting first value in the temp variable
		head=head.next;  //address of 2nd node become the head address
		if(size==1) {  //if the size is 1 the tail remain in the same position
			tail=null;  //we need to make the tail null
		}
		size--;  //size get decrease since the one node is remove
		temp.next=null;   // the remove node address become null
		return temp.val;  // to know which value get remove from the node
		
	}
	public int removelast() throws Exception{
		if(size==0) {
			throw new Exception("LInked list is empty");
			
		}
		if(size==1) {
			return removefirst();
		}
		else {
			node n=Getnode(size-2);
			node temp=tail;
			tail=n;
			tail.next=null;
			size--;
			return temp.val;
		}
	}
	//O(n)
	public int removeindex(int k) throws Exception{
		if(k==0) {
			return removefirst();
		}
		if(k==size-1) {
			return removelast();
		}
		
		else {
			node curr=Getnode(k);
			node prev=Getnode(k-1);
			prev.next=curr.next;
			curr.next=null;
					size--;
					return curr.val;
			
		}
	}
	//O(1)
	public node Getnode(int k) throws Exception {
		
		if(k<=0 || k>size) {
			throw new Exception(" YOUR INDEX IS INVALID :(");	
			
		}
		node temp=head;
		for(int i=1; i<=k ; i++) {
			temp=temp.next;
			
		}
		return temp;
		
	}
	public void Display(){
		node temp=head;
		while(temp!=null) {
		System.out.print(temp.val + " ---> ");
		temp=temp.next;
		}
		System.out.println(".");
	}
	
	
		
	
}
