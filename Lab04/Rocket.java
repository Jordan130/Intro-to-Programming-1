// Jordan Rios
// Dr. Hardy
// CSCI 161
// Due: 2/22/22
public class Rocket {

	public static int LINE = 7; // This is a constant

	public static void main(String[] args) {

		drawCone();
		drawLine();
		drawHalf1();
		drawHalf2();
		drawLine(); // main method is calling all of these other methods
		drawHalf2();
		drawHalf1();
		drawLine();
		drawCone();

	}

	public static void drawCone() {
		for (int i = 1; i <= LINE*2-1; i++) { // prints out 13 lines of code
			for (int j = 1; j <= (LINE*2 - i); j++) { // prints out a space on each line and subtracts it
				System.out.print(" ");
			}
			for (int k = 1; k <= (i = i); k++) { //prints out a forward slash equal to i on each line
				System.out.print("/");
			}
			for (int g = 1; g <= 2; g++) { //prints out two stars on each line
				System.out.print("*");
			}
			for (int k = 1; k <= (i = i); k++) { //prints out a back slash equal to i on each line 
				System.out.print("\\");
			}

			System.out.println(); //prints each for loop on a different line
		}

	}

	public static void drawLine() {

		System.out.print("+"); //These plus signs surround the for loop

		for (int k = 1; k <= (LINE * 2); k++) { // the constant is 7, and 7*2 is 14, therefore this code prints "=*" 14
												// times
			System.out.print("=*");
		}

		System.out.print("+");

		System.out.println();
	}

	public static void drawHalf1() {
		for (int i = 1; i <= LINE; i++) { // printing 7 lines of code

			System.out.print("|"); //prints out this line surrounding the different for loops

			for (int j = 1; j <= (LINE - i); j++) { //prints out a dot using 7-i all the way to one 
				System.out.print(".");
			}
			for (int k = 1; k <= i; k++) { //the number of triangles is equal to the i on each line
				System.out.print("/\\");
			}
			for (int h = 1; h <= (LINE*2 - (2 * i)); h++) { //this for loop prints out a dot for each line using the pattern
				System.out.print(".");
			}
			for (int k = 1; k <= i; k++) { //the number of triangles is equal to the i on each line
				System.out.print("/\\");
			}
			for (int j = 1; j <= (LINE - i); j++) { //prints out a dot using 7-i all the way to one 
				System.out.print(".");
			}

			System.out.print("|");

			System.out.println();
		}

	}

	public static void drawHalf2() {
		for (int i = LINE; i >= 1; i--) { // printing 7 lines of code

			System.out.print("|"); //prints out this line surrounding the different for loops

			for (int j = 1; j <= (LINE - i); j++) { //prints out the constant minus the line its on
				System.out.print(".");
			}
			for (int k = 1; k <= i; k++) { //prints the triangle value for each line of code its on
				System.out.print("\\/");
			}
			for (int h = 1; h <= (LINE*2 - (2 * i)); h++) { //uses this pattern to figure out the number of dots on each line
				System.out.print(".");
			}
			for (int k = 1; k <= i; k++) { //prints the triangle value for each line of code its on
				System.out.print("\\/");
			}
			for (int j = 1; j <= (LINE - i); j++) { //prints out the constant minus the line its on
				System.out.print(".");
			}

			System.out.print("|");

			System.out.println();
		}

	}
}
