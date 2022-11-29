package Lec_46;

public class Insert_into_a_Binary_Search_Tree {

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
		    public TreeNode insertIntoBST(TreeNode root, int val) {
		    	if(root==null) {
		    		return new TreeNode(val); //it will create new nod ewhere the coming va;ue should placed
		    	}
		        if(root.val>val) {
		        	root.left=insertIntoBST(root.left,val);
		        	
		        }
		        else {
		        	root.right=insertIntoBST(root.right,val);
		        }
		        return root;  //it will return to parent in each step and finally to the root
		    }
		}

}
