package lab14.task7297;

public class Interval {
    public int a;
    public int b;
public boolean contains(int l){
    if (b<a){
        IllegalArgumentException ex =
                new IllegalArgumentException("Нарушен интервал");
                throw ex;
        }
    if(l <= b && l >= a){
        return true;
    }
    else {
        return false;
    }
}
}
