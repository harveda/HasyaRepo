package OOPSConcepts;

import org.junit.Test;

public class AT09_Polymorphism_MethodOverLoading01 {
    @Test
    public void SumOfnum(){
        int i=90;
        int j=20;
        System.out.println("This is SumOfNum First Method Value  : "+(i+j));
    }
    @Test
    public void SumOfnum(int i,int j){
        System.out.println("This is SumOfNum Second Method Value  : "+(i+j));
    }
    @Test
    public void SumOfnum(int i){
        System.out.println("This is SumOfNum Third Method Value  : " +i);

    }

}
