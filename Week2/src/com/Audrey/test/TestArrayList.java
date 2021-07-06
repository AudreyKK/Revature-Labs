package com.Audrey.test;

import java.util.ArrayList;
import java.util.Iterator;

import com.Audrey.model.GenericItem;

public class TestArrayList {

	public static void main(String[] args) {
		ArrayList<GenericItem> items = new ArrayList<GenericItem>();
		
		items.add(new GenericItem(1, "This is item 1"));
		items.add(new GenericItem(2, "This is item 2"));
		items.add(new GenericItem(3, "This is item 3"));
		items.add(new GenericItem(4, "This is item 4"));
		items.add(new GenericItem(5, "This is item 5"));
		
		System.out.println(items.get(2));
		
		GenericItem removed = items.remove(items.size()-1);
		System.out.println(removed);
		
		Iterator<GenericItem> iter = items.iterator();
		
		while(iter.hasNext()) {
			GenericItem item = iter.next();
			System.out.println("removing item: " + item);
			iter.remove();
			items.add(new GenericItem(6, "this is a new item"));
		}
		
		//confirm size is 0
		System.out.println(items.size());

	}

}
