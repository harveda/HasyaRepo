package LoopsNconditionalStatements;

import org.junit.Test;

public class AT06_ElseIf {
    @Test
    public void ElseIf01() {
        String browser = "IE";
        if (browser.equalsIgnoreCase("chrome")) {
            System.out.println("Test case will be executed on Chrome");

        } else if (browser.equalsIgnoreCase("Firefox")) {
            System.out.println("Test case will be executed on Firefox");
        } else if (browser.equalsIgnoreCase("IE")) {
            System.out.println("Test case will be executed on IE");
        } else {
            System.out.println("Browser is not in the List");
        }
    }
}
