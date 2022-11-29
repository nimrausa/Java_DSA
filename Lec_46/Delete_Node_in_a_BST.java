package Lec_46;

public class Delete_Node_in_a_BST {

	public class TreeNode {
		     int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode() {}
		      TreeNode(int val) { this.val = val; }
		      TreeNode(int val, TreeNode left, TreeNode right) {
		          this.val = val;
		          this.left = left;
		          this.right = right;
		      }
		  }
		 
		class Solution {
		    public TreeNode deleteNode(TreeNode root, int key) {
		    	if(root==null) {
		    		return null;
		    	}
		    	if(root.val >key) { //if the value that should be deleted is small than the root value
		    		root.left=deleteNode(root.left, key);
		    	}
		    	else if(root.val <key) { //if the value that should be deleted is greater than the root value
		    		root.right=deleteNode(root.right, key);
		    	}
		        
		    else{ //root.val==key
		    	if(root.left==null) {
		    		return root.right;
		    	}
		    	else if(root.right==null) {
		    		return root.left;
		    	}
		    	else {
		    		int max=max(root.left);  //to calculate the address of 5k it will return to maximum value
		    		root.val=max;  //the value deleted 8 and it replace by 7
		    		root.left=deleteNode(root.left, max); //it will form other binary tree than it find 7 from that binary tree
		    		//to delete it
		    	}
		    }
		    	return root;
		    }
		    public int max(TreeNode node) { //to find the maximum value
		    	if(node==null) {  
		    		return Integer.MIN_VALUE;//to male null value ==min value of the integer
		    		
		    	}
		    	int right=max(node.right); //since the max value find in the right side value
		    	return Math.max(right, node.val);
		    }
		}
}
