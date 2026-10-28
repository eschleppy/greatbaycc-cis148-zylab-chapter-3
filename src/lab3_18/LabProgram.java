import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      int seconds;
      int minutes;
      int hours;

      Scanner input = new Scanner(System.in);
      seconds = input.nextInt();
      minutes = input.nextInt();
      hours = input.nextInt();
      System.out.println(((hours * 60 + minutes) * 60 + seconds) + " seconds");


   }
}
