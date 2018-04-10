package lab14.task2000;

public class Interval {
    private int a;
    private int b;
public Interval(int c, int d){
    if(c>d){
        throw new IllegalArgumentException("Некорректный интервал");
    }
    a = c;
    b = d;
}
public String print(){
    return "["+a+";"+b+"]";
}
public void slide(int e){
    a = a+e;
    b = b+e;
}
public void squeeze(int f){
    b = b-f;
    if(b-f < a){
        throw new IllegalArgumentException("Невозможно уменьшить интервал  на указанную длину");
    }
}
public int length(){
    return b-a;
}
}
