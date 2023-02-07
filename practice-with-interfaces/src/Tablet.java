public class Tablet implements Displayable
{
    private String screen;
    private String pixels;

    public Tablet(String screen, String pixels)
    {
        this.screen = screen;
        this.pixels = pixels;
    }

    @Override
    public String getScreenType()
    {
        return screen;
    }

    @Override
    public String getPixels()
    {
        return pixels;
    }
}
