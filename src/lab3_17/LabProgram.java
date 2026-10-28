import java.util.Scanner;

public class LabProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String txt = input.nextLine();
		int numOfChar = (txt.length() - 5) / 2;
		System.out.println("Midfix: " + txt.substring(numOfChar, numOfChar + 5));

	}
}
