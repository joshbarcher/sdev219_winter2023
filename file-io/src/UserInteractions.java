import java.io.File;

public class UserInteractions
{
    public static void main(String[] args)
    {
        //prompt the user for a folder
        Console reader = new Console();
        String path = reader.getString("Enter the location of a directory");
        File directory = new File(path);

        //double check that it exists
        if (directory.exists())
        {
            //print out the full path of files (only)
            File[] files = directory.listFiles();
            for (int i = 0; i < files.length; i++)
            {
                File file = files[i];
                if (file.isFile())
                {
                    System.out.println(file.getAbsolutePath());
                }
            }
        }
        else
        {
            System.out.println("Directory not found!");
        }
    }
}

