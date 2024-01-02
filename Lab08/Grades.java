// Jordan Rios
// Dr. Hardy
// CSCI 161
// Due: 4/20/22
import java.io.*;
import java.util.*;

public class Grades {

	public static void main(String[] args) throws FileNotFoundException{
		Scanner sc = new Scanner (System.in); // scanner reads the user input
		System.out.println("Welcome to the Semester Course Grade Program"); //telling the user what to do
		System.out.print("Enter a course name (Speech or Programming or English): ");
		String searchCourse = sc.next(); //user input gets stored into searchCourse
		boolean found = false; 
		
		Scanner input = new Scanner(new File("courses.txt")); //the scanner called input reads the whole text file
		while (input.hasNextLine()) { //while there is a line this while loop keeps running
			String line = input.nextLine(); //separates each line and stores it into the string line
			Scanner lineScan = new Scanner(line); //lineScan reads each individual line
			String abriviation = lineScan.next(); //scanner sees the first string in the line 
			int courseNum = lineScan.nextInt(); //course number gets stored into courseNum
			String course = lineScan.next();
			if (course.equalsIgnoreCase(searchCourse)) { //if the user input matches the text file name this will run and will send the info to processGrades
				found = true;
				processGrades(lineScan, course, abriviation, courseNum);
			}

		}
		if (!found) {
			System.out.println(searchCourse + " was not found"); //if the info the user typed in doesn't match the text file it will print this out
		}

	}
	
	public static void processGrades (Scanner lineScan, String course, String abriviation, int courseNum) {
		double sum = 0.0;
		int count = 0; 
		while (lineScan.hasNextDouble()) {
			sum += lineScan.nextDouble(); //the while loop finds all the doubles in the line and adds them together using a cummulative sum
			count++; //count finds out how many numbers there are to add
		}
		double average = sum / count; //finds the average of the numbers
		average = (int)(average * 100) / 100.0; //rounds average
		
		System.out.println(course + " (" + abriviation + " " + courseNum + ") " + "scored a total of " + (int)sum + " points" + " (" + average + " is your average)");

	}

}
