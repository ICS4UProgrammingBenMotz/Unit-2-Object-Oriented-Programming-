public class Vehicle {
    //for plate numb
    public String PlateNumber;

    //for car colour
    public String Colour;

    //number of doors
    public int numberofdo;

    //the starting speed
    private static int Speed = 0;

    //the max speed
    private static int MaxSpeed = 0;

    //calc the speed
    public int EnteredSpeed() {return Speed;}

    //calcs the max speed
    public int EnteredMaxSpeed() {
        return MaxSpeed;
    }

    //output for car
    public String OutputInfoCar() {
        String outputinfocar="Car:"+"\nPlate Number: " + PlateNumber + "\n Car Colour: " + Colour + "\n Doors: "+ numberofdo + "\n Speed: " + Speed + "\n Max Speed: "+ MaxSpeed;

        return outputinfocar;
    }

    //output for truck
    public String OutputInfoTruck(){
        String ouputinfotruck = "Truck:"+"\nPlate Number: " + PlateNumber + "\n Truck Colour: " + Colour + "\n Doors: "+ numberofdo +"\n Number of wheels: "+ numberofwheels +"\n Length: " + lengthoftruck + "\n Speed: " + Speed + "\n Max Speed: "+ MaxSpeed;
        return ouputinfotruck;
    }

    //output for bike
    public String OutputInfoBike(){
        String outputinfobike= "Bike:"+ "\n Bike Colour: " + Colour + "\n Number of wheels: "+ numberofwheels + "\n Number of seats: " + numbofseats + "\n Speed: " + Speed + "\n Max Speed: "+ MaxSpeed;
        return outputinfobike;
    }

    //if user accelerates
    static protected void AccelerateCar() {
        //speed and maxspeed increases
        Speed += 10;
        MaxSpeed += 10;
    }
    //if users brakes
    static protected void BrakeCar() {
        if (MaxSpeed > 0) {
            Speed -= 5;
        }
    }

    //for number of wheels for the truck or bike
    public int numberofwheels;

    //for the length of the truck
    public int lengthoftruck;

    //for bik seats
    public int numbofseats;


}
