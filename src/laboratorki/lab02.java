package laboratorki;

public class lab02 {
    public static double task4411(double a) {
        a = a + 7.00;
        return a;
    }

    public static double task8428(double a) {
        a = a * Math.PI / 180;
        return a;
    }

    public static double task1262(double a) {
        a = 5 * Math.cos(task8428(a));
        return a;
    }

    public static double task2790(double a) {
        a = Math.sqrt(1 - Math.pow(Math.sin(task8428(a)), 2));
        return a;
    }

    public static double task9164(double a, double b) {
        a = Math.sin(task8428(a)) * Math.cos(task8428(b)) +
                Math.cos(task8428(a)) * Math.sin(task8428(b));
        return a;
    }
    public  static double task5063(double a){
        a = a%360;
        return a;
    }
    public static double task7711(double a){
        a = Math.sin(Math.toRadians(a));
        return a;
    }
    public static String task5662(int a, int b, int c) {
        String d;
        if (a == 0 || b==0 || c == 0){
            return "Данное уравнение не является квадратным";
        }
        if (Math.pow(b, 2) - 4 * a * c < 0) {
            d = ("Вещественных корней уравнения: " + a + "x^2+" + b + "x+" + c + "=0 нет");
            return d;
        }
        if (Math.pow(b, 2) - 4 * a * c == 0) {
            d = ("Уравнение: " + a + "x^2+" + b + "x+" + c + "=0 имеет один корень");
            return d;
        }
        if (Math.pow(b, 2) - 4 * a * c > 0) {
            d = ("Уравнение: " + a + "x^2+" + b + "x+" + c + "=0 имеет два корня");
            return d;
        }
        return "Конец";
    }
}
