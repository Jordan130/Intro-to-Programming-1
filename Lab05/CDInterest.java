// Jordan Rios
// Dr. Hardy
// CSCI 161
// Due: 3/4/22
public class CDInterest {

	public static void main(String[] args) {

		calculate(1000, 25, 6.5, 100); //these numbers distribute to the variables amount, times, rate, and deposit

	}

	public static void calculate(double amount, int times, double rate, double deposit) {

		System.out.println("Year" + "\t" + "Interest" + "\t" + "Deposit" + "\t\t" + "New Balence");
		System.out.println("start" + "\t\t\t\t\t" + "1000.0");
		
		for (int year = 1; year <= times; year++) {  //loops everything inside scope 25 times
			
			double interest = round(amount*rate/100); //to get the interest you multiply the amount times 0.065 to get the new amount
			amount = round(amount+interest+deposit); //this code takes the new amount and adds the interest and deposit to it and prints it on each line
																				
			System.out.println(year + "\t" + interest + "\t\t" + deposit + "\t\t" + amount); //prints out each column
			
		}
	}

	public static double round (double n) { //rounds the interest and amount
		double c = (int)(n*100)/100.0;
		return c;
	}
	
}

