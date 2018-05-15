package Lab15;

import java.util.ArrayList;
import java.util.HashSet;

public class Task5087 {
    public static ArrayList<Integer> list(String a) {
        String[] text = a.split(" ");
        ArrayList<Integer> data = new ArrayList<>();
        int i = 0;
        while (i < text.length) {
            data.add(Integer.parseInt(text[i]));
            i++;
        }
        return data;
    }

    public static HashSet<Integer> set(String a) {
        String[] text = a.split(" ");
        HashSet<Integer> data = new HashSet<>();
        int i = 0;
        while (i < text.length) {
            data.add(Integer.parseInt(text[i]));
            i++;
        }
        return data;
    }
}
