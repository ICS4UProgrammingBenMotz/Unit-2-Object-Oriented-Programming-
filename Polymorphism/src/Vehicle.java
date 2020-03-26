/*
 * Created by: Ben Motz
 * Created on: March 26, 2020
 * Created for: ICS4U
 * Day #20 (Vehicle Class)
 * This program uses polymorphism between multiple classes
 */
import java.util.Scanner;

public class Vehicle {

    public static String platenumb;
    public static String colour;
    public static int numbofdoors;
    public static int maxspeed;
    public static  int speed;
    //calc the speed
    public int EnteredSpeed() {return speed;}

    //calcs the max speed
    public int EnteredMaxSpeed() {
        return maxspeed;
    }

    Vehicle (String plate, String vehiclecol, int doors, int maximumspeed, int curspeed){
        platenumb=plate;

        colour=vehiclecol;

        numbofdoors = doors;

        maxspeed= maximumspeed;

        speed= curspeed;
    }

    //will be overridden
    public void returninfo(){
        String outputinfocar="Car:"+"\nPlate Number: " + platenumb + "\n Car Colour: " + colour + "\n Doors: "+ numbofdoors + "\n Speed: " + speed + "\n Max Speed: "+ maxspeed;

        System.out.println(outputinfocar);
    }

    public static void main(String[] args) {
        Vehicle Toyota = new ToyotaTacoma("Tacoma1", "White");
        Vehicle Jeep = new Jeep("JeepFast", "Grey" );

        Scanner scanner = new Scanner(System.in);

        System.out.println("Jeep or Toyota?");

        //gets the input
        String jeeportoyota = scanner.nextLine();

        //checks what type of vehicle is chosen
        if (jeeportoyota.equals("Jeep")){
            //cars plate
            System.out.println("Plate Number: ");
            Jeep.platenumb = scanner.nextLine();

            // car's/truck's colour
            System.out.println("Vehicle Colour: ");
            Jeep.colour=scanner.nextLine();

        }
        else if (jeeportoyota.equals("Toyota")){
            //cars plate
            System.out.println("Plate Number: ");
            Toyota.platenumb = scanner.nextLine();

            // car's/truck's colour
            System.out.println("Vehicle Colour: ");
            Toyota.colour=scanner.nextLine();
        }

        //returns the info
        if (jeeportoyota.equals("Jeep")){
            Jeep.returninfo();

        }
        else if (jeeportoyota.equals("Toyota")){
            Toyota.returninfo();
        }


    }

}
