//this interface borrows methods from Displayable
public interface PoweredDisplay extends Displayable
{
    boolean isOn();
    void turnOn();
    void turnOff();
}
