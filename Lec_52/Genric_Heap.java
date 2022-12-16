package Lec_52;

import java.util.*;

public class Genric_Heap <T extends Comparable <T> >{

	private ArrayList<T> list =new ArrayList<>();
	 public void add(T item) {
		  list.add(item);
		  upheapify(list.size()-1);
	  }
	  private void upheapify(int ci) {
		  int pi=(ci-1)/2;
		  if(large(list.get(ci), list.get(pi))>0) {    //list.get(pi)>list.get(ci)
			  swap(pi,ci);
			  upheapify(pi);
		  }
		  
	  }
	  private void swap (int i, int j) {
		  T ith=list.get(i);
		  T jth=list.get(j);
		  
		  list.set(i, jth);
		  list.set(j, ith);	  
	  }
	  public T getmin() {
		 return list.get(0);
	  }
	  public void Display() {
		 System.out.println(list);
	  }
	  
	  public T remove() {
		  swap(0,list.size()-1);
		 T rm=list.remove(list.size()-1);
		  downheapify(0);
		  return rm ;
	  }
	  private void downheapify(int pi) {
		  int li=2*pi+1;
		  int ri=2*pi+1;
		  int mini=pi;
		  
		  if(li<list.size()&& large(list.get(li),list.get(mini))>0)  {  //list.get(mini)>list.get(li)
			  mini=li;
		  }
		  if(ri<list.size() && large(list.get(ri), list.get(mini))>0) {  //list.get(mini)>list.get(ri)
			 mini=ri;
		  }
		  if(mini!=pi) {
			  swap(mini,pi);
			  downheapify(mini);
		  }
		  
	  }
	  public int large( T o1, T o2) {
		  return o1.compareTo(o2);
	  }
	  

}
