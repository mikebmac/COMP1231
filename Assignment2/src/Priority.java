//**************************************************************************************************
// Priority.java
//
// Date: 	June 1st, 2019
// Author:	Michael MacKay T00625701
// Assignment: 2
//
// Interface for priority system.
//**************************************************************************************************
public interface Priority {
	public enum scale {
		LOW,
		MEDIUM,
		HIGH
	}
	public void setPriority(scale p);
	public scale getPriority();
}
