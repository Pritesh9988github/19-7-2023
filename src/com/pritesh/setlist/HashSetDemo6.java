package com.pritesh.setlist;

import java.util.HashSet;

public class HashSetDemo6 {

	private Object system;

	public static void main(String[] args) {
		
		HashSet hashset = new HashSet();
		
		hashset.add(10);
		hashset.add(20);
		hashset.add(30);
		hashset.add("pritesh");
		hashset.add("pune");
		
System.out.println(hashset.remove("pritesh"));
		

       HashSet hashSet1 = new HashSet();
       
       hashset.add(40);
       hashset.add(50);
       hashset.add(60);
       
       hashset.addAll(hashSet1);
      System.out.println(hashset);
}
}