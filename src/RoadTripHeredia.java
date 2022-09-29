/*name: Alejandro Heredia (Red)
date: 9/29/2022
takes input to calculate the cost of gas and electric cars for comparison
100/100 completed all requirements and even pointed out spelling mistakes in the original.
*/
import java.util.*;

public class RoadTripHeredia
{
    /* the complete main method is given do not make any channges*/
    //changes...
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        description();
        System.out.print("How many time do you want to use the app: ");
        int count = kb.nextInt();
        for(int j = 1; j <= count; j++)
        {
            gasTravel(kb);
            for(int i = 1; i <= 30; i++)
                System.out.print("&");
            System.out.println();
            electricTravel(kb);
            for(int i = 1; i <= 30; i++)
                System.out.print("&");
            System.out.println();
        }
        System.out.println("GOOD BYE");
    }
   /*This method calculates the total cost charging the battery, Stops represents 
the number of the charges*/

    public static double chargeCost(int numberOfStops, double pricePerCharge)
    {
        return numberOfStops*pricePerCharge;  // <--- must be changed
    }

    /*This method caluclates the total monet spend on the gas to travel */
    //calculates... money...
    public static double gasCost(double distance, double milesPerGallon, double
            costPerGallon)
    {
        return (distance/milesPerGallon)*costPerGallon;// <----- must be changed
    }

    /*This method caluclates the number of the stops needed to charge the battery.
     milePerCharge represents the number of the miles  driven with a fully charged
 battery*/
    //calculates... miles driven...
    public static int stops(double distance, double milePerCharge)
    {
        return (int) (distance/milePerCharge); // <-----must be changed
    }
    /*This method caluclate the hours of travel taking your gas car*/
    //calculate...
    public static double travelHoursGasCar(double distance , double speed)
    {
        return distance/speed; // <------ must be changed
    }

    /*This method calculates the hours traveling using your electric car
    stops represenst the number of the times the car needs to be charged
    hoursPerStop represents the time it takes to fully charge your car
    distance represents the total distace traveled
    speed represents the speed of the car
    */
    //represent... distance...
    public static double travelHoursWithElectricCar(int numberOfStops, double hoursPerStop,
                                                    double distance, double speed)
    {
        return (numberOfStops*hoursPerStop)+(distance/speed); //<-----must be changed
    }

    /*This method calculates the cost and the time to travel with a gas car*/
    public static void gasTravel(Scanner kb)
    {
        System.out.println("\nTraveling with a gas car\n");

        //prompt the user to enter the number of the miles to travel
        System.out.print("Enter the total number of the miles you are traveling: ");

        //declare a varibale and read the user's input
        //variable...
        double distance = kb.nextDouble();

        //1. prompt the user to enter the speed
        System.out.print("Enter the speed of your car: ");

        //2. declare a variable and read the user's input
        double speed = kb.nextDouble();

        //3. prompt the user to enter the miles per gallon
        System.out.print("Enter the miles per gallon: ");

        //4. declare a variable and read the user's input
        double milesPerGallon = kb.nextDouble();

        //5. prompt the user to enter the cost per gallon
        System.out.print("Enter the cost per gallon: ");

        //6. declare a variable and read the user's input
        double costPerGallon = kb.nextDouble();

        //7. call the method travelWithGas and pass the proper parameters
        //travelWithGas??? did you mean:
        double hours = travelHoursGasCar(distance, speed);

        //8. call the method getCost and pass the proper parameters
        //getCost??? did you mean:
        double cost = gasCost(distance, milesPerGallon, costPerGallon);

        //display the hours of travle and the cost of the travel
        //travel...
        System.out.println("\nTraveling with your gas car: ");
        //display  the result you got at step 7
        System.out.println("Hours\t"+hours);
        //display the result you got at step 8
        System.out.println("Cost\t"+cost);

    }
    public static void electricTravel(Scanner kb)
    {

        System.out.println("\nTraveling with an electric car\n");

        System.out.print("Enter the total number of the miles you are traveling: ");
        double distance = kb.nextDouble();

        //prompt the user to enter the speed
        System.out.print("Enter the speed of your car: ");

        //declare a variable to read the speed
        double speed  = kb.nextDouble();

        //prompt the user to enter the miles that can be driven with a fully charged battery
        System.out.print("Enter the number of the miles that you can travel with a fully charged \n" +
                "battery: ");

        //declare a variable and read the input
        double milePerCharge = kb.nextDouble();

        //1.prompt the user to enter the number of the hours it takes to fully chare the car battery
        //charge...
        System.out.print("Enter the number of the hours it takes to charge your car: ");
        //2.declare a variable and read the user's input
        double hoursPerStop = kb.nextDouble();

        //3.propmt the user to enter the cost per battery charge
        //prompt...
        System.out.print("Enter the amount money you need each time to fully charge the battery of \n" +
                "your car: ");

        //4.declare a variable and read the user's input
        double pricePerCharge = kb.nextDouble();

        //5.call the method stops with the proper parameters
        int numberOfStops = stops(distance, milePerCharge);

        //6.call the method travelHourWithElectric with the proper parameters
        //travelHoursWithElectric??? did you mean:
        double hours = travelHoursWithElectricCar(numberOfStops, hoursPerStop, distance, speed);

        //7.call the method  chargeCost with the proper parameters
        //method chargeCost...
        double cost = chargeCost(numberOfStops, pricePerCharge);

        System.out.println("\nTraveling with your electric car\n");

        //display the results that you got in step 6
        System.out.println("Hours of travel "+hours);

        //display the result from step 7
        System.out.println("Charge cost "+cost);

    }
    /* feel free to change the code in this method*/
    public static void description()
    {
        for(int i = 1; i <= 80; i++)
            System.out.print("&");
        System.out.println();
        System.out.println("This program calculates the cost and the time to travel to your destination ");
                System.out.println("Give the needed information for both gas car and the electric car.");
                        System.out.println("Just answer some simple questions");
        for(int i = 1; i <= 80; i++)
            System.out.print("&");
        System.out.println();


    }

}