package Lec_45;


import java.util.*;

public class Level_Order_TreeBulid {

  public class Node{
	  int val;
	  Node left;
	  Node right;
  }
  private Node root;
  
  public Level_Order_TreeBulid(){
	  this.root=createTree();
  }
  
  private Node createTree() {
	  Scanner sc=new Scanner(System.in);
	  Queue <Node> q=new LinkedList<>(); //TO build the queue
	  int item=sc.nextInt();
	  Node nn=new Node();
	  nn.val=item;
	  root=nn;
	  q.add(nn);
	  
	  while(!q.isEmpty()) {
		  Node rv=q.poll(); // to remove the element fromt he queue
		  int c1=sc.nextInt();
		  int c2=sc.nextInt();
		  if(c1!=-1) {
			  Node node=new Node();
			  node.val=c1;
			  rv.left=node;
			  q.add(node);
		  }
		  if(c2!=-1) {
			  Node node=new Node();
			  node.val=c2;
			  rv.right=node;
			  q.add(node);
		  }
		  
	  }
	  return root;
	  
  }
  
  private void Display() {
	  Display(root);
  }
  private void Display(Node node) {
	  if(node==null) {
		  return;
	  }
	  System.out.print(node.val + " ");
	  Display(node.left);
	  Display(node.right);
  }
  public static void main (String[]args) {
	  Level_Order_TreeBulid lv=new Level_Order_TreeBulid();
	  lv.Display();
//		10 20 30 40 50 -1 60 -1 -1 -1 70 80 90 -1 -1 -1 -1 -1 -1
  }

}


