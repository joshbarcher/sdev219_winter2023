public class Pet implements Locateable
{
    private String name;
    private double weight;
    private int age;
    private boolean indoor;
    private String location;

    public Pet(String name, double weight,
               int age, boolean indoor, String location)
    {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.indoor = indoor;
        this.location = location;
    }

    public void feed()
    {
        //do something...
    }

    @Override
    public String getLocation()
    {
        return location;
    }

    @Override
    public void changeLocation(String location)
    {
        System.out.println("The location of " + name +
                " changed to " + location);
        this.location = location;
    }
}
