package com.pritesh.setlist;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo4 {

	public static void main(String[] args) {
		
		HashSet <Integer> hashset = new HashSet <Integer> ();
		
		hashset.add(10);
		hashset.add(20);
		hashset.add(30);
		
		//System.out.println(hashset);
		
       //for(int A :hashset) {     //For each loop
      //System.out.println(A);
		
		 
		 Iterator<Integer> itr = hashset.iterator();
		   while (itr.hasNext()) {
			   System.out.println(itr.next());        
			  
	}

  }
	
}
