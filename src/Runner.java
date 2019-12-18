public class Runner
{
    private int name;
    private String word;
    String attack;

    public Runner(String word, int num, String attack)
    {
        this.word = word;
        this.name = num;
        this.attack = attack;
    }//Constructor ends

    public String getWord()
    {
        return word;
    }// returns the String  word

    public int getNum()
    {
        return name;
    }//returns the int num
    public String getAttack()
    {
        return attack;
    }//returns the string called attack

    public String setWord()
    {
        return word;
    }//returns the setter of word

    public int setNum()
    {
        return name;
    }//returns the setter of name
    public String setAttack()
    {
        return attack;
    }//returns the setter of

    public String toString()
    {
        return name + "El Corredor" + word + "Click to play";
    }
}
