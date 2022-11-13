package Lec_40;

public class LinkedList_client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LinkedList ll=new LinkedList();
		ll.addfirst(10);
		ll.addfirst(20);
		ll.addfirst(30);
		ll.Display();
		ll.addlast(40);
		ll.Display();
		ll.addatindex(2,-9);
		ll.Display();
		ll.addfirst(300);
		ll.addfirst(200);
		ll.addfirst(205);
		ll.addfirst(307);
		ll.Display();
		System.out.println(ll.Getfirst());
		System.out.println(ll.Getlast());
		System.out.println(ll.Getindex(2));
		ll.Display();
		System.out.println(ll.removefirst());
		ll.Display();
		System.out.println(ll.removelast());
		ll.Display();
		System.out.println(ll.removeindex(2));
		ll.Display();

	}

}
