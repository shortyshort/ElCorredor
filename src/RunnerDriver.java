import java.util.Scanner;
public class RunnerDriver
{
    private int player;
    private String str;
    String attack;

    Scanner keyboard = new Scanner(System.in);

    public void Runner()
    {
        if (player == 1)
        {
            System.out.println ("You're an agent");
        }
        else if (player == 2)
        {
             System.out.println ("You're a ninja");
        }
        else
        {
            System.out.println ("You're normal");
        }
    }


}
