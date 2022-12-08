package Lec_50;
import java.util.*;

public class HashMap <k,v> {
	public class Node{
		k key;
		v value;
		Node next;
	}
	private ArrayList<Node>bukt; //Node head pointer
	private int size=0;
	public HashMap() {   //constructor
		this(4);  //through "This" we can call constructor under constructor
		
	}
	public HashMap(int n) {
		bukt=new ArrayList<>();
		for (int i = 0; i < n; i++) {
			bukt.add(null); //if this is an arary than null is put by default
			
		}
	}
	public void put(k key, v value) {
		int idx=hashfun(key);
		Node temp=bukt.get(idx);
		while(temp !=null) {
		if(temp.key.equals(key)) {  //if A=80 than A=90
			temp.value=value;  //than the value of update to 90;
		return;
		}
		temp=temp.next;
		}
		size++;
		
		Node nn=new Node (); //if the node is not present
		nn.key=key;
		nn.value=value;
		temp=bukt.get(idx); //2k
		nn.next=temp; //add first
		bukt.set(idx, nn);
		
		double lf=(1.0 *size)/bukt.size();//load factor // 1.0*size=to get the value in double
		double thf=2.0; //threshold
		if(lf>thf) {
			rehashing();
		}
			
	}
	public void rehashing() {
		ArrayList<Node> nba=new ArrayList<>(); //new bucket array
		for(int i=0; i<2*bukt.size(); i++) {
			nba.add(null);
		}
		ArrayList <Node> oba =bukt; //old bucket array
		bukt=nba;
		for(Node temp : oba) { // for each linkedlist
			while(temp !=null) {
				put(temp.key, temp.value); //now it put the bucket will become twice so the index will come diffrent
				temp=temp.next;
			}
		}
	}
	public boolean containsKey(k key) {
		int idx=hashfun(key);
		Node temp=bukt.get(idx);
		while(temp !=null) {
			if(temp.key.equals(key)) {
				return true;
			}
			temp=temp.next;
		}
		return false;
	}
	public v get (k key) {
		int idx=hashfun(key);
		Node temp=bukt.get(idx);
		while(temp!=null) {
			if(temp.key.equals(key)) {
				return temp.value;
				
			}
			temp=temp.next;
		}
		return null;
	}
	public v remove(k key) {
		int idx=hashfun(key);
		Node curr=bukt.get(idx);
		Node prev=null;
		while(curr != null) {
			if(curr.key.equals(key)) {
				break;  //break the loop
			}
				prev=curr;
				curr=curr.next;
			}
		if(prev==null) { //if the value in first linkedliist
			bukt.set(idx, curr.next);
			curr.next=null;
			size--;
			return curr.value;	
		}
		else if(curr !=null) {
			prev.next=curr.next;
			curr.next=null;
			size--;
			return curr.value;	
		}
		else {
			return null;
		}
		}
	
	
	public int hashfun (k key) {
		int bn=key.hashCode()%bukt.size();  //index  Hashcode has a unique value for each character
		if(bn<0) {
			bn +=bukt.size();
			
		}
	 return bn;
		}
	
	public int size() {
		return size;
	}
	@Override
	public String toString() {
		String s="{";
		for(Node temp : bukt) {
			while(temp !=null) {
				s=s+temp.key + "=" + temp.value + ",";
				temp=temp.next;
			}
		}
		return s+ "}";
	}

	

}
