public class StopSign {
    public static void main(String[] args)
    {
        top();
        bottom();
        line();
        System.out.println("");
        top();
        stop();
        bottom();
        top();
        line();
    }
    public static void top()
    {
        System.out.println("  ______");
        System.out.println(" /      \\");
        System.out.println("/        \\");
    }
    public static void bottom()
    {
        System.out.println("\\        /");
        System.out.println(" \\______/");
    }
    public static void line()
    {
        System.out.println("+--------+");
    }
    public static void stop()
    {
        System.out.println("|  STOP  |");
    }
}
