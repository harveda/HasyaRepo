package selenium.learning;

import io.github.bonigarcia.wdm.WebDriverManager;


import org.junit.Assert;
import org.junit.Test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;


public class AT03_NavigateToWebsite {



    @Test
    public void navigate(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
         options.addArguments("--ignore-ssl-errors=yes");
        options.addArguments("--start-maximised");
      WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.harveynorman.com.au");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
           System.out.println("Title of this page is:   "+driver.getTitle());
        String ActualTitle = driver.getTitle();
        String ExpectedTitle = ("Harvey Norman | Shop Online for Computers, Electrical, Furniture, Bedding, Bathrooms & Flooring | Harvey Norman Australia");
        Assert.assertEquals(ExpectedTitle, ActualTitle);
        Assert.assertTrue(ActualTitle.contains("Computers"));




    }
}
