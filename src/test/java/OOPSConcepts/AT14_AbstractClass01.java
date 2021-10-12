package OOPSConcepts;

import org.junit.Test;

public abstract class AT14_AbstractClass01 {
    @Test
    public void addNum(){
        int x=10;
        int y=20;
        System.out.println("Addition of two numbers:  "+(x+y));
    }
    @Test
    public void subNum() {
        int x = 50;
        int y = 20;
        System.out.println("Subtraction of two numbers:  " + (x-y));
    }

    @Test
    public abstract void divNum();


}
