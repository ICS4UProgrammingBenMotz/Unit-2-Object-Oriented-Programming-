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

    static Bike bikeclass = new Bike();

    static Truck truckclass = new Truck();

    public static void main(String[] args) {
        //declare variables
        String outputstuff;

        //checks what vehicle is desired
        System.out.println("Car, Truck or Bike?");

        //gets the input
        String cartruckorbike = scanner.nextLine();

        //checks what type of vehicle is chosen
    if (cartruckorbike.equals("Car") || cartruckorbike.equals("Truck")){
            //cars plate
            System.out.println("Plate Number: ");
            vehicleclass.PlateNumber = scanner.nextLine();

            // car's/truck's colour
            System.out.println("Vehicle Colour: ");
            vehicleclass.Colour=scanner.nextLine();

            System.out.println("Number of Doors: ");
            vehicleclass.numberofdo=Integer.parseInt(scanner.nextLine());

            //if the selected vehicle is  a truck
            if (cartruckorbike.equals("Truck")){
                System.out.println("Number of Wheels: ");
                truckclass.numberofwheels=Integer.parseInt(scanner.nextLine());

                System.out.println("Length: ");
                truckclass.lengthoftruck=Integer.parseInt(scanner.nextLine());
            }
        }
    //if it is a bike
    else if (cartruckorbike.equals("Bike")){
        System.out.println("Vehicle Colour: ");
        bikeclass.Colour=scanner.nextLine();


    }

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
    if (cartruckorbike.equals("Car")) {

        outputstuff = vehicleclass.OutputInfoCar();
    }
    else if (cartruckorbike.equals("Truck")){
        outputstuff = truckclass.OutputInfoTruck();
    }
    else {
        outputstuff=bikeclass.OutputInfoBike();
    }

        System.out.print(outputstuff);
    }
}
