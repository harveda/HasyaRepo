package LoopsNconditionalStatements;

import org.junit.Test;

public class AT05_IfElse {
    @Test
    public void ifElse01(){
        String browser="CHROME";
      if(browser.equalsIgnoreCase("chrome")){
          System.out.println("Test case will be Executed on Chrome");
      }
      else
      {
          System.out.println("Test case will be Executed on IE");

      }

    }
}
