public class ToyotaTacoma extends Vehicle {
    String maxdepthinwater;

    String offroadability;


    //overrides what was going to be displayed
    @Override

    //outputs different info
    public void returninfo() {
        String outputinfo ="Toyota Tacoma:"+"\nPlate Number: " + platenumb + "\nCar Colour: " + colour + "\nDoors: "+ numbofdoors + "\nMax depth in water: "+ maxdepthinwater+ "\nOff road ability: "+ offroadability + "\nSpeed: " + speed + "\nMax Speed: "+ maxspeed;
        System.out.println(outputinfo);
    }

    ToyotaTacoma(String platnumb, String vehiclecol){
        //gets the plate and colour but sets the number of doors and the max and current speed
        super (platnumb, vehiclecol, 2,100, 280);

        maxdepthinwater= "4 meters";

        offroadability= "Decent";
    }
}
