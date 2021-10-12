package LoopsNconditionalStatements;

import org.junit.Test;


public class AT03_WhileLoop {
    @Test
    public void WhileLoopLearn01(){
        int count=50;
        while(count<60){
            System.out.println("Value of count :"  + count);
            count++;
            System.out.println("Increment:"  + count);

        }
        System.out.println("Now i am out of the Loop");


    }

}
