package com.pritesh.setlist;                          //Duplicated are not Allow

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet hashset = new HashSet();
		
		hashset.add(10);
		hashset.add(20);
		hashset.add("pritesh");
		hashset.add(null);
		hashset.add(10);
		
		System.out.println(hashset);
		

	}

}
