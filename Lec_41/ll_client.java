package Lec_41;

import java.util.Scanner;

import Lec_40.LinkedList;

public class ll_client {

	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		Input_of_Linked_list ll=new Input_of_Linked_list();
		for (int i = 0; i < 5; i++) {
			ll.addlast(sc.nextInt());
			
		}
		
		System.out.println(ll.middleNode());

	}
}
