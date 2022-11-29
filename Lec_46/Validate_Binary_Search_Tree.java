package Lec_46;

public class Validate_Binary_Search_Tree {

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
		 
	class BstPair{
		long max=Long.MIN_VALUE;
		long min=Long.MAX_VALUE;
		boolean isbst=true;
	}
	
	
	
	
		class Solution {
		    public boolean isValidBST(TreeNode root) {
		    	return valid(root).isbst;
		    	
		        
		    }
		    public BstPair valid(TreeNode root) {
		    	if(root==null) {
		    		return new BstPair();
		    	}
		    	BstPair lbstp=valid(root.left);  //left bst pair
		    	BstPair rbstp=valid(root.right);  ///right bst pair
		    	BstPair sbstp=new BstPair();   //self bst 
		    	
		    	sbstp.min=Math.min(root.val, Math.min(lbstp.min, rbstp.min));
		    	sbstp.max=Math.max(root.val,Math.max(rbstp.max, lbstp.max) );
		    	
		    	if(lbstp.isbst && rbstp.isbst && lbstp.max< root.val && rbstp.min > root.val ) { 
		    		sbstp.isbst=true;
		    	}
		    	else {
		    		sbstp.isbst=false;
		    	}
		    	return sbstp;
		    }
		    
		}

}
