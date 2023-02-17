// Name: <your name>
// Class: CS 3305/ W02
// Term: Spring 2023
// Instructor:  Carla McManus
//Assignment:  3 – Part 2 Capitals
import java.util.Scanner;
import java.util.Random;
public class Main
{
    public static void main(String[] args)
    {
        String[] statesAndCapitals = {
                "Alabama, Montgomery",
                "Alaska, Juneau",
                "Arizona, Phoenix",
                "Arkansas, Little Rock",
                "California, Sacramento",
                "Colorado, Denver",
                "Connecticut, Hartford",
                "Delaware, Dover",
                "Florida, Tallahassee",
                "Georgia, Atlanta",
                "Hawaii, Honolulu",
                "Idaho, Boise",
                "Illinois, Springfield",
                "Indiana, Indianapolis",
                "Iowa, Des Moines",
                "Kansas, Topeka",
                "Kentucky, Frankfort",
                "Louisiana, Baton Rouge",
                "Maine, Augusta",
                "Maryland, Annapolis",
                "Massachusetts, Boston",
                "Michigan, Lansing",
                "Minnesota, St. Paul",
                "Mississippi, Jackson",
                "Missouri, Jefferson City",
                "Montana, Helena",
                "Nebraska, Lincoln",
                "Nevada, Carson City",
                "New Hampshire, Concord",
                "New Jersey, Trenton",
                "New Mexico, Santa Fe",
                "New York, Albany",
                "North Carolina, Raleigh",
                "North Dakota, Bismarck",
                "Ohio, Columbus",
                "Oklahoma, Oklahoma City",
                "Oregon, Salem",
                "Pennsylvania, Harrisburg",
                "Rhode Island, Providence",
                "South Carolina, Columbia",
                "South Dakota, Pierre",
                "Tennessee, Nashville",
                "Texas, Austin",
                "Utah, Salt Lake City",
                "Vermont, Montpelier",
                "Virginia, Richmond",
                "Washington, Olympia",
                "West Virginia, Charleston",
                "Wisconsin, Madison",
                "Wyoming, Cheyenne"
        };
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int score = 0;
        for (int i = 0; i < 5; i++)
        {
            int whichState = rand.nextInt(statesAndCapitals.length);
            String[] stateAndCapital = statesAndCapitals[whichState].split(",");  //Splits the array at the comma, to help separate states and capitals
            String state = stateAndCapital[0];                                          //States come first in array
            String capital = stateAndCapital[1].trim();                                 //Gets rid of space in front of capital, capitals come second in array
            System.out.println("What is the capital of " + state + "?");
            String answer = scan.nextLine();                                            //Checks the next spot in the array, if it matches the answer is right
            if (answer.equalsIgnoreCase(capital))   //ignores case
            {
                System.out.println("Correct!");
                score++;
            }
            else
            {
                System.out.println("Incorrect. The correct answer is " + capital);
            }
        }
        System.out.println("You got " + score + " correct out of 5");
    }
}



