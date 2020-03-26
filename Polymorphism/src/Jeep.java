public class Jeep extends Vehicle {
    String maxdepthinwater;

    String offroadability;


    @Override
    //outputs something else
    public void returninfo() {
        String outputinfo ="Jeep:"+"\nPlate Number: " + platenumb + "\nCar Colour: " + colour + "\nDoors: "+ numbofdoors + "\nMax depth in water: "+ maxdepthinwater+ "\nOff road ability: "+ offroadability + "\nSpeed: " + speed + "\nMax Speed: "+ maxspeed;
        System.out.println(outputinfo);
    }

    Jeep(String platnumb, String vehiclecol){
        //gets the plate and colour but sets the number of doors and the max and current speed
        super (platnumb, vehiclecol, 4,85, 210);

        //extra info
        maxdepthinwater= "2 meters";

        offroadability= "Extremely good";
    }
}
