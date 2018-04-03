package lab12;
import laboratorki.lab06;

import java.io.File;
import java.io.FileNotFoundException;

public class task9472 {
    String filename = "res/files/task9472/test1.csv";
    File target = new File(filename);
    try{
        int r = 0;
        try {
            r = (int) lab06.proverka9472(target);
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }
        System.out.println(r);
    }catch (FileNotFoundException e){
        System.out.println("Файл пуст");
    }

}
