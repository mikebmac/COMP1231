//**************************************************************************************************
// LibraryUnique.java
//
// Date: 	July 19th, 2019
// Author:	Michael MacKay T00625701
// Assignment: 3
//
// Driver class
//**************************************************************************************************

package question2;

import java.io.*;
import java.util.ArrayList;

public class LibraryUnique {

	public static void main(String[] args) {
		// Reading
		String inputFileString = "bookTitles.inp";
		ArrayList<String> inputBooks = new ArrayList<String>();
		String curLine = null;
		
		try {
			FileReader fileReader = new FileReader(inputFileString);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			while ( (curLine = bufferedReader.readLine()) != null) {
				inputBooks.add(curLine);
			}
			
			bufferedReader.close();
			
		} catch (FileNotFoundException ex) {
			System.out.println("File not found " + inputFileString);                
        } catch (IOException ex) {
            System.out.println("Error reading file " + inputFileString);                  
        }
		
		// Removing Duplicates
		int uniqueTitles = 0;
		int duplicates = 0;
		ArrayList<String> outputBooks = new ArrayList<String>();
		for (String book: inputBooks) {
			if (outputBooks.contains(book)) {
				duplicates++;
			} else {
				outputBooks.add(book);
				uniqueTitles++;
			}
		}
		
		// Writing
		String outputFileString = "uniqueTitles.out";
		
		try {
			FileWriter fileWriter = new FileWriter(outputFileString);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			PrintWriter outputFile = new PrintWriter(bufferedWriter);
			
			for (int i = 0; i < outputBooks.size(); i++) {
				outputFile.println(outputBooks.get(i));
			}
			
			bufferedWriter.close();
		} catch (IOException ex) {
            System.out.println("Error writing file " + outputFileString);                  
        }
		
		// User update
		System.out.println("Sorting Complete");
		System.out.println("\tUnique Titles: " + uniqueTitles);
		System.out.println("\tDuplicates Removed: " + duplicates);
		System.out.println("\tOutput File: " + outputFileString);
	}

}
