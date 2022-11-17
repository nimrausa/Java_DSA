package Lec_42;

import java.util.Iterator;
import java.util.LinkedList;

public class Java_linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <Integer> list=new LinkedList<>();
		list.add(100);
		list.addLast(700);
		list.add(50); 
		list.add(40);
		list.add(30);
		list.add(20);
		list.add(10);//add last
		System.out.println(list);
		System.out.println(list.remove());//remove first
		list.addFirst(90);  //to add first
		System.out.println(list);
		list.add(2,-9); //to add at 2 index
		System.out.println(list);
		//it can to remove first , remove last , or it can remove from index
		for(int i=0 ; i<list.size(); i++) {
		  System.out.println( list.get(2));		
		}
	}
}
// we can form stack using the Linkedlist first add Last remove which become LIFO
//Fot Queue add last it will add at first point and remove first.