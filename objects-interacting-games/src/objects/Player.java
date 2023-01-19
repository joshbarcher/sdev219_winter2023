package objects;

public class Player
{
    private String playerName;
    private int score;
    private int wins;
    private int losses;

    public Player(String playerName)
    {
        this.playerName = playerName;
    }

    public String getPlayerName()
    {
        return playerName;
    }

    public void setPlayerName(String playerName)
    {
        this.playerName = playerName;
    }

    public int getScore()
    {
        return score;
    }

    public void setScore(int score)
    {
        this.score = score;
    }

    public int getWins()
    {
        return wins;
    }

    public void setWins(int wins)
    {
        this.wins = wins;
    }

    public int getLosses()
    {
        return losses;
    }

    public void setLosses(int losses)
    {
        this.losses = losses;
    }

    @Override
    public String toString()
    {
        return "Player " + playerName + "\n" +
               "***************************************" + "\n" +
               "Score: " + score + "\n" +
               "Wins: " + wins + "\n" +
               "Losses: " + losses + "\n" +
               "***************************************";
    }
}
