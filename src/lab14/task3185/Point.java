package lab14.task3185;

/**
 * @author akryukov
 *         13.07.2017
 */
public class Point {
    public int x;
    public int y;
    public double distanceTo(Point p){
        if(p == null){
            throw new IllegalArgumentException("Конечная точка не инициализирована");
        }
        int dx = p.x - this.x;
        int dy = p.y - this.y;
        return Math.sqrt(dx*dx + dy*dy);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Point point = (Point) o;

        if (x != point.x) return false;
        return y == point.y;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }
}
