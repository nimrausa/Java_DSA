package Lec_52;
import java.util.*;
public class Genric_heap_practice{
	
	private ArrayList<Integer> list =new ArrayList<>();
	  private void add(int item) {
		  list.add(item);
		  upheapify(list.size()-1);
	  }
	  private void upheapify(int ci) {
		  int pi=(ci-1)/2;
		  if(list.get(pi)>list.get(ci)) {
			  swap(pi,ci);
			  upheapify(pi);
		  }
		  
	  }
	  private void swap (int i, int j) {
		  int ith=list.get(i);
		  int jth=list.get(j);
		  
		  list.set(i, jth);
		  list.set(j, ith);	  
	  }
	  public int getmin() {
		 return list.get(0);
	  }
	  public void Display() {
		 System.out.println(list);
	  }
	  
	  public int remove() {
		  swap(0,list.size()-1);
		  int rm=list.remove(list.size()-1);
		  downheapify(0);
		  return rm ;
	  }
	  private void downheapify(int pi) {
		  int li=2*pi+1;
		  int ri=2*pi+1;
		  int mini=pi;
		  
		  if(li<list.size()&& list.get(mini)>list.get(li)) {
			  mini=li;
		  }
		  if(ri<list.size() && list.get(mini)>list.get(ri)) {
			 mini=ri;
		  }
		  if(mini!=pi) {
			  swap(mini,pi);
			  downheapify(mini);
		  }
		  
	  }
	  
	  
	  
	  
	  
		public static void main(String[] args) {
			Heap ns=new Heap();
			ns.add(-2);
			ns.add(-10);
			ns.add(0);
			ns.add(10);
			ns.add(-80);
			ns.add(-60);
			ns.add(-100);
			ns.add(68);
			ns.add(-50);
			
			ns.Display();
			ns.remove();
			ns.Display();
		}
	  
	  }