import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numNickels = scnr.nextInt();
      int numDimes = scnr.nextInt();
      int numQuarters = scnr.nextInt();
      double dollars = (numNickels * 0.05) + (numDimes * 0.1) + (numQuarters * 0.25);
      System.out.printf("Amount: $%.2f\n", dollars);
   }
}
