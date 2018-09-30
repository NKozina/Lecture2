package FirstPackage;

import org.apache.commons.text.RandomStringGenerator;
import sun.awt.geom.AreaOp;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.nio.charset.Charset;




public class Hello {
    public static void main(String[] args) {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 12;

        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);

        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int) (random.nextFloat() * (rightLimit - leftLimit + 1));

            buffer.append((char) randomLimitedInt);
        }

        String generatedString = buffer.toString();
        System.out.println(generatedString);//вывод сгенерированной строки на экран

        File folder = new File(generatedString);
        if (!folder.exists())
        {
            boolean result = false;

            try
            {
                folder.mkdir();
                result = true;
            } catch (SecurityException se)
            {

            }
            if (result)
            {
                System.out.println("\nDIR " + generatedString + " created");
            }
        }

        File txt = new File (folder, "name.txt");
        try
        {
            txt.createNewFile ();
        }
        catch (IOException e)
        {
            e.printStackTrace ();
        }


    }
}

