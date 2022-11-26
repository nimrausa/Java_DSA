package Lec_45;

public class diameter_of_binary_tree {

	
		// TODO Auto-generated method stub
		 public class TreeNode {
			     int val;
			     TreeNode left;
			      TreeNode right;
			      TreeNode() {
			    	  
			      }
			      TreeNode(int val) { this.val = val; }
			      TreeNode(int val, TreeNode left, TreeNode right) {
			          this.val = val;
			          this.left = left;
			          this.right = right;
			      }
			  }
	
	public class dia_pair{
		int ht=-1;
		int d=0;
		
	}
	class solution{
		public int diameter_of_binary_tree(TreeNode root) {
			return diameter (root).d;
		}
		public dia_pair diameter(TreeNode root) { //return address
			if(root==null) {
				return new dia_pair();
			}
			dia_pair ldp=diameter(root.left);  //left diameter pair
			dia_pair rdp=diameter(root.right);  //right diameter pair
			 
			 dia_pair sdp=new dia_pair(); //it will create pair which is empty for each node
			 sdp.ht=Math.max(ldp.ht,rdp.ht)+1; //for height the leaf will return to -1
			 int d=ldp.ht +rdp.ht+2; //to pass the diameter from itself
			 sdp.d=Math.max(d,(Math.max(ldp.d, rdp.d))) ;
			 return sdp;
			 
		}
	}
	   
}

	
	


