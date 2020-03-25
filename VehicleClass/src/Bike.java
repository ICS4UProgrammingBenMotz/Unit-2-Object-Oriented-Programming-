public class Bike extends Vehicle {
    int numberofwheels=2;

    //for bik seats
    public int numbofseats=1;

    //output for bike
    public String OutputInfoBike(){
        String outputinfobike= "Bike:"+ "\n Bike Colour: " + Colour + "\n Number of wheels: "+ numberofwheels + "\n Number of seats: " + numbofseats + "\n Speed: " + Speed + "\n Max Speed: "+ MaxSpeed;
        return outputinfobike;
    }
}
