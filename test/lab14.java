import lab14.task8403.Point;
import org.junit.Assert;
import org.junit.Test;

public class lab14 {
    @Test
    public void test8403case1(){
        Point p = new Point();
        p.x = 0;
        p.y = 0;
        double dist = p.distanceTo(4,3);
        Assert.assertEquals(5,dist,0.001);
    }
    @Test
    public void test8403case2(){
        Point p = new Point();
        p.x = 0;
        p.y = 0;
        Assert.assertEquals(0,p.distanceTo(0,0),0.0001);
    }
    @Test
    public void test8403case3(){
        Point p = new Point();
        p.x = 19;
        p.y = 23;
        Assert.assertEquals(12.8062,p.distanceTo(11,13),0.0001);
    }
}
