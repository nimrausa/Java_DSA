package Day_19;

import java.util.ArrayList;
import java.util.Collections;

public class Array_list_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<>();
		System.out.println(list);
		System.out.println(list.size());
		//AutoBoxing  primitive data into non primitive 
		list.add(10); //10==primitive <Integer>=non-primitive 
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println(list.size());
		System.out.println(list);
		list.add(1,9);
		System.out.println(list);
		System.out.println(list.remove(3));
		
		
		//to update the value in the particular index
		list.set(0,98);
		System.out.println(list);
		
		Collections.sort(list);  //collection is the class
		System.out.println(list);
		//to reverse the array
		Collections.reverse(list);
		System.out.println(list);
		
		//to get the element
		System.out.println(list.get(4));
		
		
		//to print like array without square bracket
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
			
		}
		System.out.println();
		int [] arr=new int [3];
		for (int i : arr ) { //forward moving just read the value
			System.out.print(arr[i] + " ");
			
		}
		System.out.println();
		for(int a: list) {
			System.out.print(a + " ");
		}
		
		

	}

}
