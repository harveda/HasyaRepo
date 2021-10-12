package Homepage;

import BaseClass.OpenBrowser;
import PropertiesFile.ReadPropertiesFile;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.io.IOException;

public class AT01_NavigateToWebsite {
    @Test
    public static void navigate() throws IOException {
        OpenBrowser.NavToWebsite("url");
        String ActualTitle = OpenBrowser.driver.getTitle();
        System.out.println(ActualTitle);
        String ExpectedTitle = ReadPropertiesFile.propFile("HomePageTitle");
        Assert.assertEquals(ExpectedTitle, ActualTitle);
    }

    @Test
    public static  void NavLoginscr() throws IOException {
        OpenBrowser.driver.findElement(By.xpath("/html/body/div[1]/div/header/div[1]/div/ul/li[6]/a")).click();



    }
}