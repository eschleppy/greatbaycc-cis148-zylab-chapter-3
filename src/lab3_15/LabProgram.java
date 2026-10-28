import java.util.Scanner;

public class LabProgram {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String txt = input.nextLine();
		System.out.println("Prefix: " + txt.substring(0, 5));
	}
}