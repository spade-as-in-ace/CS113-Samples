import java.util.Scanner;

public class DistanceCalculator {

	/*
	 * d = sqrt((x2-x1)^2 + (y2-y1)^2 + (z2 - z1)^2)
	 */
	public static double distance(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double x1, y1, x2, y2;
		System.out.println("Please enter x and y values of first point:");
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		System.out.println("Please enter x and y values of second point:");
		x2 = input.nextDouble();
		y2 = input.nextDouble();

		System.out.println(distance(x1, y1, x2, y2));
		
		double d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		System.out.println(d);

		input.close();
	}

}
