package lab12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import laboratorki.lab06;

public class task6882 {
    public static void main(String[] args) {
        for (int b = 0; b < 8; b++) {
            String filename = "res/files/task6882/test" + b + ".txt";
            File target = new File(filename);
            try {
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
                System.out.println(a);
                reader.close();
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
