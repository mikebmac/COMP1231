//**************************************************************************************************
// Driver.java
//
// Date: 	July 23th, 2019
// Author:	Michael MacKay T00625701
// Assignment: 4
//
// A driver class
//**************************************************************************************************
package Assignment2;

public class Driver {

	public static void main(String[] args) {
		// Names
		Box<String> names = new Box<String>();
		names.add("John Doe");
		names.add("Matt Mercy");
		names.add("Mrs. Johanson");
		names.add("Wendy Murphy");
		names.add("Yuna Nio");
		
		// Numbers
		Box<Integer> positions = new Box<Integer>();
		for (int i = 1; i < 6; i++) {
			positions.add(i);
		}
		
		// Inform the User
		System.out.println("Table Positions\n===============");
		for (int j = 0; j < 5; j++) {
			System.out.println("\t" + positions.drawItem() + " | " + names.drawItem());	
		}
	}

}
