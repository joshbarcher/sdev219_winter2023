package objects;

public class Coin
{
    private String type;
    private String sideOneDesc;
    private String sideTwoDesc;

    private boolean side;
    private int timesFlipped;

    public Coin(String type, String sideOneDesc,
                String sideTwoDesc)
    {
        this.type = type;
        this.sideOneDesc = sideOneDesc;
        this.sideTwoDesc = sideTwoDesc;
    }

    public void flip()
    {
        timesFlipped++;
        side = !side;
    }

    public void flipMany(int times)
    {
        for (int i = 1; i <= times; i++)
        {
            flip();
        }
    }

    public String getSideUp()
    {
        if (side == true)
        {
            return sideOneDesc;
        }
        else
        {
            return sideTwoDesc;
        }
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public boolean isSide()
    {
        return side;
    }

    public void setSide(boolean side)
    {
        this.side = side;
    }

    @Override
    public String toString()
    {
        return "A " + type + " coin (" + getSideUp() + " side up)";
    }
}
