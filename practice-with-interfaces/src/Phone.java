public class Phone implements Locateable, Displayable
{
    private String brand;
    private String location;

    public Phone(String brand, String location)
    {
        this.brand = brand;
        this.location = location;
    }

    public String getBrand()
    {
        return brand;
    }

    @Override
    public String getLocation()
    {
        return location;
    }

    @Override
    public void changeLocation(String location)
    {
        System.out.println("The phone moved");
        this.location = location;
    }

    @Override
    public String getScreenType()
    {
        return "oled";
    }

    @Override
    public String getPixels()
    {
        return "2k";
    }
}
