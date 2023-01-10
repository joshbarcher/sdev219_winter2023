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
        CellPhone myPhone = new CellPhone("Samsung S22", 3, "USB-C",
                                          128.0);
        //System.out.println(myPhone);
        //myPhone.answerPhone("253-111-2222");

        System.out.println("Here are my phone details");
        System.out.println("Brand: " + myPhone.getBrand());
        System.out.println("Volume: " + myPhone.getVolume());
    }
}
