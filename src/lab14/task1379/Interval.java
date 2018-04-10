package lab14.task1379;

public class Interval {
    public int a;
    public int b;

    public void slide(int l) {
        a = a + l;
        b = b + l;
    }

    public String print(){
        if(a>b){
            IllegalStateException ex = new IllegalStateException("Корректность интервала была нарушена");
            throw ex;
        }
        return "Интервал успешно изменен \n ["+a+";"+b+"]";
    }
}
