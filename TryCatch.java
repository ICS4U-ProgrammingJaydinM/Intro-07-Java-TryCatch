/**
 * The MathOperators program can do addition, subtraction, multiplication, division, exponents and
 * square root.
 *
 * @author Jaydin Madore
 * @version 1.0
 * @since 2023-02-21
 */
import java.util.Scanner;

public final class TryCatch {

  public static void main(String[] args) {

    try {
      Scanner input = new Scanner(System.in);

      System.out.println(" Enter the radius of a sphere that is positive and is not 0:");
      // Gets the users input
      float radius = input.nextFloat();
      // Checks if the user input is less than or = to 0.
      if (radius <= 0) {
        // If it is less than or to 0 it tells the user and than end the program.
        System.out.println("You can not enter zero or a negative number");
      }
      // Else it does the math to find the volume of a sphere.
      else {
        final Double firstCal = (4.0f / 3.0f) * Math.PI;
        final Double Volume = firstCal * Math.pow(radius, 3);
        // Turns the Volume to 3 decimal places.
        double VolumeRounded = Math.round(Volume * 100) / 100.000;
        // It tells the user the Volume.
        System.out.println("Your Volume is: " + VolumeRounded + " cm^3");
      }
    } catch (Exception e) {
      //error checks for letters 
      System.out.println("ERROR " + e.getMessage());
    }
  }
}
