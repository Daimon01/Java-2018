package lab14;

        import lab14.task5032.Rectangle5032;

        import java.io.File;
        import java.io.FileNotFoundException;
        import java.io.PrintWriter;
        import java.io.Writer;
        import java.util.Objects;
        import java.util.Scanner;

/**
 * @author akryukov
 *         16.11.2017
 */
public class Task5032 {
    public static void main(String[] args) {
        String filename = "res/files/task5032/test6.csv";
        File target = new File(filename);
        Scanner reader = null;
        String line = null;
        try {
            reader = new Scanner(target);
            line = reader.nextLine();
            String[] arrs = line.split(";");
            Rectangle5032 r1 = new Rectangle5032();
            int action = 0;
            if("shiftX".equals(arrs[0])){
                int i = Integer.parseInt(arrs[1]);
                r1.x = r1.x + i;
                action ++;
            }
            if("shiftY".equals(arrs[0])){
                int i = Integer.parseInt(arrs[1]);
                r1.y = r1.y + i;
                action ++;
            }
            if("stretchX".equals(arrs[0])){
                int i = Integer.parseInt(arrs[1]);
                r1.width = r1.width + i;
                action ++;
            }
            if("stretchY".equals(arrs[0])){
                int i = Integer.parseInt(arrs[1]);
                r1.height = r1.height + i;
                action ++;
            }
            while (reader.hasNext()) {
                line = reader.nextLine();
                arrs = line.split(";");
                if("shiftX".equals(arrs[0])){
                    int i = Integer.parseInt(arrs[1]);
                    r1.x = r1.x + i;
                    action ++;
                }
                if("shiftY".equals(arrs[0])){
                    int i = Integer.parseInt(arrs[1]);
                    r1.y = r1.y + i;
                    action ++;
                }
                if("stretchX".equals(arrs[0])){
                    int i = Integer.parseInt(arrs[1]);
                    r1.width = r1.width + i;
                    action ++;
                }
                if("stretchY".equals(arrs[0])){
                    int i = Integer.parseInt(arrs[1]);
                    r1.height = r1.height + i;
                    action ++;
                }

            }
            File write1 = new File("src/lab14/task5032/", "case6.html");
            try {
                PrintWriter pw = new PrintWriter(write1);
                pw.print("<td class=\"preformatted\">\n" +
                        "<p>Действий: "+action+"</p><p>Результат:</p>\n" +
                        "<svg width=\"500\" height=\"350\">\n" +
                        "<rect x=\"100\" y=\"100\" width=\"100\" height=\"100\" fill=\"transparent\" stroke=\"red\"></rect>" +
                        "<rect x=\""+r1.x+"\" y=\""+r1.y+"\" width=\""+r1.width+"\" height=\""+r1.height+"\" fill=\"transparent\" stroke=\"black\">" +
                        "</rect>\n"+"</svg></td>");
                pw.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Файл не существует");
        }


    }
}

