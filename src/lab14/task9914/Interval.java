package lab14.task9914;

public class Interval {
    public int a;//5
    public int b;//15

    public boolean intersects(Interval r) {
        if(r == null){
            throw new IllegalArgumentException("Конечная точка не инициализирована");
        }
        if(a>b){
            throw new IllegalStateException("Корректность интервала была нарушена");
        }
        if(r.a> r.b) {
            throw new IllegalArgumentException("Некорректный интервал");
        }
        return r.a >= a && r.a <= b || r.b >= a && r.b <= b || a >=r.a && a<=r.b || b >= r.a && b <=r.b;
    }

}
