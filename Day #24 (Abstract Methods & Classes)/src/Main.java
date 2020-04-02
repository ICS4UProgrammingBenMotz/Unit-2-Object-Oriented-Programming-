import java.util.Scanner;

/*
 * Created by: Ben Motz
 * Created on: April 1st 2020
 * Created for: ICS4U
 * Day #24 (Abstract Methods & Classes)
 * This program uses abstract classes for the vehicle program
 */
public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //creates variables
        System.out.println("Bike or Car");
        String bikeorcar=scanner.nextLine();

        //opens the ability to call new classes
        car car =new car();
        bike bike = new bike();
        //check what the user entered
        if (bikeorcar.equals("Bike")){
            //gets all the information
            System.out.println("Bike Colour:");
            bike.colour=scanner.nextLine();
            System.out.println("Plate Number:");
            bike.licenseplate=scanner.nextLine();
            bike.numberofdoors=String.valueOf(0);
            bike.numberofwheels=String.valueOf(2);
            bike.info();

        }
        else if (bikeorcar.equals("Car")){
            //gets all the info for the car
            System.out.println("Car Colour:");
            car.colour=scanner.nextLine();
            System.out.println("Plate Number:");
            car.licenseplate=scanner.nextLine();
            System.out.println("Number of doors: ");
            car.numberofdoors= scanner.nextLine();
            System.out.println("Number of Wheels:");
            car.numberofwheels= scanner.nextLine();
            //outputs info
            car.info();
        }
        else{
            System.out.println("Please enter proper information");
        }
    }
}

class car extends Vehicle{
    @Override
    public void info() {
        //outputs all the inputted stuff
        super.info();
        String outputinfo =  "\nLicense Plate : " + licenseplate + "\nCar Colour : " + colour + "\nNumber of Doors : " + numberofdoors+"\nNumber of wheels: "+ numberofwheels;
        System.out.println(outputinfo);
    }
}

class bike extends Vehicle{
    @Override
    public void info() {
        //outputs all the inputted stuff
        super.info();
        String outputinfo =  "\nLicense Plate : " + licenseplate + "\nCar Colour : " + colour + "\nNumber of Doors : " + numberofdoors + "\nNumber of wheels: "+ numberofwheels ;
        System.out.println(outputinfo);
    }
}