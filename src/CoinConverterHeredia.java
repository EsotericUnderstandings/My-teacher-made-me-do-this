/*
Alejandro Heredia (Red)
9/15/2022
100/100 I not only had to learn new techniques specifically to make this as well as
several changes to the original code suggestions to get the code to work as intended.
 */
public class CoinConverterHeredia
{
    public static void main(String[] args)
    {
        convert(); //calling convert
    }
    public static void description(int yuan, int pennies, int dollars, int quarters, int dimes, int nickels)
    {
        System.out.println(yuan + " Yuan is:"); //displaying amount of yuan to be converted
        System.out.println(dollars + " Dollars"); //displaying dollars
        System.out.println(quarters + " Quarters"); //displaying quarters
        System.out.println(dimes + " Dimes"); //displaying dimes
        System.out.println(nickels + " Nickels"); //displaying nickels
        System.out.println("and " + pennies + " Pennies"); //displaying pennies
    }
    public static void convert()
    {
        int yuan = 1234; //stating yuan
        int pennies = (int)(yuan * .14 * 100); //converting yuan to pennies
        int dollars = pennies / 100; //converting pennies to dollars
        pennies = pennies % 100; //the amount of leftover pennies
        int quarters = pennies / 25; //converting leftover pennies to quarters
        pennies = pennies % 25; //left over pennies
        int dimes = pennies / 10; //converting leftover pennies to dimes
        pennies = pennies % 10; //finding leftover pennies
        int nickels = pennies / 5; //converting leftover pennies to nickels
        pennies = pennies % 5; //last leftover pennies

        description(yuan, pennies, dollars, quarters, dimes, nickels);
        //passing variables to and executing description
    }
}
