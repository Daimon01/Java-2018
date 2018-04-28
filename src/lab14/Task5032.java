package lab14;

import lab14.task5032.Rectangle5032;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author akryukov
 * 16.11.2017
 */
public class Task5032 {
    public static void main(String[] args) {
        for (int k = 1; k <= 14; k++) {
            String filename = "res/files/task5032/test" + k + ".csv";
            File target = new File(filename);
            Scanner reader = null;
            String line = null;
            int action = 0;
            Rectangle5032 r1 = new Rectangle5032();
            File write1 = new File("src/lab14/task5032/", "case" + k + ".html");
            String a = null;
            int ER = 0;
            try {
                reader = new Scanner(target);
                line = reader.nextLine();
                String[] arrs = line.split(";");
                if ("shiftX".equals(arrs[0]) && arrs.length == 2) {
                    double i = Double.parseDouble(arrs[1]);
                    r1.corX(i);
                    action++;
                } else if ("shiftY".equals(arrs[0]) && arrs.length == 2) {
                    double i = Double.parseDouble(arrs[1]);
                    r1.corY(i);
                    action++;
                } else if ("stretchX".equals(arrs[0]) && arrs.length == 2) {
                    double i = Double.parseDouble(arrs[1]);
                    r1.width(i);
                    action++;
                } else if ("stretchY".equals(arrs[0]) && arrs.length == 2) {
                    double i = Double.parseDouble(arrs[1]);
                    r1.height(i);
                    action++;
                } else {
                    IllegalArgumentException ex = new IllegalArgumentException("Некорректное действие " + arrs[0]);
                    throw ex;
                }
                while (reader.hasNext()) {
                    line = reader.nextLine();
                    arrs = line.split(";");
                    if ("shiftX".equals(arrs[0]) && arrs.length == 2) {
                        double i = Double.parseDouble(arrs[1]);
                        r1.corX(i);
                        action++;
                    } else if ("shiftY".equals(arrs[0]) && arrs.length == 2) {
                        double i = Double.parseDouble(arrs[1]);
                        r1.corY(i);
                        action++;
                    } else if ("stretchX".equals(arrs[0]) && arrs.length == 2) {
                        double i = Double.parseDouble(arrs[1]);
                        r1.width(i);
                        action++;
                    } else if ("stretchY".equals(arrs[0]) && arrs.length == 2) {
                        double i = Double.parseDouble(arrs[1]);
                        r1.height(i);
                        action++;
                    } else {
                        IllegalArgumentException ex = new IllegalArgumentException("Некорректное действие" + arrs[0]);
                        throw ex;
                    }
                }
            } catch (FileNotFoundException e) {
                a = e.getMessage();
                ER = ER + 2;
            } catch (IllegalArgumentException ex) {
                a = ex.getMessage();
                ER++;
            } catch (ArrayIndexOutOfBoundsException ex) {
                a = "Некорректный формат";
                ER++;
            }


            if (ER == 1) {
                try {
                    PrintWriter pw = new PrintWriter(write1);
                    pw.print("<td class=\"preformatted\">\n" +
                            "<p>Действий: " + action + "</p>\n" +
                            "<p>Ошибка: " + a +
                            "<p>Результат:</p>\n" +
                            "<svg width=\"500\" height=\"350\">\n" +
                            "<rect x=\"100\" y=\"100\" width=\"100\" height=\"100\" fill=\"transparent\" stroke=\"red\"></rect>");
                    pw.print(r1.toString());
                    pw.close();
                } catch (FileNotFoundException ef) {
                    System.out.println("Файл не существует");
                }
            }
            if (ER == 0) {
                try {
                    PrintWriter pw = new PrintWriter(write1);
                    pw.print("<td class=\"preformatted\">\n" +
                            "<p>Действий: " + action + "</p>\n" +
                            "<p>Результат:</p>\n" +
                            "<svg width=\"500\" height=\"350\">\n" +
                            "<rect x=\"100\" y=\"100\" width=\"100\" height=\"100\" fill=\"transparent\" stroke=\"red\"></rect>");
                    pw.print(r1.toString());
                    pw.close();
                } catch (FileNotFoundException ef) {
                    System.out.println("Файл не существует");
                }
            }
            if (ER == 2) {
                try {
                    PrintWriter pw = new PrintWriter(write1);
                    pw.print("Данный файл не существует");
                    pw.close();
                } catch (FileNotFoundException ef) {
                    System.out.println("Файл не существует");
                }
            }

        }
    }
}

