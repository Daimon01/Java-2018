package laboratorki;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class lab06 {
    public static double proverka6882(File target) throws FileNotFoundException {
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

    public static double proverka1212(File target) throws FileNotFoundException {
        Scanner reader = new Scanner(target);
        String line = reader.nextLine();
        String[] arrs = line.split(";");
        int[] arr = new int[arrs.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(arrs[i]);
        }
        int S = arr[2] * arr[3];
        while ((reader.hasNext())) {
            line = reader.nextLine();
            arrs = line.split(";");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(arrs[i]);
            }
            int s = arr[2] * arr[3];
            if (S < s) {
                S = s;
            }
        }
        reader.close();
        return S;
    }
    public static double proverka9472(File target) throws FileNotFoundException{
        Scanner reader = new Scanner(target);
        String line = reader.nextLine();
        String[] arrs = line.split(";");
        if(arrs[0] == "rect"){
            int[] arr = new int[arrs.length];

            for (int i = 1; i < arr.length; i++) {
                arr[i] = Integer.parseInt(arrs[i]);
            }
            double S = arr[3]*arr[4];
            while ((reader.hasNext())) {
                line = reader.nextLine();
                arrs = line.split(";");
                for (int i = 1; i < arr.length; i++) {
                    arr[i] = Integer.parseInt(arrs[i]);
                }
                double s = arr[3] * arr[4];
                if (S < s) {
                    S = s;
                }
            }
            reader.close();
            return S;
        }
        else {
            int[] arr = new int[arrs.length];

            for (int i = 1; i < arr.length; i++) {
                arr[i] = Integer.parseInt(arrs[i]);
            }
            double S = Math.PI * Math.pow(arr[4],2);
            while ((reader.hasNext())) {
                line = reader.nextLine();
                arrs = line.split(";");
                for (int i = 1; i < arr.length; i++) {
                    arr[i] = Integer.parseInt(arrs[i]);
                }
                double s = Math.PI * Math.pow(arr[4],2);
                if (S < s) {
                    S = s;
                }
            }
            reader.close();
            return S;
        }

    }
}
