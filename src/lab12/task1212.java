package lab12;

import laboratorki.lab06;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;

public class task1212 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String filename = "res/files/task1212/test" + i + ".csv";
            File target = new File(filename);
            try {
                int r = (int) lab06.proverka1212(target);
                System.out.println(r);
            } catch (FileNotFoundException e) {
                System.out.println("Файл не существует");
            } catch (NoSuchElementException e) {
                System.out.println("Файл пуст");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Некорректный формат данных");
            } catch (NumberFormatException e) {
                System.out.println("Неудается считать число");
            }
        }
    }
}
