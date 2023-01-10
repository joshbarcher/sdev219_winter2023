package phones;

public class CellPhone
{
    //fields
    private String brand;
    private int volume; //between 0-10
    private String chargingPort;
    private double storageInGigs;

    //constructor(s)
    public CellPhone(String brand, int volume,
                     String chargingPort,
                     double storageInGigs)
    {
        //assign the field to the matching parameter
        this.brand = brand;
        this.chargingPort = chargingPort;
        this.storageInGigs = storageInGigs;

        //use the setter for volume to prevent bad values
        setVolume(volume);
    }

    public String getBrand()
    {
        return brand;
    }

    public int getVolume()
    {
        return volume;
    }

    public String getChargingPort()
    {
        return chargingPort;
    }

    public double getStorageInGigs()
    {
        return storageInGigs;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public void setVolume(int volume)
    {
        if (volume >= 0 && volume <= 10)
        {
            this.volume = volume;
        }
    }

    public void setChargingPort(String chargingPort)
    {
        this.chargingPort = chargingPort;
    }

    public void setStorageInGigs(double storageInGigs)
    {
        this.storageInGigs = storageInGigs;
    }

    public void answerPhone(String incomingNumber)
    {
        System.out.println("You pick up the call from " + incomingNumber);
        System.out.println("You answered on a " + brand + " phone");
        this.toString();
    }

    //this converts the object to a string (and returns the string)
    public String toString()
    {
        return "CellPhone - " + brand;
    }
}
