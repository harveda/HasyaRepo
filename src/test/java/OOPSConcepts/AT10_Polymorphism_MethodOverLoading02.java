package OOPSConcepts;

import org.junit.Test;

public class AT10_Polymorphism_MethodOverLoading02 {
    @Test
    public void PolyOverCall(){
        AT09_Polymorphism_MethodOverLoading01 obj=new AT09_Polymorphism_MethodOverLoading01();
        obj.SumOfnum();
        obj.SumOfnum(10,20);
        obj.SumOfnum(50);

    }
}
