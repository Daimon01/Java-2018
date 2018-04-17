package lab14;

        import lab14.task5032.Rectangle5032;
        import common.Utils;

        import java.io.File;
        import java.io.FileNotFoundException;
        import java.util.Scanner;

/**
 * @author akryukov
 *         16.11.2017
 */
public class Task5032 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("5032");
        String filename = "res/files/task5032/test1.csv";
        File target = new File(filename);
        Scanner reader = new Scanner(target);
        String line = reader.nextLine();
        String[] arrs = line.split(";");
        Rectangle5032 r1 = new Rectangle5032();
        if(arrs[0] == "shiftX"){
            int i = Integer.parseInt(arrs[1]);
            r1.x = r1.x + i;
        }
        if(arrs[0] == "shiftY"){
            int i = Integer.parseInt(arrs[1]);
            r1.y = r1.y + i;
        }
        if(arrs[0] == "stretchX"){
            int i = Integer.parseInt(arrs[1]);
            r1.width = r1.width + i;
        }
        if(arrs[0] == "stretchY"){
            int i = Integer.parseInt(arrs[1]);
            r1.height = r1.height + i;
        }
       while (reader.hasNext()) {
           arrs = line.split(";");
           if (arrs[0] == "shiftX") {
               int i = Integer.parseInt(arrs[1]);
               r1.x = r1.x + i;
           }
           if (arrs[0] == "shiftY") {
               int i = Integer.parseInt(arrs[1]);
               r1.y = r1.y + i;
           }
           if (arrs[0] == "stretchX") {
               int i = Integer.parseInt(arrs[1]);
               r1.width = r1.width + i;
           }
           if (arrs[0] == "stretchY") {
               int i = Integer.parseInt(arrs[1]);
               r1.height = r1.height + i;
           }

       }
    }
}

