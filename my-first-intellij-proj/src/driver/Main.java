package driver;

import constructors.CoffeeMaker;
import phones.Cat;
import phones.CellPhone;
import phones.User;

public class Main
{
    public static void main(String[] args)
    {
        //create an instance of our phones.CellPhone class
        CellPhone myPhone = new CellPhone("Samsung S22", -10, "USB-C",
                                          128.0);
        CellPhone myIPhone = new CellPhone("IPhone 13 Pro", 3, "Thunderbolt", 256.0);

        //System.out.println(myPhone);
        //myPhone.answerPhone("253-111-2222");

        System.out.println("Here are my phone details");
        System.out.println("Brand: " + myPhone.getBrand());

        //good
        myPhone.setVolume(7);

        //bad
        myPhone.setVolume(-5);
        //myPhone.volume = 100;

        System.out.println("Volume: " + myPhone.getVolume());
        System.out.println("Phone info: " + myPhone.toString());
    }
}
