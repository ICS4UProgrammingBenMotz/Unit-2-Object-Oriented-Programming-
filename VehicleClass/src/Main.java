/*
 * Created by: Ben Motz
 * Created on: March 14, 2020
 * Created for: ICS4U
 * Day #20 (Vehicle Class)
 * This program uses another class to create a vehicle
 */
import java.util.*;
public class Main {

    static Scanner scanner = new Scanner(System.in);

    static Vehicle vehicleclass = new Vehicle();

    public static void main(String[] args) {
        //cars plate
        System.out.println("Plate Number: ");
        vehicleclass.PlateNumber = scanner.nextLine();

        // cars colour
        System.out.println("Car's Colour: ");
        vehicleclass.Colour=scanner.nextLine();

        System.out.println("Number of Doors: ");
        vehicleclass.numberofdo=Integer.parseInt(scanner.nextLine());

        for (int counter = 0; counter < 10; counter++ ) {
            //prints stuff
            System.out.println("Accelerate (A) or Brake (B)?");

            //reads line
            String AccelOrBreak = scanner.nextLine();

            //changes to upper case
            AccelOrBreak.toUpperCase();

            //checks if the car speeds up or breaks
            if(AccelOrBreak.equals("A")) {
                Vehicle.AccelerateCar();
            }
            else if (AccelOrBreak.equals("B")) {
                Vehicle.BrakeCar();
            }
        }

        //outputs info
        String outputstuff = vehicleclass.OuputInfo();

        System.out.print(outputstuff);
    }
}
