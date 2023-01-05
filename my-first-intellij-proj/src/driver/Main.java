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
        System.out.println(myPhone);
        myPhone.answerPhone("253-111-2222");

        User myUser = new User("Josh", "Archer", "Admin");

        CoffeeMaker maker = new CoffeeMaker();
        System.out.println(maker);

        Cat lazarus = new Cat();
        Cat ginny = new Cat();
    }
}
