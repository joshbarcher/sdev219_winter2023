package phones;

public class CellPhone
{
    //fields
    private String brand;
    private int volume;
    private String chargingPort;
    private double storageInGigs;

    //constructor(s)
    public CellPhone(String brand, int volume,
                     String chargingPort,
                     double storageInGigs)
    {
        //assign the field to the matching parameter
        this.brand = brand;
        this.volume = volume;
        this.chargingPort = chargingPort;
        this.storageInGigs = storageInGigs;
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
        this.volume = volume;
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
        return "phones.CellPhone - " + brand;
    }
}
