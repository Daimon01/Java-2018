package Lab15;

import jdk.internal.util.xml.impl.Input;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Task9990 {
    public static HashSet<String> list(InputStream file) throws FileNotFoundException {

        Scanner text = new Scanner(file);
        HashSet<String> list = new HashSet<>();
        while (text.hasNext()) {
            String line = text.nextLine();
            list.add(line);
        }
        return list;
    }
}
