package OOPSConcepts;

import org.junit.Test;

public class AT03_Encapsulation01 {
     @Test
    public int enMethod01(int i,int j){
        int k = i+j;
        System.out.println("value of k: "  +k);
        return k;

    }
    @Test
    public int enMethod02 (int i,int j){
         int p=i-j;
        System.out.println("value of k: "  +p);
        return p;

    }
}
