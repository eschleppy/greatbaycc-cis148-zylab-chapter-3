import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      int seconds;
      int minutes;
      int hours;

      Scanner input = new Scanner(System.in);
      seconds = input.nextInt();
      minutes = seconds / 60;
      seconds = seconds % 60;
      hours = minutes / 60;
      minutes = minutes % 60;

      System.out.println("Seconds: " + seconds);
      System.out.println("Minutes: " + minutes);
      System.out.println("Hours: " + hours);


   }
}
