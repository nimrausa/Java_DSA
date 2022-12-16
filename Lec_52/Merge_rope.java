package Lec_52;
import java.util.*;

public class Merge_rope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {2,2,3,3,4};
		System.out.println(mincost(arr));

	}
	public static int mincost(int [] arr) {
		
		PriorityQueue <Integer> pq=new PriorityQueue <>();
		for (int i = 0; i < arr.length; i++) {
			pq.add(arr[i]); //nlogn to add all the element in the queue
		}
		int ans=0;
		while(pq.size()>1) {
			int a=pq.poll();
			int b=pq.poll();
			ans+=a+b;
			pq.add(a+b);
			}
		
		return ans;
		
	}
	
	}
