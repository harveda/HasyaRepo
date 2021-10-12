package IFrames.com;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.hssf.record.PageBreakRecord;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AT03_IframeLearning02 {




    @Test
    public void frames01() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--Ignore-ssl-errors=yes");
        options.addArguments("--Start-maximised");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.harveynorman.com.au/signup");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        List<WebElement> ListOfFrames=driver.findElements(By.tagName("iframe"));
        int ListSize= ListOfFrames.size();
        driver.switchTo().frame(0);
        driver.findElement(By.id("firstName")).sendKeys("Harika");
        driver.switchTo().frame(1);
        driver.switchTo().frame(2);
        System.out.println(ListSize = +ListSize);
        for(int i=0;i<ListSize;i++){
            driver.switchTo().frame(0);
            driver.findElement(By.id("firstName")).sendKeys("Harika");
          break;

        }

    }
}
