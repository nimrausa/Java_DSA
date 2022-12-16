package Lec_52;

import java.util.ArrayList;

public class Heap {

	private ArrayList<Integer> list =new ArrayList<>();
	
		public void add (int item){
			list.add(item);    //item add in last
			upheapify(list.size()-1); //to see the last item added satisfy the priority with the help of func
	
	}
	private void upheapify (int ci) { //user only need to use public to add the item
		int pi =(ci-1)/2; //no need to handle base case if the pi=0 and ci=0 than -11>-11
		if(list.get(pi)>list.get(ci)) {  //if priority of ci is greater than pi
			swap(pi,ci);
			upheapify(pi);//the new number come in the position of the parent and it will become child
		}
	}
	private void swap(int i, int j) {
		int ith=list.get(i);
		int jth=list.get(j);
		
		list.set(i, jth); //to update the value
		list.set(j, ith); 
}

	public int getmin() {
		return list.get(0);
	
}
	public void Display() {
		System.out.println(list);
	}
	//for remove we co't remove from the first because if we do so than the shift will take place and time complexity 
	//o(n). To keep time complexity log(n( we will interchange first and last array list number than remove the lasr
	// after that we will try to fix 1st number by using downheapify
	public int remove() {
		swap(0,list.size()-1);
		int rv=list.remove(list.size()-1);
		downheapify(0);
		return rv;
	}
	private void downheapify(int pi) {
		int lci=2*pi+1;
		int rci=2*pi+1;
		int mini=pi;
		if(lci<list.size() && list.get(mini)>list.get(lci)) {
			mini=lci;
		}
		if(rci<list.size() && list.get(mini)>list.get(rci)) {
			mini=rci;
		}
		if(mini!=pi) {
			swap(mini,pi);
			downheapify(mini);
		}
		
	}
}