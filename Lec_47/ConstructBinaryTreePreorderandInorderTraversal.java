package Lec_47;

public class ConstructBinaryTreePreorderandInorderTraversal {

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
		    public TreeNode buildTree(int[] preorder, int[] inorder) {
		    	return CreateTree(inorder,0, inorder.length-1,preorder,0,preorder.length-1);
		    	
		        
		    }
		
		public TreeNode CreateTree(int [] inorder, int ilo, int ihi, int [] preorder, int plo, int phi) {
			//ilo=inorder lower // ihi=inorder highest // plo=preorder lowest // phi=preorder highest
			if(plo> phi || ilo>ihi) {
				return null;
			}
			TreeNode node=new TreeNode(preorder[plo]) ;
			int idx=Search(inorder,ilo,ihi,preorder[plo]); //preorder[plo]=item
			int net=idx-ilo ;// in inorder left subTree total count except last number
			node.left=CreateTree(inorder,ilo,idx-1,preorder,plo+1,plo+net);
			node.right=CreateTree(inorder,idx+1,ihi,preorder,plo+net+1,phi);
			return node;
			
			
		}
		public int Search(int [] inorder, int si, int ei, int item ) {
			for(int i=si; i<=ei; i++) {
				if(inorder[i]==item) {
					return i;
				}
			}
			return 0;
			
		}
}
}
