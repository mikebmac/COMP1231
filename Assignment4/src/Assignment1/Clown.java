//**************************************************************************************************
// Clown.java
//
// Date: 	July 23th, 2019
// Author:	Michael MacKay T00625701
// Assignment: 4
//
// Creates a single clown with a name;
//**************************************************************************************************
package Assignment1;

public class Clown {
	private String name;
	
	public Clown(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return this.name;
	}
}
