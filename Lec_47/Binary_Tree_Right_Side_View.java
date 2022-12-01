package Lec_47;


import java.util.*;

public class Binary_Tree_Right_Side_View {

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
			int depth=-1; //it is storing the value in heap it can not be change when it is returning back
		    public List<Integer> rightSideView(TreeNode root) {
		    	List<Integer> list=new ArrayList<>();
		    	RightView(root,list,0);
		    	return list;
		        
		    }
		    public void RightView(TreeNode root, List<Integer> list, int cr) {
		    	if(root==null) {
		    		return;
		    	}
		    	if(depth<cr) {
		    		list.add(root.val);
		    		depth=cr;
		    	}
		    
		    RightView(root.right,list,cr+1);
		    RightView(root.left,list, cr+1);
		}
}
}
