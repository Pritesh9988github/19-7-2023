package com.pritesh.setlist;                     // Inseration order preserved

import java.util.LinkedHashSet;

public class HashSetDemo2 {

	public static void main(String[] args) {
		
        LinkedHashSet linkedhashset = new LinkedHashSet();
        
        linkedhashset.add(10);
        linkedhashset.add(20);
        linkedhashset.add("pritesh");
        linkedhashset.add(10);
        linkedhashset.add(null);
        
        System.out.println(linkedhashset);

	}

}
