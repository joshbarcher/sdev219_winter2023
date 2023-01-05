package phones;

public class User
{
    //these are package level visibility
    String firstName;
    String lastName;
    String userType;

    public User(String first, String last, String type)
    {
        firstName = first;
        lastName = last;
        userType = type;
    }
}
