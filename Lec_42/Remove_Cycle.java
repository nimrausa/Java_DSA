package Lec_42;

public class Remove_Cycle {

	private class Node{
		int val;
		Node Next;
		
	}
	private Node head;
	private Node tail;
	private int size;
	
	
	//o(1}
	private void addfirst(int item) {
		Node nn=new Node();
		nn.val=item;
		if(size==0) {
			this.head=nn;
			this.tail=nn;
			this.size++;
		}
		else {
			nn.Next=head;
			head=nn;
			this.size++;
		}
	}
	private void addlast(int item) {
		Node nn=new Node();
		nn.val=item;
		if(size==0) {
			addfirst(item);
		}
		else {
			tail.Next=nn;
			tail=nn;
			size++;
					
		}
	}
	public Node GetNode(int k) throws Exception{
		if(k<0 || k>=size) {
			throw new Exception("Put valid index please");
		}
		Node temp=head;
		for (int i=1 ; i<=k ; i++) {
			temp=temp.Next;
		}
		return temp;
	}

 	public void Display(){
 		Node temp=head;
 		while(temp !=null) {
 			System.out.print(temp.val + "--->");
 			temp=temp.Next;
 			
 		}
 		System.out.println(".");
 		
 	}
 	public void createcycle() throws Exception{
 		Node nn=GetNode(2);
 		this.tail.Next=nn;
 		
 	}
 	public Node hasCycle() {
 		Node slow=head;
 		Node fast=head;
 		while(fast!=null || fast.Next!=null) {
 			slow=slow.Next;
 			fast=fast.Next.Next;
 			if(slow==fast) {
 				return slow;
 			}
 			
 		}
 		return null;
 		
 	}
 	public void cycleRemoval1() {
 		Node meet=hasCycle();
 		if(meet==null) {
 			return ;
 		}
 		Node start=head;
 		
 		while(start!=null) {
 			Node temp=meet;
 		
 		while(temp.Next!=meet) {
 			if(temp.Next==start) {
 				temp.Next=null;
 				return;
 			}
 			else {
 				temp=temp.Next;
 			}
 		}
 		start=start.Next;
 	}
 	}
 	
 	public void cycleRemoval2() {
 		int count=1;
 		Node meet=hasCycle();
 		if(meet==null) {
 			return;
 		}
 		Node temp=meet;
 		while(temp.Next!=meet) {
 		temp=temp.Next;
 		count++;
 		}
 		Node fast=head;
 	for(int i=0; i<=count; i++) {
 		fast=fast.Next;
 		
 	}
 	Node slow=head;
 	while(slow.Next!=fast.Next) {
 		slow=slow.Next;
 		fast=fast.Next;
 	}
 	fast.Next=null;
 		
 		
 	}
 	public void floydCycleremoval() {
 		Node meet=hasCycle();
 		if(meet==null) {
 			return ;
 		}
 		Node slow=head;
 		Node fast=meet;
 		while(fast.Next != slow.Next) {
 			slow=slow.Next;
 			fast=fast.Next;
 		}
 		fast.Next=null;
 			
 		
 	}
 	public static void main(String[] args) throws Exception {
 		Remove_Cycle rc= new Remove_Cycle ();
 		rc.addlast(1);
 		rc.addlast(2);
 		rc.addlast(3);
 		rc.addlast(4);
 		rc.addlast(5);
 		rc.addlast(6);
 		rc.addlast(7);
 		rc.addlast(8);
 		
 		rc.createcycle();
 	//	rc.Display();
 		rc.cycleRemoval1();
 		rc.Display();
 		
 		
 		
 	}
 	
 	
 	
 	}
 		
 		
 	