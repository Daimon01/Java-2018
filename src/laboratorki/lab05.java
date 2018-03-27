package laboratorki;

public class lab05 {
    public static double task9020(int x) throws IllegalArgumentException {
        if (x > 61) {
            IllegalArgumentException ex = new IllegalArgumentException("x>61 не может быть");
            throw ex;
        }
        return 3 * Math.sqrt(61 - x);
    }

    public static double task7237(double a) {
        if (a < -273.15) {
            IllegalArgumentException ex = new IllegalArgumentException("Температура не может быть ниже -273,15");
            throw ex;
        }
        return a * 1.8 + 32;
    }

    public static double task3943(double a, double b) {
        if (b < 0) {
            IllegalArgumentException ex = new IllegalArgumentException("Значание b должно быть неотрицательным");
            throw ex;
        }
        if (a < 0 && a - 1 > Math.sqrt(b)) {
            IllegalArgumentException ex = new IllegalArgumentException("Подкоренное выражение должно быть не отрицательным");
            throw ex;
        }
        return -5 * Math.sqrt(a + Math.sqrt(b));
    }
}
