package Lec_56;
import java.util.*;



public class Dijkstra_Algo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] [] graph = {{1,2,3},{0,2},{0,1,3},{0,2}};
		is_Bipartite(graph);

	}
	static class Pair {  //level=lv
		int vtx ,lv;
		public Pair(int vtx, int lv) {
			this.vtx=vtx;
			this.lv=lv;
		}
	}
	public static boolean is_Bipartite(int [] [] graph) {
		Queue <Pair> q=new LinkedList<>();
		HashMap<Integer, Integer> Visited=new HashMap<>();
		for(int src=0;src<graph.length ;src++ ) { //0 1 2 3 4
			if(Visited.containsKey(src)) {
				continue;
			}
		
		q.add(new Pair(src,0));
		while(!q.isEmpty()) {
			//1 remove
			Pair rv=q.remove();
			//2 ignore if already Existed
			if(Visited.containsKey(rv.vtx)) {
			//	System.out.print(Visited.containsKey(rv.vtx)+ " ");
				if(Visited.get(rv.vtx)!=rv.lv) { //for odd length
					return false;	
				}
				else {
					continue;
				}	
			}
			//3 marked visited 
			Visited.put(rv.vtx, rv.lv);
			//5 unvisited nbrs add
			for(int nbrs: graph[rv.vtx]) { //graph[rv.vtx]=index of the array
			System.out.print(nbrs+ " ");
				if(!Visited.containsKey(nbrs)) {
					q.add(new Pair(nbrs,rv.lv+1));
				}
			}
		}
		}
		return true;
		
		
		
	}

}
