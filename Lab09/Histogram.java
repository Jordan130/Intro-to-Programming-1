// Jordan Rios
// Dr. Hardy
// CSCI 161
// Due: 5/3/22
import java.io.*;
import java.util.*;

public class Histogram {
	public static final int POINTS = 5; // constant that way you can change the curve for the test easily

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("finalScore.txt")); //the scanner called input reads the whole text file
		System.out.println("Final Exam Grade Histogram Program"); //telling the user what the program does
		int[] counter = new int[101]; //creates an array with a size of 101 
		while (input.hasNext()) { //checks each number in the file individually and if there's something in the file it gets ran through this while loop 
			int number = input.nextInt(); //if there is an integer it gets stored into the variable number
			if (number > 95) { //if the number is greater than 95 it gets saved as 100
				counter[100]++;
			} else { //any other grade it gets saved and adds 5 points to the number.
				counter[number + POINTS]++;

			}
		}
			for (int i = 0; i < counter.length; i++) {
				if (counter[i] != 0) { //if the element doesn't equal zero, it prints out the number with a colon
					System.out.print(i + ": ");
					for (int j = 0; j < counter[i];j++) { //prints the number of stars for as many times as it sees the number
						System.out.print("*");
					}
					System.out.println();
				}
			}


	}

}
