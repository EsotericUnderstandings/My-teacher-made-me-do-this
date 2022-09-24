public class Star{
    public static void main(String[] args)
    {
        displayMoreStar();
        displayMoreStar();
    }
    public static void displayStar()
    {
        System.out.println("******");
        System.out.println("******");
    }
    public static void displayMoreStar()
    {
        displayStar();
        displayStar();
    }
}