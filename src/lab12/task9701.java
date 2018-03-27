package lab12;

import laboratorki.lab05;

public class task9701 {
    public static void main(String[] args) {
        System.out.println("Задание 9020");
        for (int i = 0; i < 75; i++) {
            try {
                double r = lab05.task9020(i);
                System.out.println(r);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Задание 7237");
        for (int i = 10; i > -280; i--) {
            try {
                double r = lab05.task7237(i);
                System.out.println(r);
            } catch (IllegalArgumentException e) {
                System.out.println(e. getMessage());
            }
        }
    }
}
