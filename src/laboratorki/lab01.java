package laboratorki;

public class lab01 {
    public static void task1860(String a) {
        System.out.println("Мы стремимся к " + a);
    }

    public static void task4764(String a) {
        System.out.println(a + " нас не остановят!");
    }
    public static void task2429(String a) {
        System.out.println("Программирование это " +a);
    }
    public static void task7472(String a, String b){
        System.out.println(b + " " + a);
    }
    public static void task2959(String a){
        System.out.println("SELECT first_name, last_name, group\n" +
                "FROM students WHERE student_id = '"+a+"'");
    }
    public static void task7271(Integer a, Integer b){
        System.out.println("INSERT INTO points (x, y) VALUES ('"+a+"', '"+b+"')");
    }
    public static void task2632(Integer a, Integer b, Integer c, String d){
        System.out.println("<circle cx=\""+a+"\" cy=\""+b+"\"\n" +
                "r=\""+c+"\" fill=\""+d+"\"/>");
    }
    public  static void task4343(String a, String b, String c, Integer d, String e){
    System.out.println("User ID="+a+";Password="+b+";\n" +
              "Host="+c+";Port="+d+";Database="+e+";");
    }
     public  static void task7474 (String a, String b, String c){
         System.out.println("Квадратное уравнение: "+a+"*x*x + "+b+"*x + "+c+" = 0\n" +
                 "Его дискриминант: d = "+b+"*"+b+" - 4*"+a+"*"+c);
     }

}
