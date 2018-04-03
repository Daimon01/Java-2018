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
}
