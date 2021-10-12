package LoopsNconditionalStatements;

import org.junit.Test;


public class AT04_DoWhileLoop {
    @Test
    public  void DoWhileLoop(){
        int ticket=75;
       do{
           System.out.println("Current ticket number is: "+ticket);
           ticket++;
       } while (ticket<80);


    }
}
