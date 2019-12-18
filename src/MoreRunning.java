public class MoreRunning
{
    public static void main (String[]args)
    {
        int dir;
        String muevate = "";
        String attack = "";
        public void turnLeft()
        {
            if (muevate.equals("a") )
            {
                System.out.println ("You turned right");
            }
            else if (muevate.equals("d"))
            {
                System.out.println ("You turned left");
            }
        }
    }

    private static String getAttack() {
        boolean child = true;
        boolean adult = true;
        if (child)
        {
            return child +  "throws slap";
        }
        else if (adult)
        {
            return adult + "throws kick and punch";
        }
        else if (!adult && child)
        {
            return child + "throws slap";
        }
        return null;
    }
}
