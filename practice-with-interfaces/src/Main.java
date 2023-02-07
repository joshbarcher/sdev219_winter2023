public class Main
{
    public static void main(String[] args)
    {
        Pet penny = new Pet("Penny", 5, 2, true, "living room");
        Pet bagel = new Pet("Bagel", 3, 6, false, "yard");
        Phone phone = new Phone("Samsung", "Desk");
        Tablet tablet = new Tablet("lcd", "4k");

        Locateable[] locateables = {penny, bagel, phone};

        for (int i = 0; i < locateables.length; i++)
        {
            locateables[i].changeLocation("roof");
        }

        Displayable[] displays = {phone, tablet};

        for (int i = 0; i < displays.length; i++)
        {
            System.out.println("Display found: " +
                    displays[i].getScreenType());
        }
    }
}