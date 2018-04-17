import lab14.task2662.Interval;
import lab14.task5449.Point;
import org.junit.Assert;
import org.junit.Test;

public class lab142 {
    @Test
    public void test5449case1() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 0);

        Assert.assertTrue(a.equals(b));
    }

    @Test
    public void test5449case2() {
        Point c = new Point(15, 17);
        Point d = new Point(15, 17);
        Assert.assertFalse(d == c);
    }

    @Test
    public void test5449case3() {
        Point f = new Point(83, 61);
        Point h = f;
        Assert.assertTrue(f == h);
    }

    @Test
    public void test5449case4() {
        Point i = new Point(13, 13);
        Assert.assertFalse(i.equals(null));
    }

    @Test
    public void test5449case5() {
        Point j = new Point(59, 59);
        Assert.assertFalse(j.equals("(59:59)"));
    }
    @Test
    public void test5449case6(){
        Point k = new Point(1097, 691);
        Assert.assertTrue(k.equals(k));
    }
    @Test
    public void test2662case1(){
        Interval i1 = new Interval(0, 15);
        Interval i2 = new Interval(15, 30);
        Assert.assertFalse(i1.equals(i2));
    }
    @Test
    public void test2662case2(){
        Interval i1 = new Interval(10, 20);
        Interval i2 = i1;
        Assert.assertTrue(i1 == i2);
    }
    @Test
    public void test2662case3(){
        Interval i1 = new Interval(50, 100);
        Interval i2 = new Interval(50, 100);
        Assert.assertFalse(i1 == i2);
    }
    @Test
    public void test2662case4(){
        Interval i = new Interval(13, 17);
        Assert.assertTrue(i.equals(i));
    }
    @Test
    public void test2662case5(){
        Interval i = new Interval(40, 73);
        Assert.assertFalse(i.equals(null));
    }
    @Test
    public void test2662case6(){
        Interval interval = new Interval(0, 1);
        Assert.assertFalse(interval.equals(Math.PI));
    }
}

