package lab12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class task1212 {
    public static void main(String[] args) {
        String filename = "res/files/task1212/test1.csv";
        File target = new File(filename);
        try {
            Scanner reader = new Scanner(target);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
