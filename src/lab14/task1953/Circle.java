package lab14.task1953;

public class Circle {
    public int x;
    public int y;
    public int r;
    public Circle(int x,int y,int r){
        this.x = x;
        this.y = y;
        this.r = r;
    }
    public Double area (){
        Double s =  (Math.PI * Math.pow(r,2));
        return s;
    }


    @Override
    public String toString() {
        return "Circle{" +
                "x=" + x +
                ", y=" + y +
                ", r=" + r +
                '}';
    }
}
