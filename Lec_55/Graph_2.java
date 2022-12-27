package Lec_55;

import java.util.*;

public class Graph_2 {
	HashMap<Integer, HashMap <Integer,Integer>> map;
	public Graph_2(int v) {  //for each constructor put Hashmap or each neighbour
		map=new HashMap<>();
		for (int i = 1; i <=v; i++) {
			map.put(i, new HashMap<>());//making each empty HashMap
			
		}
	}
	public void AddEdge(int v1,int v2, int cost) {
		map.get(v1).put(v2, cost);  //first getting the address of the particular location and pitting the value on 
		//its neighbour
		map.get(v2).put(v1, cost);	
	}
	
	public boolean BFS(int src, int des) {
		int [] arr;
		arr=new int[5];
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
	public boolean DFS(int src, int des) {
		Stack<Integer> s=new Stack<>(); // data structure used in Queue is BFS
		HashSet <Integer> Visited=new HashSet<>();// to put the values which come in the queue
		s.push(src);
		while(!s.isEmpty()) {
			//1 remove
			int rv=s.pop();
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
					s.push(nbrs);
				}
			}
		}
		return false;
	}
	public void BFT() {
		Queue<Integer> q=new LinkedList<>(); // data structure used in Queue is BFS
		HashSet <Integer> Visited=new HashSet<>();// to put the values which come in the queue
		for(int src:map.keySet()) {
			if(Visited.contains(src)) {
				continue;
			}
		
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
			System.out.print(rv+ " ");
			//5 To add Unvisited nbrs
			for(int nbrs:map.get(rv).keySet()){
				// to get the all neighbor which are remove
				if(!Visited.contains (nbrs)) { //if it don't come on the visited HashSet than add the ngbr
					q.add(nbrs);
				}
			}
		}
		System.out.println();
		
	}
	
	}
	public void DFT() {
		
		Stack<Integer> s=new Stack <>();
		HashSet<Integer> visited=new HashSet<>();
		for (int src: map.keySet()) {
		if(visited.contains(src)){
			continue;	
		}
		s.push(src);
		while(!s.isEmpty()) {
			//1 remove
			int rv=s.pop();
			//2 ignore if already existed
			if(visited.contains(rv)) {
				continue;
			}
			//marked visited
			visited.add(rv);
			//4 self work
			System.out.print(rv+ " ");
			//5 To add unvisited neighbours
			for(int nbrs: map.get(rv).keySet()) {
				if(!visited.contains(nbrs)) {
					s.push(nbrs);	
				}
			}
			
		}
	}
		System.out.println();
	}
	public boolean isCycle() {
		Stack<Integer> s=new Stack <>();
		HashSet<Integer> visited=new HashSet<>();
		
		for(int src: map.keySet()) {
			if(visited.contains(src)) {
				continue;
			}
			s.push(src);
			while(!s.isEmpty()) {
				//1 remove
				int rv=s.pop();
				//2 ignore if already Existed
				if(visited.contains(rv)) {
					return true;
				}
				//3 marked visited
				visited.add(rv);
				//5 to add unvisited neighnours
				for(int nbrs:map.get(rv).keySet()) {
					if(!visited.contains(nbrs)) {
						s.push(nbrs);
					}
				}
			}
		}
		return false;
	}
	public int CountComponent() {
		Stack <Integer> s= new Stack <>();
		HashSet<Integer> visited =new HashSet<>();
		int ans=0;
		for(int src: map.keySet()) {
			if(visited.contains(src)) {
				continue;
			}
			ans++;
			s.push(src);
			while(!s.isEmpty()) {
				//1 remove
				int rv=s.pop();
				//2 ignore if Already visited
				if(visited.contains(rv)) {
					continue;
				}
				//3 marked visited
				visited.add(rv);
				//5 unvisited nbrs to add krna
				for(int nbrs : map.get(rv).keySet()) {
					if(!visited.contains(nbrs)) {
						s.push(nbrs);	
					}
				}
			}
		}
		return ans;
	}
	
}
