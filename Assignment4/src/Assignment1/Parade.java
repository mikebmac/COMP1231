//**************************************************************************************************
// Parade.java
//
// Date: 	July 23th, 2019
// Author:	Michael MacKay T00625701
// Assignment: 4
//
// Creates an ArrayList to store Clowns for a parade.
//**************************************************************************************************
package Assignment1;

import java.util.ArrayList;

public class Parade {
	ArrayList<Clown> clowns;
	
	public Parade(String[] names) {
		clowns = new ArrayList<Clown>();
		for (String name : names) {
			Clown clown = new Clown(name);
			this.addClown(clown);
		}
	}
	
	public void addClown(Clown clown) {
		this.clowns.add(clown);
	}
	
	public void addClown(String name) {
		Clown clown = new Clown(name);
		this.clowns.add(clown);
	}
	
	public void removeClown() {
		this.clowns.remove(0);
	}
	
	public String toString() {
		String r = new String("\tParade Positions:\n\t==================");
		for (int i = 0; i < this.clowns.size(); i++) {
			r = r.concat("\n\t" + (i + 1) + ": " + this.clowns.get(i).getName());
		}
		return r;
	}

}
