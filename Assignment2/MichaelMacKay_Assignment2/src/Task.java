//**************************************************************************************************
// Task.java
//
// Date: 	June 1st, 2019
// Author:	Michael MacKay T00625701
// Assignment: 2
//
// Creates a Task with a specific priority, uses the priority interface.
//**************************************************************************************************
public class Task implements Priority, Comparable<Task> {
	private String description;
	private scale priority;
	
	public Task(String description, scale priority) {
		this.description = description;
		this.priority = priority;
	}
	
	public void setPriority(scale p) {
		priority = p;
	}
	
	public scale getPriority() {
		return priority;
	}
	
	//----------------------------------------------------------------------------------------------
	// Used to format the toString method, I reversed the returns for positive and negative numbers
	// because I felt that the sort method should have higher priority tasks first.
	//
	// Returns	-number : if this object is a higher priority
	//			0		: if this object and the other are the same priority
	//			+number	: if this object is a lower priority
	//----------------------------------------------------------------------------------------------
	public int compareTo(Task other) {
		return Integer.compare(other.getPriority().ordinal(), this.getPriority().ordinal());
	}
	
	//----------------------------------------------------------------------------------------------
	// Used to format the toString method
	//
	// Returns the description of the current task.
	//----------------------------------------------------------------------------------------------
	public String toString() {
		return priority.toString() + "\t | " + description;
	}
}
