package Lec_55;

import Lec_54.Graph;

public class Graph_2Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph_2 g=new Graph_2(7);
		g.AddEdge(1, 4, 6);
		g.AddEdge(1, 2, 10);
		g.AddEdge(2, 3, 7);
		g.AddEdge(3,4,5);
		g.AddEdge( 4, 5,1);
		g.AddEdge( 5, 6,4);
		g.AddEdge(7, 5, 2);
		g.AddEdge(6, 7, 3);
		//g.AddEdge(8, 9, 8);
		//g.display();
		System.out.println(g.BFS(1, 6));
		System.out.println(g.DFS(1, 6));
		g.BFT();
		g.DFT();
		System.out.println(g.isCycle());
		System.out.println(g.CountComponent());

}
}
