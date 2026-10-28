import java.util.*;

public class Hypotenuse {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      double side1 = input.nextDouble();
      double side2 = input.nextDouble();
      double side3 = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
      System.out.printf("Hypotenuse: %.2f\n", side3);
   }
}
