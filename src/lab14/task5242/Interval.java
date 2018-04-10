package lab14.task5242;

public class Interval {
    public int a;
    public int b;
    public String print(){
        if(b<a){
            IllegalStateException ex = new IllegalStateException("Корректность интервала была нарушена");
            throw ex;
        }
        return "["+a+";"+b+"]";
    }

}
