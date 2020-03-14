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

    public String OuputInfo() {
        String outputinfo="Plate Number: " + PlateNumber + "\n Car Colour: " + Colour + "\n Doors: "+ numberofdo + "\n Speed: " + Speed + "\n Max Speed: "+ MaxSpeed;

        return outputinfo;
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


}
