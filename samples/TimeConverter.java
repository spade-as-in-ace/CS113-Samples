import java.util.Scanner;

public class TimeConverter {

	/*
	 * Write a program that reads values representing a time duration in hours,
	 * minutes, and seconds and then prints the equivalent total number of seconds.
	 * For example, 1 hr, 28 min, and 42 s is equivalent to 5322 seconds.
	 */
	public static int convertToSeconds(String input) {
		String inputArray[] = input.split(":");
		// ["3", "34", "25"]
		int hours, minutes, seconds;
		hours = Integer.parseInt(inputArray[0]);
		minutes = Integer.parseInt(inputArray[1]);
		seconds = Integer.parseInt(inputArray[2]);
		int totalSeconds = seconds + 60 * minutes + 3600 * hours;
		return totalSeconds;
	}

	/*
	 * Create a program that reverses the above computation. Given a number of
	 * seconds, convert it into a combination of hours, minutes, and seconds.
	 */
	public static String convertToStr(int input) {
		int hours, minutes, seconds;
		hours = input / 3600;
		input -= hours * 3600;
		minutes = input / 60;
		input -= minutes * 60;
		seconds = input;
		input -= seconds;
		if (input != 0) {
			System.out.println("error");
		}
		String output = hours + ":" + minutes + ':' + seconds;
		return output;
	}

	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		System.out.println("To convert to int, enter 1; "
				+ "To convert to string, enter 2;");
		if(user.nextLine().compareTo("1") == 0) {
			System.out.println("Please enter hh:mm:ss");
			System.out.println(convertToSeconds(user.nextLine()) + " seconds");
		} else {
			System.out.println("Please enter total seconds");
			System.out.println(convertToStr(user.nextInt()));
		}
		user.close();
	}

}
