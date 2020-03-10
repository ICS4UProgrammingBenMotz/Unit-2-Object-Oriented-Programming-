/*
 * Created by: Ben Motz
 * Created on: 09-03-2020
 * Created for: ICS4U Programming
 * Major Assignment
 * this program calculates the time on mars
 */
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class MarsTime {
    public static  String outputfile="MarsTime.txt";
    public static String inputfile="EarthTime.txt";
    public static double earthtomarsfactor=0.97469959;


//error checking
    public static void invalid () {
        try {
            PrintWriter output = new PrintWriter(outputfile);

            output.println("Please only enter valid information");

            output.close();

            System.exit(0);
        }
        catch(Exception e1){
            System.exit(0);
        }
    }

    //converts to int
    public static int converttoint(String inputnumber){
        try {
            int converted = Integer.parseInt(inputnumber);
            return converted;
        }
        catch(Exception e){
            invalid();
            return 0;
        }
    }

    public static void main(String[] args) throws IOException {
        double marsyears;
        String EarthTime;
        String[] lstEarthTimes;
        FileWriter fileWriter = new FileWriter(outputfile);
        BufferedWriter output = new BufferedWriter(fileWriter);

        try {
            lstEarthTimes = null;
            //creates new scanner
            Scanner reader = new Scanner(new File(inputfile));
            //reads next line
            EarthTime = reader.nextLine();

            //adds the weights to the list
            lstEarthTimes = EarthTime.split("\\s+");

            //loops through the file
            while (EarthTime != null) {
                if (lstEarthTimes.length != 3) {
                    invalid();
                }
                else {
                    //calculates all the information
                    marsyears = 0;

                    double earthtotalsecs = (((((converttoint(lstEarthTimes[0]) - 1) * 24) + converttoint(lstEarthTimes[1])) * 60) + converttoint(lstEarthTimes[2])) * 60;

                    double marstotalsecs = earthtotalsecs * earthtomarsfactor;

                    double marsdays = Math.floor((((marstotalsecs / 60) / 60) / 24) + 1);

                    marsdays = Math.round(marsdays);

                    double marshours = Math.floor(((marstotalsecs / 60) / 60) % 24);

                    double marsmins = Math.floor((marstotalsecs / 60) % 60);

                    double marssecs = Math.round(marstotalsecs % 60);

                    if (marsdays > 668) {
                        marsyears = Math.floor(marsdays / 668);

                        marsdays = marsdays - (marsyears * 668);
                    } else {
                        marsyears = 0;
                    }


                    //outputs information
                    try {
                        output.write("Years: " + marsyears + " Days: " + marsdays + " Hours: " + marshours + " Minutes: " + marsmins + " Seconds: " + marssecs);
                        System.out.print("Years: " + marsyears + " Days: " + marsdays + " Hours: " + marshours + " Minutes: " + marsmins + " Seconds: " + marssecs + "\n");
                        output.flush();
                        output.newLine();

                    } catch (Exception e1) {
                        System.exit(0);
                    }
                    try {
                        EarthTime = reader.nextLine();
                        lstEarthTimes = EarthTime.split("\\s+");
                    } catch (Exception e1) {
                        System.exit(0);
                    }

                }
            }
            //closes writer
            output.close();
        }
        catch(FileNotFoundException ex){
            invalid();
        }
    }
}