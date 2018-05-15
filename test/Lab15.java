import Lab15.Task5087;
import Lab15.Task9990;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Lab15 {
    @Test
    public void case1list() {
        String in = "1 2 3 4 1 2";
        ArrayList<Integer> out = Task5087.list(in);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 1, 2));
        Assert.assertEquals(expected, out);
        Assert.assertEquals(6, out.size());
    }

    @Test
    public void case2set() {
        String in = "1 2 3 4 1 2";
        HashSet<Integer> out = Task5087.set(in);
        HashSet<Integer> expected = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Assert.assertEquals(expected, out);
        Assert.assertEquals(4, out.size());
    }

    @Test
    public void case3set() throws FileNotFoundException {
        String name = "res/files/task9990/test1.txt";
        FileInputStream file = new FileInputStream(name);
        HashSet<String> out = Task9990.list(file);
        HashSet<String> expected = new HashSet<>(Arrays.asList("сталь", "медь", "железо", "алюминий", "ртуть", "золото"));
        Assert.assertEquals(expected, out);
    }

    @Test
    public void case4set() throws FileNotFoundException {
        String name = "сталь\nмедь\nжелезо\nалюминий\nртуть\nзолото";
        ByteArrayInputStream example = new ByteArrayInputStream(name.getBytes());
        HashSet<String> out = Task9990.list(example);
        HashSet<String> expected = new HashSet<>(Arrays.asList("сталь", "медь", "железо", "алюминий", "ртуть", "золото"));
        Assert.assertEquals(expected, out);
    }
}