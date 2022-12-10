package Lec_51;

import java.util.*;

public class Car_client {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cars[] arr=new Cars[5];
		arr[0]=new Cars (200, 10,"white");
		arr[1]=new Cars (700, 40,"Red");
		arr[2]=new Cars (700, 1,"Green");
		arr[3]=new Cars (540, 90,"Blue");
		arr[4]=new Cars (23330, 56,"Brown");
		
//		sort(arr, new CarComparaterSpeed());
//		Display(arr);
//		System.out.println("******************");
//		sort(arr, new CarComparaterPrice());
//		Display(arr);
//		System.out.println("******************");
//		sort(arr, new CarComparaterColor());
//		Display(arr);
		
		Arrays.sort(arr, new Comparator <Cars> () {
			@Override
			public int compare (Cars o1 , Cars o2) {
				//return o1.speed-o2.speed;
				return o2.price-o1.price;
			}
		});
		Display(arr);
		
	}
	
	private static void Display(Cars[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]) ;
			
		}
	}
//		private static <T extends Comparable  <T>>void sort(T[] arr) { //T generics we need T such time it compares the value
//			//T has comparable logic
//			for (int inturn = 1; inturn < arr.length; inturn++) {
//				for (int i = 0; i < arr.length-inturn; i++) {
//					if(arr[i].compareTo(arr[i+1])> 0) {
//						T temp=arr[i];
//						arr[i]=arr[i+1];
//						arr[i+1]=temp;
//						
//					}
//					
//				}
//			}
//		}
	private static <T> void sort(T[] arr, Comparator  <T> camp) { //T generics we need T such time it compares the value
		//T has comparable logic
	for (int inturn = 1; inturn < arr.length; inturn++) {
			for (int i = 0; i < arr.length-inturn; i++) {
				if(camp.compare(arr[i],arr[i+1])>0) {
					T temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
					
				}
				
			}
		}
	}
	
}

