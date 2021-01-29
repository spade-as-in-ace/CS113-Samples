import java.util.Scanner;

public class Chapter2Samples {

	/*
	 * Write a program that reads values representing a time duration in hours,
	 * minutes, and seconds and then prints the equivalent total number of seconds.
	 * For example, 1 hr, 28 min, and 42 s is equivalent to 5322 seconds.
	 */
	public static void printSecondsMain() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input the time to be converted into seconds");
		convertToSeconds(input.nextLine());
		input.close();
	}

	public static int convertToSeconds(String userInput) {
		String inputArray[] = userInput.split(":", 3);
		int totalSeconds = 0;
		int i = inputArray.length - 1;
		int temp;
		while (i >= 0) {
			temp = Integer.parseInt(inputArray[i]);
			// if i == 2, multiply by 60^0 (2 - i) = 0
			// if i == 1, multiply by 60^1 (2 - i) = 1
			// if i == 0, multiply by 60^2 (2 - i) = 2
			temp *= (int) Math.pow(60, 2 - i);
			totalSeconds += temp;
			i -= 1;
		}
		System.out.println(totalSeconds);
		return totalSeconds;
	}

	
	/*
	 * Create a program that reverses the above computation. Given a number of
	 * seconds, convert it into a combination of hours, minutes, and seconds.
	 */
	public static void printTimeMain() {
		Scanner input = new Scanner(System.in);
		System.out.println("Input the number of seconds to be converted");
		formatTime(input.nextInt());
		input.close();
	}
	
	public static String formatTime(int input) {
		String s = "";
		int i = 0;
		int temp;
		while (i < 3) { // while(input != 0)
			temp = input / (int) Math.pow(60, 2 - i);
			s += temp + ":";
			input -= temp * (int) Math.pow(60, 2 - i);
			i += 1;
		}
		// s = 2:53:11:
		// ^0 ^ length - 1
		// range(-5, 6) [-5, -4, ...., 4, 5]
		s = s.substring(0, s.length() - 1);
		System.out.println(s);
		return s;
	}

	public static void main(String[] args) {
		  printSecondsMain();
      printTimeMain();
	}
}
