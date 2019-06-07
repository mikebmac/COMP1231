//**************************************************************************************************
// Driver.java
//
// Date: 	June 1st, 2019
// Author:	Michael MacKay T00625701
// Assignment: 2
//
// Driver class
//**************************************************************************************************
import java.util.Arrays;

public class Driver {
	public static void main(String[] args) {
		Task[] task = new Task[10];
		
		task[0] = new Task("Pay Bills", Priority.scale.HIGH);
		task[1] = new Task("Wash Dishes", Priority.scale.LOW);
		task[2] = new Task("Visit Parents", Priority.scale.MEDIUM);
		task[3] = new Task("Sleep", Priority.scale.LOW);
		task[4] = new Task("Mow Lawn", Priority.scale.MEDIUM);
		task[5] = new Task("Get Food", Priority.scale.LOW);
		task[6] = new Task("Complete Report Cards", Priority.scale.MEDIUM);
		task[7] = new Task("Mark Tests", Priority.scale.MEDIUM);
		task[8] = new Task("Drink Coffee", Priority.scale.HIGH);
		task[9] = new Task("Be Social", Priority.scale.LOW);
		
		System.out.println("Before Sorting: ");
		for (int i = 0; i < task.length; i++) 
			System.out.println("\t" + task[i].toString());
		
		Arrays.sort(task);
		
		System.out.println("\nAfter Sorting: ");
		for (int i = 0; i < task.length; i++) 
			System.out.println("\t" + task[i].toString());
		
		System.out.println("\nLow Priority: ");
		for (int i = 0; i < task.length; i++) {
			if (task[i].getPriority() == Priority.scale.LOW)
				System.out.println("\t" + task[i].toString());
		}
		
		System.out.println("\nMedium Priority: ");
		for (int i = 0; i < task.length; i++) {
			if (task[i].getPriority() == Priority.scale.MEDIUM)
				System.out.println("\t" + task[i].toString());
		}
		
		System.out.println("\nHigh Priority: ");
		for (int i = 0; i < task.length; i++) {
			if (task[i].getPriority() == Priority.scale.HIGH)
				System.out.println("\t" + task[i].toString());
		}
		
	}

}
