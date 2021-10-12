package selenium.learning;
import org.junit.Test;

import java.util.ArrayList;

public class AT11_ArrayList {
    @Test
    public void test12() {
        ArrayList al = new ArrayList();
        al.add(10);
        al.add(11);
        al.add(12);
        al.add("Harika");
        al.add("Vedantam");
        al.add("Ram");
        System.out.println(al.size());

        for (int j = 0; j < al.size(); j++) {
            System.out.println("Array index: " + j + " Its value: " + al.get(j));

        }
    }
}