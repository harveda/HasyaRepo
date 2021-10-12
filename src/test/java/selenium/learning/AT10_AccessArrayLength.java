package selenium.learning;

import org.junit.Test;

public class AT10_AccessArrayLength {
    @Test
    public void test12() {
        int[] age = {10, 20, 30, 40, 50, 60};
        int j = age.length;
        System.out.println("length of array: "  +j);

        for (int i=0;i<j;i++){
            System.out.println("Array index: "+i+" Its value: " +age[i]);

    }



    }
}
