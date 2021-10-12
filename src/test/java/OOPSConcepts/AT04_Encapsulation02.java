package OOPSConcepts;

import org.junit.Test;

public class AT04_Encapsulation02 {
    @Test
    public void enMethod01() {
        AT03_Encapsulation01 obj = new AT03_Encapsulation01();
        int l = obj.enMethod01(30, 40);
        System.out.println(l);
        int a = l * 10;
        System.out.println(a);
    }

    @Test
    public void enMethod04() {
        AT03_Encapsulation01 obj = new AT03_Encapsulation01();
        int l = obj.enMethod02(70, 60);
        System.out.println(l);
        int a = l * 10;
        System.out.println(a);

    }
}