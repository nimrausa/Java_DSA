package Lec_51;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class Sort_game {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int x=sc.nextInt();
		int n=sc.nextInt();
		Employees [] arr=new Employees [n];
		for (int i = 0; i < arr.length; i++) {
			
			String s=sc.next();
			int val=sc.nextInt();
			arr[i]=new Employees(s,val);
		}
		Arrays.sort(arr, new Comparator <Employees> () {

			@Override
			public int compare(Employees o1, Employees o2) {
				// TODO Auto-generated method stub
				if(o1.Salary==o2.Salary) {
					return o1.name.compareTo(o2.name);
					
				}
				else {
					return o2.Salary -o1.Salary; //decreasing order
				}
			}
			
		});
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].Salary>=x) {
				System.out.println(arr[i]);
			}	
		}	
	}
}
class Employees{
	String name;
	int Salary;
	
public Employees (String name, int Salary) {
	this.name=name;
	this.Salary=Salary;
}

public String toString() {
	return this.name + " " + this.Salary;
}
}