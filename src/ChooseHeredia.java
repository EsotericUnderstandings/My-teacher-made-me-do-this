
/*
Alejandro Heredia (Red)
9/23/2022
Outputs a table that converts Gallons to Liters in integers of 4 with a header for context
self grade: 100/100 I even corrected your litter of spelling mistakes + plenty of comments
*/
public class ChooseHeredia
/* I choose you, Spegetti code!
⢀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠘⣿⣿⡟⠲⢤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠈⢿⡇⠀⠀⠈⠑⠦⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⠴⢲⣾⣿⣿⠃
⠀⠀⠈⢿⡀⠀⠀⠀⠀⠈⠓⢤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⡤⠖⠚⠉⠀⠀⢸⣿⡿⠃⠀
⠀⠀⠀⠈⢧⡀⠀⠀⠀⠀⠀⠀⠙⠦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⡤⠖⠋⠁⠀⠀⠀⠀⠀⠀⣸⡟⠁⠀⠀
⠀⠀⠀⠀⠀⠳⡄⠀⠀⠀⠀⠀⠀⠀⠈⠒⠒⠛⠉⠉⠉⠉⠉⠉⠉⠑⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⠏⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠘⢦⡀⠀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡴⠃⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠙⣶⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠰⣀⣀⠴⠋⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⣰⠁⠀⠀⠀⣠⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣤⣀⠀⠀⠀⠀⠹⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⢠⠃⠀⠀⠀⢸⣀⣽⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⣧⣨⣿⠀⠀⠀⠀⠀⠸⣆⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⡞⠀⠀⠀⠀⠘⠿⠛⠀⠀⠀⢀⣀⠀⠀⠀⠀⠀⠙⠛⠋⠀⠀⠀⠀⠀⠀⢹⡄⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⢰⢃⡤⠖⠒⢦⡀⠀⠀⠀⠀⠀⠙⠛⠁⠀⠀⠀⠀⠀⠀⠀⣠⠤⠤⢤⡀⠀⠀⢧⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⢸⢸⡀⠀⠀⢀⡗⠀⠀⠀⠀⢀⣠⠤⠤⢤⡀⠀⠀⠀⠀⢸⡁⠀⠀⠀⣹⠀⠀⢸⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⢸⡀⠙⠒⠒⠋⠀⠀⠀⠀⠀⢺⡀⠀⠀⠀⢹⠀⠀⠀⠀⠀⠙⠲⠴⠚⠁⠀⠀⠸⡇⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⢷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠦⠤⠴⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⢳⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⢸⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠾⠤⠤⠤⠤⠤⠤⠤⠤⠤⠤⠤⠤⠤⠤⠤⠤⠤⠤⠤⠦⠤⠤⠤⠤⠤⠤⠤⠼⠇⠀⠀⠀⠀⠀
*/
{
    //required class constant
    static final double litersPerGallon = 3.7;
    public static int charToSend;
    public static int numCharsToSend;

    public static void main (String[] args)
    {
        //Main Method
        header();
        convertionTable();
    }

    /* Outputs the header to display context for the table*/
    public static void header()// a totaly meaningful name ;D
    {
        //I cry
        margin();
        System.out.print('\n');

        System.out.print("&");
        // First line preamble

        numCharsToSend = 29;
        charToSend = ' ';
        send_chars();

        // First line
        System.out.print("This program converts gallons to litters");
        // First line end

        numCharsToSend = 51;
        send_chars();

        // Second line preamble
        System.out.print("&\n&");
        for (int i=0; i < 51; i++)
        {
            System.out.print(" ");
        }
        // Second line
        System.out.print("1 Gallon is about 3.7 liters");
        // Second line end
        for (int i=0; i < 51; i++)
        {
            System.out.print(" ");
        }
        System.out.println("&");

        margin();

    }
    // prints the long piece of the header
    public static void send_chars()
    {
        for (int i = 0; i < numCharsToSend; i++)
        {
            System.out.print((char) charToSend);
        }
    }
/*                   (####)      "Homie, im ASCII" - Marg(in) Simpson
                   (#######)
                 (#########)
                (#########)
               (#########)
              (#########)
             (#########)
            (#########)
           (#########)
            (o)(o)(##)
          ,_C     (##)
         /___,   (##)
           \     (#)
            |    |
            OOOOOO
           /      \
*/
    public static void margin()
    {
        numCharsToSend = 45;
        charToSend = '&';
        send_chars();
    }

    /*creates and prints the table showing the conversions*/
    public static void convertionTable()  //  <-- must change the method name to meaningful name
    {
        //a table so clean you can eat off it
        System.out.println("\n\nGallon\tLiter");
        for (int i = 1; i <= 100; i += 4)
        {
            System.out.println(i + "    \t" + i*litersPerGallon);
        }
    }
}