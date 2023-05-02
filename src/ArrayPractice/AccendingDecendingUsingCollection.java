package ArrayPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;
import java.util.TreeSet;


public class AccendingDecendingUsingCollection {

	public static void main(String[] args) {
	
	
//ArrayList<Integer> list= new ArrayList<>();
	
	
//	list.add(3);
	//list.add(1);
//	list.add(6);
//	list.add(1);
//	list.add(9);
//	list.add(2);
//	Collections.sort(list);//short in accending order  
//	Collections.reverse(list);//after sorting use reverse method for decending
	
	
	
	
//System.out.println(list);
		int[] a= {2,1,4,5,6,8,3};
		
		TreeSet<Integer> set= new TreeSet<>();
		for (int i = 0; i < a.length; i++) 
		{
			set.add(a[i]);	
			
			
		}
		
		System.out.println(set);	
		
	}
	
	
	

}
