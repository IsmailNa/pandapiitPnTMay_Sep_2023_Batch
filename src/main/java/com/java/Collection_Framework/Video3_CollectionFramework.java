package com.java.Collection_Framework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Video3_CollectionFramework {

	public static void main(String[] args) {
		//Collection is a single entity or an object in which we can store multiple data
		//Framework - Represents the Library
		
		//Collection framework - is pre-defined set of Interfaces, Classes and Methods
		
		//There are 2 packages which contain the whole framework
		//java.util.Collection - we can store the data directly
		
		//java.util.Map  - we store data in key value pair
		
		ArrayList al = new ArrayList();
		
		al.add(10);
		al.add("Java");
		al.add('z');
		
		HashSet hs = new HashSet();
		hs.add("Python");
		hs.add(true);
		hs.add(20);
		
		HashMap hm = new HashMap();
		hm.put(101, "Java");
		hm.put(102, "Python");
		hm.put(103, "C#");
		

	}

}
