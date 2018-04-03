package lab12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import laboratorki.lab06;

public class task6882 {
    public static void main(String[] args) {
        for (int b = 0; b < 8; b++) {
            String filename = "res/files/task6882/test" + b + ".txt";
            File target = new File(filename);
            try {
              int r = (int) lab06.proverka6882(target);
                System.out.println(r);
            } catch (FileNotFoundException e) {
                System.out.println("Файл не существует");
            } catch (NumberFormatException e) {
                System.out.println("Не удается считать число");
            } catch (NoSuchElementException e) {
                System.out.println("Файл пуст");
            }
        }
    }
}
