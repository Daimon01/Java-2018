package laboratorki;

public class lab04 {
    public static void task8495 (String a){
        for (int i = 0; i < 13; i++) {
            System.out.print(a);
        }
        System.out.println();
    }
    public static void task1315(int a){
        for (int i = a; i <= 47; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void task2475(long a){
        for (int i = 101; i <= 400; i++) {
            a = a + i;
        }
        System.out.println("\n"+a);
    }
    public static void task5951 (double a){
        for (int i = 21; i <= 40; i++) {
            a = Math.pow(a, 3) + Math.pow(i,3);
        }
        System.out.println(a);
    }
}
