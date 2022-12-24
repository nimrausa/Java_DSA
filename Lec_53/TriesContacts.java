package Lec_53;

import java.util.HashMap;

import java.util.*;

public class TriesContacts {

	private class Node {
		char data;
		HashMap<Character,Node> Children=new HashMap<>();
		boolean isterminal=false;
		int count;
		
	}
	private Node root;
	public TriesContacts() {
		Node nn=new Node();  //to create new node
		nn.data='*';
		this.root=nn;
		
	}
	public void insert(String word) {
		Node node=root;
		for (int i = 0; i < word.length(); i++) {
			char ch=word.charAt(i);
			if(node.Children.containsKey(ch)) {
				node=node.Children.get(ch);
				node.count++;
			}
			else {
				Node nn=new Node();
				nn.data=ch;
				node.Children.put(ch, nn);
				node=nn;
				node.count=1;
			}
			
			
		}
		node.isterminal=true;
	}
	public boolean Search(String word) {
		Node node=root;
		for (int i = 0; i < word.length(); i++) {
			char ch=word.charAt(i);
			if(node.Children.containsKey(ch)) {
				node=node.Children.get(ch);
			}
		
			else {
				return false;
			}
			
		}
		return node.isterminal;
	}
	 public int countstartsWith(String prefix) {
		 Node node=root;
		 for (int i = 0; i < prefix.length(); i++) {
			 char ch=prefix.charAt(i);
			 if(node.Children.containsKey(ch)){
				 node=node.Children.get(ch);
				 
			 }
			 else {
				 return 0;
			 }
			
		}
		 return node.count;
		
	}
	 

}

