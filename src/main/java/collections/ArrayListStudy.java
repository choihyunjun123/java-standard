package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListStudy {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        ArrayList<Integer> b = (ArrayList<Integer>) a.clone();
        b.add(3);
        b.add(4);
        b.retainAll(a);
        a.forEach(e -> System.out.println(e));
    }
}
