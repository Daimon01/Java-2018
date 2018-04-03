package lab12;
import laboratorki.lab06;

import java.io.File;
import java.io.FileNotFoundException;

public class task9472 {
    public static void main(String[] args) {


        String filename = "res/files/task9472/test1.csv";
        File target = new File(filename);
        try {
            int r = (int) lab06.proverka9472(target);
            System.out.println(r);
        } catch (FileNotFoundException e) {
            System.out.println("Файл пуст");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Некорректный ввод данных");
        }
    }
}
