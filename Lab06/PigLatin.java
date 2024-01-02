// Jordan Rios
// Dr. Hardy
// CSCI 161
// Due: 3/28/22
import java.util.*; //imports the scanner object (for user input)

public class PigLatin {

	public static void main(String[] args) {
		System.out.println("This program converts english into Pig Latin"); //these lines of code tell the user what's going on in the program
		System.out.print("Type in any word: ");
		Scanner sc = new Scanner(System.in); //allows me to use the scanner
		String userWord = sc.nextLine(); //tales what ever word the user types in and stores it into the string "userWord"
		appendWord(userWord); //calls the method and passes the "userWord" into the the parameterized method appendWord
		
	}
	
	public static void appendWord(String userWord) { //a parameterized method
		userWord = userWord.toLowerCase(); //converts the userWord into lower case
		char first = userWord.charAt(0); 
		
		if (first == 'a' || first == 'e' || first == 'i' || first == 'o' || first == 'u') {	 	/*if the first letter of the 
																								userWord starts with a vowel the program
																								prints the following output*/			 	
			System.out.println(userWord + "-way");
		} 
		else { //if the userWord does not start with a vowel the program prints this output														
			String word = userWord.substring(1, userWord.length()); //takes every letter of the word besides the first letter and stores it into "word" 
			System.out.println(word + "-" + first + "ay");
		}
		
	}
}
