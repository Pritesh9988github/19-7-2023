package com.pritesh.LinkedList;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList  al = new LinkedList();
		
		al.add(10);
		al.add(20);
		al.add("pritesh");
		al.add("pune");
		al.addFirst(50);
		al.addLast(100);
		al.add(null);
		al.add(null);
		al.add(2,"patil");
		
		System.out.println(al);
	}

}
