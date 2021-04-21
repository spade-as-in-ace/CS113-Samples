import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Historgram {

	static boolean generateFile = false;
	static int numInts = 30;
	static String fileLocation;

	private static void writeToFile(File file, int num) throws IOException {
		FileOutputStream out = new FileOutputStream(file);
		Random rng = new Random(342);
		out.write((num + " ").getBytes());
		for (int i = 0; i < num; i++) {
			out.write((rng.nextInt(100) + 1 + " ").getBytes());
		}
		out.close();
	}

	public static void main(String[] args) throws IOException {
		File file = new File(fileLocation);
		if (generateFile) {
			writeToFile(file, numInts);
		}

		// read file
		Scanner input = new Scanner(file);
		int size = input.nextInt();
		int[] numbers = new int[size];
		for (int i = 0; i < size && input.hasNext(); i++) {
			numbers[i] = input.nextInt();
		}
		input.close();
		
		// count occurrences
		int[] counts = new int[10];
		for (int i : numbers) {
			for (int index = 0; index < counts.length; index++) {
				int bound = index * 10 + 10;
				if (i <= bound) {
					counts[index]++;
					break;
				}
			}
		}

		// print histogram
		for (int index = 0; index < counts.length; index++) {
			int upperBound = index * 10 + 10;
			int lowerBound = upperBound - 9;
			System.out.print(lowerBound + " - " + upperBound);
			if (upperBound != 100) {
				System.out.print("\t");
			}
			System.out.print("|");
			for (int star = 0; star < counts[index]; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
