import java.io.File;
import java.io.IOException;

public class CreatingFiles
{
    public static void main(String[] args)
    {
        File imagesDir = new File("files/resources/images");
        File textDir = new File("files/resources/text");

        System.out.println("Images dir exists? " + imagesDir.exists());
        System.out.println("Text dir exists? " + textDir.exists());

        boolean imagesDirCreated = imagesDir.mkdirs();
        boolean textDirCreated = textDir.mkdirs();

        System.out.println("Directories created? " + (imagesDirCreated && textDirCreated));

        File textFile = new File("files/resources/text/my-file.txt");
        if (textFile.exists() == false)
        {
            try
            {
                textFile.createNewFile();
                System.out.println("File created");
            }
            catch (IOException ex)
            {
                System.out.println("A general IO error occurred while trying to create the file");
            }
        }
        else
        {
            System.out.println("File already exists!");
        }
    }
}

