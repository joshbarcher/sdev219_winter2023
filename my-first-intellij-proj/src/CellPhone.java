
public class CellPhone
{
    //fields
    private String brand;
    private int volume;
    private String chargingPort;
    private double storageInGigs;

    //constructor(s)
    public CellPhone(String phoneBrand, int phoneVolume,
                     String port, double storage)
    {
        //assign the field to the matching parameter
        brand = phoneBrand;
        volume = phoneVolume;
        chargingPort = port;
        storageInGigs = storage;
    }

    //this converts the object to a string (and returns the string)
    public String toString()
    {
        return "CellPhone - " + brand;
    }
}
