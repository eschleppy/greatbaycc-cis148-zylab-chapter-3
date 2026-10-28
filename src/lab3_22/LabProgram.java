import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      double radius = input.nextDouble();
      double height = input.nextDouble();
      double volume = Math.PI * Math.pow(radius, 2) * height;
      double area = (2 * Math.PI * radius * height) + (2 * Math.PI * Math.pow(radius, 2));
      System.out.printf("Volume (cubic inches): %.2f\n", volume);
      System.out.printf("Surface area (square inches): %.2f\n", area);

   }
}
