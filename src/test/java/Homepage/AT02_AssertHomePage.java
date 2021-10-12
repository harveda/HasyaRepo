package Homepage;

import BaseClass.OpenBrowser;
import org.junit.Test;

public class AT02_AssertHomePage {
    public void AssertHomePage(){
        String ExpectedTitle= OpenBrowser.driver.getTitle();
        System.out.println(ExpectedTitle);
    }
}
