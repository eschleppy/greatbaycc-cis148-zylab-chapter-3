import java.util.Scanner;

public class LabProgram {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double s = (a + b + c) / 2.0;
		double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
		System.out.printf("Triangle area = %.2f\n", area);
	}
}
