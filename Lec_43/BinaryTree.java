package Lec_43;

import java.util.Scanner;

public class BinaryTree {
	
	public class Node{
		int data;
		Node right;
		Node left;
		public boolean item;
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
			s=nn.left.data + s;  //nn.left==address and nn.left.data= data like 20
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
		
		public void postorder() {
			postorder(root);
			System.out.println();
			
		}
		private void postorder (Node nn) {
			if(nn==null) {
				return;
			}
			postorder(nn.left);
			postorder(nn.right);
			System.out.print(nn.data + " ");
		}
		public void INorder() {
			INorder(root);
			System.out.println();
			
		}
		private void INorder (Node nn) {
			if(nn==null) {
				return;
			}
			INorder(nn.left);
			System.out.print(nn.data + " ");
			INorder(nn.right);
			
		}
		public void preorder() {
			preorder(root);
			System.out.println();
			
		}
		private void preorder(Node nn) {
			if(nn==null) {
				return;
			}
			System.out.print(nn.data + " ");
			preorder(nn.left);
			
			preorder(nn.right);
		}
		
		public boolean find(int item) {
			return find(root,item);
			
		}
		public boolean find(Node nn, int item) {
			if(nn==null) {
				return false;
			}
			
			if(nn.data==item) {
				return true;
			}
			boolean lf=find(nn.left,item);
			boolean rf=find(nn.right,item);
			return lf|| rf;
			
		}
		public int max() {
			return max(this.root);
		}
		private int max(Node node) {
			if(node==null) {
				return Integer.MIN_VALUE;  //f the value is null than it will gives the value minimum  
			}
			
			int left=max(node.left);
			int right=max(node.right);
			return Math.max(node.data,Math.max(left, right));
		}
		public int ht() {
			return ht(this.root);
		}
		private int ht(Node node) {
			if(node==null) {
				return -1;
			}
			int left=ht(node.left);
			int right=ht(node.right);
			return Math.max(left,  right)+1;
			
			
		}
}
		
	


