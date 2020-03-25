public class Truck extends Vehicle{
    //for number of wheels for the truck or bike
    public int numberofwheels;

    //for the length of the truck
    public int lengthoftruck;

    //output for truck
    public String OutputInfoTruck(){
        String ouputinfotruck = "Truck:"+"\nPlate Number: " + Vehicle.PlateNumber + "\n Truck Colour: " + Vehicle.Colour + "\n Doors: "+ numberofdo +"\n Number of wheels: "+ numberofwheels +"\n Length: " + lengthoftruck + "\n Speed: " + Speed + "\n Max Speed: "+ MaxSpeed;
        return ouputinfotruck;
    }
}
