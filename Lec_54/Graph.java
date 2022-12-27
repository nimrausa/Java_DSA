package Lec_54;
import java.util.*;

public class Graph {

	HashMap<Integer, HashMap <Integer,Integer>> map;
	public Graph(int v) {  //for each constructor put Hashmap or each neighbour
		map=new HashMap<>();
		for (int i = 0; i <=v; i++) {
			map.put(i, new HashMap<>());//making each empty HashMap
			
		}
	}
	public void AddEdge(int v1,int v2, int cost) {
		map.get(v1).put(v2, cost);  //first getting the address of the particular location and pitting the value on 
		//its neighbour
		map.get(v2).put(v1, cost);	
	}
	
	public boolean ContainsEdge(int v1, int v2){
		return map.get(v1).containsKey(v2);	
	}
	
	public boolean containsVertex(int v1) {
		return map.containsKey(v1);
	}
	
	public int numberofEdge() {
		int ans=0;
		for(int key: map.keySet()) {
			ans+=map.get(key).size(); //first getting the address than the size of each neighbour
			
		}
		return ans/2;
	}
	
	public void removeEdge(int v1, int v2) {
		if(ContainsEdge(v1,v2)) {
			map.get(v1).remove(v2);
			map.get(v2).remove(v1);
			
		}
	}
	public void removeVertex (int v1) {
		for(int nbrs: map.get(v1).keySet()) {
			map.get(nbrs).remove(v1);
		}
		map.remove(v1);
	}
	public void display() {
		for(int key: map.keySet()) {
			System.out.println(key+ " -->" + map.get(key));
			
		}
	}
	public boolean haspath(int src, int des, HashSet<Integer> visited) {
		if(src==des) {  
			return true;
		}
		visited.add(src);
		for(int key:map.get(src).keySet()) {
			if(!visited.contains(key)) {//if the key is already visited than it will nit run
				boolean ans=haspath(key,des, visited); //key=src
				if(ans) {
					return true;
				}
			}
		}
		return false;
	}
	public void Printpath(int src, int des, HashSet<Integer> visited, String ans) {
		if(src==des) {
			System.out.println(ans+src);
			return;
		}
		visited.add(src); //to enetr the value in the Hashmap which get visited as source
		for(int key: map.get(src).keySet()) {
			if(!visited.contains(key)) {
				Printpath(key,des,visited, ans+src);
			}
		}
		visited.remove(src);//to get the other path the last value get remove the recursion run at doen to get 
		//that left value
	}
	public boolean BFS(int src, int des) {
		Queue<Integer> q=new LinkedList<>(); // data structure used in Queue is BFS
		HashSet <Integer> Visited=new HashSet<>();// to put the values which come in the queue
		q.add(src);
		while(!q.isEmpty()) {
			//1 remove
			int rv=q.remove();
			//2 ignore id already visited
			if(Visited.contains(rv)) { //if this true
				continue; // it will not work down 
			}
			//3 Visited
			Visited.add(rv); //it will add on HashSet
			// 4 self work
			if(rv==des) {
				return true;
			}
			//5 To add Unvisited nbrs
			for(int nbrs:map.get(rv).keySet()){
				// to get the all neighbor which are remove
				if(!Visited.contains (nbrs)) { //if it don't come on the visited HashSet than add the ngbr
					q.add(nbrs);
				}
			}
		}
		return false;
		
	}
	
	

}
