package Lec_43;

import java.util.Scanner;

public class BinaryTree {
	
	public class Node{
		int data;
		Node right;
		Node left;
	}
	private Node root;
	Scanner sc=new Scanner(System.in);
	public BinaryTree() {
		this.root=CreateTree();
		
	}
	
	private Node CreateTree(){
		int item=sc.nextInt();
		Node n=new Node();
		n.data=item;
		boolean hlc=sc.nextBoolean();
		if(hlc==true) {
			n.left=CreateTree();
			
		}
		boolean hrc=sc.nextBoolean();
		if (hrc==true) {
			n.right=CreateTree();
		}
		return n;  //return the address of each node to connect with parent node and finally with root noode
	}
	public void Display() {
		Display(root);
	}
		private void Display(Node nn) {
			if(nn==null) {
				return;
			}
			
		String s="";
		s="<--" + nn.data + "-->";
		if(nn.left!=null) {
			s=nn.left.data + s;
		}
		else {
			s="." + s;
					
					
		}
		if(nn.right!=null) {
			s=s+ nn.right.data ;
		}
		else {
			s= s +"." ;			
		}
		System.out.println(s);
		Display(nn.left);
		Display(nn.right);
		}
		
	}


