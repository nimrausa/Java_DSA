package Lec_41;

public class Reverse_Linked_List {

	class ListNode{
		int val;
		ListNode next;
	
	ListNode(int x) {
		val=x;
		next=null;
	}
	class solution{
		public ListNode Reverse_Linked_List(ListNode head) {
			ListNode curr=head;
			ListNode prev=null;
			while(curr!=null) {
				ListNode ahead=curr.next;
				curr.next=prev;
				prev=curr;
				curr=ahead;
			}
			
			return prev;
			
		}
	}
	
		
		
	}

}
