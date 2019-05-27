//**************************************************************************************************
// Shape3D.java
//
// Date: 	May 26th, 2019
// Author:	Michael MacKay T00625701
// Assignment: 1
//
// Represents a 3D shape. Used as a parent of a derived class to create a variety of 
// three dimensional shapes.
//**************************************************************************************************
import java.text.DecimalFormat;

public class Shape3D {
	
	protected String _name;
	
	public Shape3D(String name) {
		_name = name;
	}
	
	public String toString() {
		return _name;
	}
	
	//----------------------------------------------------------------------------------------------
	// Used to format the toString method
	//
	// Returns a formatted string of a double (2 places)
	//
	// I added it to the parent class because it was used in all they child classes.
	//----------------------------------------------------------------------------------------------
	protected String formatDouble(double n) {
		DecimalFormat numberFormat = new DecimalFormat("#.00");
		return numberFormat.format(n);
	}
}
