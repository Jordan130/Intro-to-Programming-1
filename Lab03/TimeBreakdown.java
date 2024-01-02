// Jordan Rios
// Dr. Hardy
// CSCI 161
// Due: 2/15/22
public class TimeBreakdown {

	public static void main(String[] args) {

		int time = 2693793;
		int days = time / 86400; // divides the time (seconds) by the number of seconds in a day
		int hours = (time % 86400) / 3600; // takes the mod of days and divides by 3600 seconds
		int minutes = (((time % 86400) % 3600) / 60); // takes the mod of hours leftover and divides by 60 seconds
		int seconds = ((((time % 86400) % 3600) % 60) / 1); // takes the mod of minutes and divides by 1 second

		System.out.println("The time of " + time + " seconds is equivalent too");
		System.out.println("Days: " + days);
		System.out.println("Hours: " + hours); // All of this code concatenates a string with the each variable
		System.out.println("Minutes: " + minutes);
		System.out.println("Seconds: " + seconds);

	}

}
