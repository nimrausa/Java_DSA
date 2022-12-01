package Lec_47;

public class largestBstSubtreE {

	public class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(){
			
		}
		TreeNode(int val){
			this.val=val;
		}
		TreeNode(int val, TreeNode left, TreeNode roght){
			this.val=val;
			this.right=right;
			this.left=left;
		}
		public class BSTPair{
			int size=0;
			int min=Integer.MAX_VALUE;
			int max=Integer.MIN_VALUE;
			boolean isbst=true;
		}
		class Solution{
			public int largestBSTSubtree(TreeNode root) {
				return largestBSTSubtree( root);
			}
			public BSTPair largestbst(TreeNode root) {
				if(root==null) {
					return new BSTPair();
				}
				BSTPair lbstp=largestbst(root.left);
				BSTPair rbstp=largestbst(root.right);
				BSTPair sbstp=new BSTPair();
				
				sbstp.min=Math.min(root.val, Math.min(lbstp.min, rbstp.min));
				sbstp.max=Math.max(root.val, Math.max(lbstp.max, rbstp.max));
				
				if(lbstp.isbst && rbstp.isbst && lbstp.max<root.val && rbstp.min>root.val) {
					sbstp.isbst=true;
					sbstp.size=lbstp.size +rbstp.size;
					
					
				}
				else {
					sbstp.isbst=false;
					sbstp.size=Math.max(lbstp.size, rbstp.size);
					
				}
				return sbstp;
			}
		}
	}
	

}
