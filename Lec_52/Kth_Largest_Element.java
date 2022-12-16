package Lec_52;

import java.util.PriorityQueue;
import java.util.*;

public class Kth_Largest_Element {
	public static void main(String[] args) {
		 int [] arr = {3,2,3,1,2,4,5,5,6}; 
				 int k = 4;
				 System.out.println(kthlargest(arr, k));
	
	//PriorityQueue<Integer> pq=new PriorityQueue<>(); //min heap inbuit func injava
//	PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
//		pq.add(12);
//		pq.add(9);
//		pq.add(27);
//		pq.add(90);
//		pq.add(78);
//		pq.add(53);
//		pq.add(1);
//		pq.add(5);
//		System.out.println(pq);
	}
	public static int kthlargest(int [] arr, int k) {
		PriorityQueue <Integer> pq=new PriorityQueue<>();
		for (int i = 0; i < k; i++) {
			pq.add(arr[i]);
			
		}
		//if the number that is to be  added os freater than the smallest number in the heao than we will addit
		//if the coming element is smaller than the smallest number in the heap than we will not add the element
		for(int i=k; i<arr.length; i++) {
			if(arr[i]> pq.peek()) { //for the top element 
				pq.poll();  //to remove the top element
				pq.add(arr[i]);
				
			}
		}
		return pq.peek();
		
	}
}

