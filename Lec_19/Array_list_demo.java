package Lec_19;

import java.util.ArrayList;
import java.util.Collections;

public class Array_list_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ArrayList<Integer> a=new ArrayList<>();
			System.out.println(a);
			System.out.println(a.size());
			//element asd kasia hoga
			a.add(10);
			a.add(29);
			a.add(30);
			System.out.println(a);
			a.add(1,-5);
			a.add(0,8);
			System.out.println(a);
			//remove
			System.out.println(a.remove(2));
			System.out.println(a);
			// to replace value
			a.set(2, -7);
			System.out.println(a);
			Collections.sort(a);
			System.out.println(a);
			Collections.reverse(a);
			System.out.println(a);
			// element get krna hai
			System.out.println(a.get(2));
			for (int i = 0; i < a.size(); i++) {
				System.out.print(a.get(i) + " ");
				
			}
			int [] arr =new int [3];
			for (int v:arr) {    //forward loop , no reverse--no connection with index just moving forward
				System.out.println(v+ " ");
			}
			System.out.println();
			for(int v:a) {  ///this loop only use for print
				System.out.print(v+ " ");
			}
	}	

}
