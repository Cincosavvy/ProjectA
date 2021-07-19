//imports 
import java.util.*;
import java.util.Scanner;

public class converter
 { 
     //variables
     static int mainMenu;
     static int adjMenu;

public static void main(String[] args) 
  {
     //variables
     double answer;

     //menu method prints menu options
     prMenu();

     //starting scanner for user input
     Scanner mc = new Scanner(System.in);
     //user will enter in integers after seeing menu options (numbers)
     mainMenu = mc.nextInt();

     //if statement, if the user inputs a number out of bounds
     //a print statement will appear and they will try again
     if(mainMenu > 3 || mainMenu <=0) 
       {
            //print statements
            System.out.println("Try again, input not valid");
            
            //print menu again for correct user selection
            prMenu();
            //user input for new response
            mainMenu = mc.nextInt();
       }
         
        //do while loop for menu 
        while (mainMenu != 3)
         {   
             //start switch statement
             switch (mainMenu)
              {
                case 1:
                        clearMenu();
                        adjMenu = mc.nextInt();

                        //switch for liquids
                        switch (adjMenu)
                         {
                             case 1:
                               System.out.println("How many cups would you like to convert?");
                               double cup = mc.nextDouble();
                               answer = (cup * 48);
                               //printing out the results of the converstion
                               System.out.println(cup + "Cups converted is " + answer + "teaspoons");
                               System.out.println();

                               //read menu again
                               prMenu();
                               mainMenu = mc.nextInt();
                               break;
                            case 2:
                               System.out.println("How many gallons would you like to convert?");
                               double gallon = mc.nextDouble();
                               answer = (gallon * 3.785);
                               //printing out the results of the converstion
                               System.out.println(gallon + "Gallons converted is " + answer + "liters");
                               System.out.println();

                               //read menu again
                               prMenu();
                               mainMenu = mc.nextInt();
                               break;
                            default:
                               System.out.println("Input does not exist");
                               System.out.println();
                               break;
                         }

                             break;
                case 2: 
                        ultraMenu();
                        adjMenu = mc.nextInt();

                        //switch for lengths
                        switch (adjMenu)
                         {
                             case 1:
                               System.out.println("How many miles would you like to convert?");
                               double miles = mc.nextDouble();
                               answer = (miles * 1.609344);
                               //printing out the results of the converstion
                               System.out.println(miles + "miles converted is " + answer + "kilometers");
                               System.out.println();

                               //read menu again
                               prMenu();
                               mainMenu = mc.nextInt();
                               break;
                            case 2:
                               System.out.println("How many inches would you like to convert?");
                               double inches = mc.nextDouble();
                               answer = (inches * 2.54);
                               //printing out the results of the converstion
                               System.out.println(inches + "inches converted is " + answer + "centimeters");
                               System.out.println();

                               //read menu again
                               prMenu();
                               mainMenu = mc.nextInt();
                               break;
                            default:
                               System.out.println("Input does not exist");
                               System.out.println();
                               break;
                         }

                             break;

                default:
                   break;
              }
         }

          //close scanner out
          mc.close();


  }

    //Menu methods

    //menu selection method
    public static void prMenu()
     {
         System.out.println("Your options are:");
         System.out.println("1. Volume Conversions");
         System.out.println("2. Distance Conversions");
         System.out.println("3. Quit");
     }
       public static void clearMenu() 
       {
         System.out.println("Your options are:");
         System.out.println("1. Cups to Teaspoons");
         System.out.println("2. Gallons to Liters");
         System.out.println("3. Quit");

       }

       public static void ultraMenu()
        {
         System.out.println("Your options are:");
         System.out.println("1. Miles to Kilometers");
         System.out.println("2. Inches to Centimeters");
         System.out.println("3. Quit");
        }

//end

 }