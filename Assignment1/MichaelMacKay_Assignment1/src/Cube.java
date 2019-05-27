//**************************************************************************************************
// Cube.java
//
// Date: 	May 26th, 2019
// Author:	Michael MacKay T00625701
// Assignment: 1
//
// Represents a cube, which is a 3D shape.
//**************************************************************************************************

public class Cube extends Shape3D {
	private double _sideLength;
	
	public Cube(double sideLength) {
		super("Cube");
		
		_sideLength = sideLength;
	}
	
	//----------------------------------------------------------------------------------------------
	// Calculates volume of a cube.
	//		V = L * W * H
	//----------------------------------------------------------------------------------------------
	private double Volume() {
		double volume = Math.pow(_sideLength, 3);
		return volume;
	}
	
	//----------------------------------------------------------------------------------------------
	// Calculates surface area of a cube.
	//		SA = 6 * S^2
	//----------------------------------------------------------------------------------------------
	private double SurfaceArea() {
		double surfaceArea = 6f * Math.pow(_sideLength, 2);
		return surfaceArea;
	}
	
	public String toString() {
		String volume = super.formatDouble(Volume());
		String surfaceArea = super.formatDouble(SurfaceArea());
		return "\n" + super.toString() + String.format(" with a side length of %s\n"
				+ "\tVolume: %s\n"
				+ "\tSurface Area: %s", _sideLength, volume, surfaceArea);
	}
	
	
}
