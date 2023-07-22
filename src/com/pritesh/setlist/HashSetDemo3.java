package com.pritesh.setlist;

import java.util.HashSet;

public class HashSetDemo3 {

	public static void main(String[] args) {
		
		HashSet  hashset = new HashSet();
		
		hashset.add(10);
		hashset.add(20);
		hashset.add(30);
		hashset.add(40);
		
		//System.out.println(hashset);

		for(Object p:hashset) {
			System.out.println(p);
			
		}
	}
	

}
