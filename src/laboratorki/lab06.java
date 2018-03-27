package laboratorki;

import java.util.Scanner;

public class lab06 {
    public static double proverka(){
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
}
