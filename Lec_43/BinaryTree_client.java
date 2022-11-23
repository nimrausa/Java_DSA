package Lec_43;

public class BinaryTree_client {

	

		public static void main(String[] args)  {
			// TODO Auto-generated method stub
			BinaryTree bt = new BinaryTree();
			bt.Display();
			bt.postorder();
			bt.INorder();
			bt.preorder();
			System.out.println(bt.find(90));
			System.out.println(bt.max());
			System.out.println(bt.ht());
			
		
//10 true 20 true 40 false false true 50 false false true 30 false true 60 true  70 false false false
	
	}

}
