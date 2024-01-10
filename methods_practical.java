class computer
{
    public void playMusic()
    {
        System.out.println("Playing... Music....");
    }

    public String pen(int cost)
    {
        if(cost>=10)
            return "PEN";
        return "Nothing";
    }
}

public class methods_practical
{
    public static void main(String args[])
    {
        computer com = new computer();
        com.playMusic();
        String str = com.pen(1);

        System.out.println(str);
    }
}