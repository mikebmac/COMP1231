//**************************************************************************************************
// Box.java
//
// Date: 	July 23th, 2019
// Author:	Michael MacKay T00625701
// Assignment: 4
//
// A generic type class for storing data and randomly selecting it.
//**************************************************************************************************
package Assignment2;

import java.util.ArrayList;
import java.util.Random;

public class Box<T> {
	private ArrayList<T> contents;
	
	public Box() {
		contents = new ArrayList<T>();
	}
	
	public void add(T obj) {
		contents.add(obj);
	}
	
	public boolean isEmpty() {
		if (contents.size() == 0) {
			return true;
		}
		return false;
	}
	
	public T drawItem() {
		if (isEmpty()) {
			return null;
		}
		
		Random rnd = new Random();
		int index = rnd.nextInt(this.contents.size());
		
		// Need to store the object to return so we can remove it from the ArrayList
		T rtrn = contents.get(index);
		contents.remove(index);
		
		return rtrn;
	}
	
	public String toString() {
		String r = new String("\tContents:\n\t==================");
		for (int i = 0; i < this.contents.size(); i++) {
			r = r.concat("\n\t" + (i + 1) + ": " + this.contents.get(i).toString());
		}
		return r;
	}
}
