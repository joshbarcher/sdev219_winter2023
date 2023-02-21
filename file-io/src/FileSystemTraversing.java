import java.io.File;

public class FileSystemTraversing
{
    public static void main(String[] args)
    {
        File windowsDir = new File("c:\\windows");
        File[] contents = windowsDir.listFiles();

        for (int i = 0; i < contents.length; i++)
        {
            File thing = contents[i];

            if (thing.isFile())
            {
                System.out.println("Found a file! " + thing.getAbsolutePath());
            }
            else if (thing.isDirectory())
            {
                System.out.println("Found a directory! " + thing.getAbsolutePath());
            }
        }
    }
}

