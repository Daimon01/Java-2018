package laboratorki;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class lab06 {
    public static double proverka(File target)throws FileNotFoundException{
        Scanner reader = new Scanner(target);
        int a;
        String line = reader.nextLine();
        int i = Integer.parseInt(line);
        a = i;
        while (reader.hasNext()) {
            line = reader.nextLine();
            i = Integer.parseInt(line);
            if (i < a) {
                a = i;
            }
        }
        reader.close();
        return a;
}
}
