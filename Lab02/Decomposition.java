// Jordan Rios
// Dr. Hardy
// CSCI 161
// Due:2/1/22
public class Decomposition {

	public static void main(String[] args) {

		column();
		doubleRow();
		starX();
		System.out.println();
		System.out.println();                //main method calls to the other methods
		starX();
		doubleRow();
		column();
		doubleRow();
		System.out.println();
		System.out.println();
		doubleRow();
		starX();

	}

	public static void column() {
		System.out.println("  * ");
		System.out.println("  * ");          //column method creates a column of 3 stars
		System.out.println("  * ");
	}

	public static void doubleRow() {
		System.out.println("***** ");		 //doubleRow method creates 2 rows of 5 stars
		System.out.println("***** ");

	}

	public static void starX() {
		System.out.println(" * * ");
		System.out.println("  * ");			 //starX method creates an X of 5 stars
		System.out.println(" * * ");
	}
}
