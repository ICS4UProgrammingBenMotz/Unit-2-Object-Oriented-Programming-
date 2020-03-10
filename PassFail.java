/*
 * Created by: Ben Motz
 * Created on: 09-03-2020
 * Created for: ICS4U Programming
 * Major Assignment
 * this program calculates the number of students that have passed a class
 */
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class PassFail {

    public static int iterations=0;

    public static  String outputfile="Output.txt";
    public static String inputfile="TeacherInfo.txt";


    public static double gradecalc(int grade, double weight ){
        double newgrade = grade * (weight/100);

        return newgrade;
    }

    public static void output(int numbofpasses, int honourroll, double highestmark, double lowestmark){
        try {
            FileWriter fileWriter = new FileWriter(outputfile);
            BufferedWriter output = new BufferedWriter(fileWriter);
            System.out.print(numbofpasses + " students passed the class. " + honourroll + " of them made honour roll. The highest mark was: "+ highestmark + "% and the lowest was: " + lowestmark + "% \n" );

            output.newLine();
            output.write( +numbofpasses + " students passed the class. " + honourroll + " of them made honour roll. The highest mark was: "+ highestmark + "% and the lowest was: " + lowestmark + "%" );
            output.close();
        }
        catch(Exception e1){
            System.exit(0);
        }
    }

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

        int numberofpasses;
        int numberhonourroll;
        double highestmark;
        double lowestmark;

        FileWriter fileWriter = new FileWriter(outputfile);
        BufferedWriter outputinfo = new BufferedWriter(fileWriter);
        Scanner reader = new Scanner(new File(inputfile));

        try {
            //reads next line
            String GradeWeights= reader.nextLine();

            //adds the weights to the list
            String[] Weights = GradeWeights.split("\\s+");

            //loops through the file
            while (GradeWeights!=null) {
                //creates variables
                numberofpasses=0;
                numberhonourroll=0;
                highestmark=0;
                lowestmark=101;

                //checks to make sure that only strings were entered
                double weightone = converttoint(Weights[0]);
                double weighttwo = converttoint(Weights[1]);
                double weightthree = converttoint(Weights[2]);
                double weightfour = converttoint(Weights[3]);

                if (weightone + weighttwo + weightthree + weightfour != 100) {
                    //error checking
                    invalid();
                }

                int intnumbofstudents = converttoint(reader.nextLine());

                for (int timesread = 0; timesread < intnumbofstudents; timesread++) {
                    //reads the file
                    String studentmarks = reader.nextLine();
                    String[] marks = studentmarks.split("\\s+");
                    int markone = converttoint(marks[0]);
                    int marktwo = converttoint(marks[1]);
                    int markthree = converttoint(marks[2]);
                    int markfour = converttoint(marks[3]);

                    double totalgrade = gradecalc(markone, weightone) + gradecalc(marktwo, weighttwo) + gradecalc(markthree, weightthree) + gradecalc(markfour, weightfour);

                    //checks if students passed the class
                    if (totalgrade>= 50){
                        numberofpasses++;
                    }
                    if (totalgrade>=80){
                        numberhonourroll++;
                    }
                    if (totalgrade>highestmark){
                        highestmark=totalgrade;
                    }
                    if (totalgrade<lowestmark){
                        lowestmark=totalgrade;
                    }
                }

                //fixes the highest and lowest mark
                highestmark=Math.floor(highestmark);
                lowestmark=Math.floor(lowestmark);

                //output(numberofpasses, numberhonourroll,highestmark,lowestmark);

                //prints out info
                System.out.print(numberofpasses + " students passed the class. " + numberhonourroll + " of them made honour roll. The highest mark was: "+ highestmark + "% and the lowest was: " + lowestmark + "% \n" );

                //outputs info
                outputinfo.write(numberofpasses + " students passed the class. " + numberhonourroll + " of them made honour roll. The highest mark was: "+ highestmark + "% and the lowest was: " + lowestmark + "%");
                outputinfo.flush();
                outputinfo.newLine();
                try {
                    Weights = GradeWeights.split("\\s+");
                    GradeWeights = reader.nextLine();
                }
                catch (Exception e1){
                    System.exit(0);
                }
            }

            //exits system
            outputinfo.close();
            System.exit(0);
        }
        catch(FileNotFoundException ex){
            invalid();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
