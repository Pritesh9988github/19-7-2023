package com.pritesh.LinkedList;

import java.util.AbstractSequentialList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo2 {

	public static void main(String[] args) {
		
		LinkedList <Integer> linkedlist = new LinkedList <Integer> ();
		
		linkedlist.add(10);
		linkedlist.add(20);
		linkedlist.add(30);
		linkedlist.add(50);
		linkedlist.add(60);
		linkedlist.addFirst(70);
		linkedlist.addLast(100);
		
		for(int t:linkedlist){
			System.out.println(t);
		
	   
		}
		

	}

}
