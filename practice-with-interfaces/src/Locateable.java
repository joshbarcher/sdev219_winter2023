//this interface represents items that can be located
public interface Locateable
{
    //interfaces typically only allow for abstract methods
    String getLocation();
    void changeLocation(String location);
}
