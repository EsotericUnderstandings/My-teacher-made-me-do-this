/*
Alejandro Heredia (Red)
10/7/2022
Asks for types of words and input to create a story using the responses provided
100/100 met all requirements and wrote a poorly written but working story for the program.
*/
import java.util.*;
public class StoryHeredia /* <----- change this name to include your last name,
then save the file with the new name */
        {
        //no code goes here
            //why not just put it in the public class instead of this unnecessary class declaration?
        }
class BootlegMadLib  //<----- change the name for this class to a name of your choice
{
    /* the main method is given to you*/
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("How many stories are you making: ");
        int count = kb.nextInt();
        kb.nextLine();
        for(int i = 1; i <= count ; i++)
        {
            System.out.println("Answer a few questions and I will make up a story for you\n");
            //call the method that you created below, make sure to pass the Scanner object to it
            storyTime(kb);
        }
    }
  /* create a method with a name of your choice. The name of the method must be
meaningful.
  this method accepts a Scanner object as its parameter
  do the followings in this method:
        declare variables to hold the user's answers to the questions
        ask the required questions
        create the story
        display the story*/
    public static void storyTime(Scanner kb)
    {
        System.out.print("Give me a noun: ");
        String question1 = kb.nextLine();
        System.out.print("Give me a name: ");
        String question2 = kb.nextLine();
        System.out.print("Give me a real number: ");
        int question3 = kb.nextInt();
        question3 = (int) Math.pow(question3, 3);
        kb.nextLine(); /*
        https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo
        */
        System.out.print("Give me an adjective: ");
        String question4 = kb.nextLine();
        System.out.print("Give me a verb: ");
        String question5 = kb.nextLine();
        System.out.print("Give me an adjective: ");
        String question6 = kb.nextLine();
        System.out.print("Give me a noun: ");
        String question7 = kb.nextLine();
        System.out.print("Give me a verb: ");
        String question8 = kb.nextLine();
        System.out.print("Give me a number with a decimal: ");
        double question9 = kb.nextDouble();
        kb.nextLine();
        System.out.print("Give me a verb: ");
        String question10 = kb.nextLine();
        int question10Length = question10.length();

        System.out.println("There once was a " + question1 + " named " + question2 + " and they " +
                "had " + question3 + " best friends. They were never lonely but always felt like " +
                "they wanted more\nso they " + question4 + " " + question5 + " until they were" +
                " satisfied. but they were never satisfied. Soon exhaustion set in and they" +
                " were " + question6 + " to the " + question7 + ".\nAs they " + question8 + " there" +
                " to tired to do anything else they looked at their remaining friends that showed up\n" +
                "knowing they only had " + question9 + " seconds left to live, they cried their last " +
                "word. Only a " + question10Length + " letter word left to their name to be written" +
                " \non their unvisited tombstone just weeks later reading:");
        System.out.println("RIP\n" + question2 + "\nThey will probably be missed by their " + question3 +
                " friends\nTheir last words to be left to this world are as follows\n\"" + question10 +
                "\"\nThey lived as long as their flesh held out and their memory will live longer.");
    }
}
