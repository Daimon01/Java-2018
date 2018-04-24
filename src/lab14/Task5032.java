package lab14;

        import lab14.task5032.Rectangle5032;

        import java.io.File;
        import java.io.FileNotFoundException;
        import java.io.PrintWriter;
        import java.io.Writer;
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
        Scanner reader = null;
        String line = null;
        try {
            reader = new Scanner(target);
        }
        catch (FileNotFoundException e) {
            System.out.println("Файл не существует");;
        }
        line = reader.nextLine();
        String[] arrs = line.split(";");
        Rectangle5032 r1 = new Rectangle5032();
        int action = 0;

        if(arrs[0] == "shiftX"){
            int i = Integer.parseInt(arrs[1]);
            r1.x = r1.x + i;
            action ++;
        }
        if(arrs[0] == "shiftY"){
            int i = Integer.parseInt(arrs[1]);
            r1.y = r1.y + i;
            action ++;
        }
        if(arrs[0] == "stretchX"){
            int i = Integer.parseInt(arrs[1]);
            r1.width = r1.width + i;
            action ++;
        }
        if(arrs[0] == "stretchY"){
            int i = Integer.parseInt(arrs[1]);
            r1.height = r1.height + i;
            action ++;
        }
       while (reader.hasNext()) {
           arrs = line.split(";");
           if (arrs[0] == "shiftX") {
               int i = Integer.parseInt(arrs[1]);
               r1.x = r1.x + i;
               action ++;
           }
           if (arrs[0] == "shiftY") {
               int i = Integer.parseInt(arrs[1]);
               r1.y = r1.y + i;
               action ++;
           }
           if (arrs[0] == "stretchX") {
               int i = Integer.parseInt(arrs[1]);
               r1.width = r1.width + i;
               action ++;
           }
           if (arrs[0] == "stretchY") {
               int i = Integer.parseInt(arrs[1]);
               r1.height = r1.height + i;
               action ++;
           }
           File write1 = new File("src/lab14/task5032/", "case1.html");
           try {
               PrintWriter pw = new PrintWriter(write1);
           } catch (FileNotFoundException e) {
               e.printStackTrace();
           }
           Writer
       }

    }
}

