package IFrames.com;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class AT08_DropDownSelect {
    @Test
    public void SelectdropDown() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--Ignore-ssl-errors=yes");
        options.addArguments("--Start-maximised");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.harveynorman.com.au/apple-iphone-13-pro.html");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Select Colour = new Select(driver.findElement(By.id("attribute1066")));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Colour.selectByVisibleText("Blue");
        int j=Colour.getOptions().size();
        Colour.selectByIndex(1);
        for (int i=0;i<j;i++){
          String  CoName = Colour.getOptions().get(i).getText();
            System.out.println("value of   :"  +i);
            if (CoName.equalsIgnoreCase("Blue")){
                Colour.getOptions().get(i).click();
            }

        }

    }
}
